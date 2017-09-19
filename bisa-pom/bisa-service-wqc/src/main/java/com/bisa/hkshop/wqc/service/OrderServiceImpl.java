package com.bisa.hkshop.zj.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bisa.hkshop.model.Cart;
import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.model.Package;
import com.bisa.hkshop.wqc.dao.ICommodityDao;
import com.bisa.hkshop.wqc.dao.IPackageDao;
import com.bisa.hkshop.zj.basic.model.OrderDetailDto;
import com.bisa.hkshop.zj.basic.utility.GuidGenerator;
import com.bisa.hkshop.zj.dao.IOrderDao;
import com.bisa.hkshop.zj.dao.IOrderDetailDao;
import com.bisa.hkshop.zj.dao.IShopCarDao;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private IShopCarDao shopCarDao;
	
	@Autowired
	private IOrderDao orderDao;
	
	@Autowired
	private ICommodityDao commodityDao;
	
	@Autowired
	private IPackageDao packageDao;
	
	@Autowired
	private IOrderDetailDao orderDetailDao;
	

	@Override
	public List<Order> loadOrderList(String username) {
		
		return orderDao.loadOrderList(username);
	}

	@Override
	public Order loadOrderByname(String username) {
		
		return orderDao.loadOrderByname(username);
	}

	@Override
	public Order loadOrderByOrderId(String orderId) {
		return orderDao.loadOrderByOrderId(orderId);
	}

	@Override
	public Boolean addOrder(Order order) {
		return orderDao.addOrder(order);
	}

	@Override
	public Boolean updateOrder(Order order) {
		return orderDao.updateOrder(order);
	}
	
	
	//根据购物车的商品信息生成订单
	public Order addCarOrder(List<OrderDetailDto> orderList,String addr_num,String username){
		
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		String orderGuid = GuidGenerator.generate();
		
		String num = "";
		for(int i=0;i<orderList.size();i++){
			if(i==0){
				num =  num + orderList.get(i).getCartid();
			}else{
				num = num + orderList.get(i).getCartid();
			}
		}
		System.out.println(">>>>>>>>>>>:num:" + num);
		//查出购物车中的要买的东西
		List<Cart> car = shopCarDao.loadCarList(num);
		
		if(car==null){
			return new Order();
		}
		
		double price = 0;
		//处理订单信息，添加订单中的具体的商品细节，并且删除购物车中的物品
		for(Cart orderCar : car){
			price = price + orderCar.getTotal();
			OrderDetail orderDetail = new OrderDetail();
			//添加订单细节表
			orderDetail.setOrder_detail_guid(GuidGenerator.generate());
			orderDetail.setOrder_no(orderGuid);
			orderDetail.setPic(orderCar.getMain_picture());
			orderDetail.setProduct_name(orderCar.getTitle());
			orderDetail.setAscription(orderCar.getSing_cox());
			orderDetail.setAscription_guid(orderCar.getPackId());
			orderDetail.setCount(orderCar.getNumber());
			orderDetail.setStart_time(format.format(date));
			orderDetailDao.addOrderDetail(orderDetail);
			//删除购物车中的当前商品
			shopCarDao.deteleCar(orderCar.getPackId());			
		}
		
		Order order = new Order();
		//order.setId(1);
		order.setOrder_no(orderGuid);
		order.setAddr_num(addr_num);
		
		if(price<350){
			order.setPrice(price+30 + "");
		}else{
			order.setPrice(price+"");
		}
		order.setUser_guid(username);
		order.setTra_status(1);//未付款
		order.setStart_time(format.format(date));
		order.setEffective_statu(1);
		orderDao.addOrder(order);
		return order;
	}
	
	//从根据商品信息生成订单信息
	public Order addProductOrder(List<OrderDetailDto> orderList,String addr_num,String username){
		Date date = new Date();
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		
		String orderGuid = GuidGenerator.generate();
		
		double price = 0;
		
		
		for(int i=0;i<orderList.size();i++){
			OrderDetailDto orderDetailDto = orderList.get(i);
			//判断是套餐还是商品,0是单品，1是套餐，2是服务
			if(orderDetailDto.getCartkind()=="1"){
				Package pa = packageDao.getpackages(orderDetailDto.getCartid());
				  //处理订单信息，添加订单中的具体的商品细节，并且删除购物车中的物品
				price = price + pa.getPrice() * Integer.valueOf(orderDetailDto.getCartnum());
				OrderDetail orderDetail = new OrderDetail();
				//添加订单细节表
				orderDetail.setOrder_detail_guid(GuidGenerator.generate());
				orderDetail.setOrder_no(orderGuid);
				orderDetail.setPic(pa.getMain_picture());
				orderDetail.setProduct_name(pa.getPackage_name());
				orderDetail.setAscription("1");
				orderDetail.setAscription_guid(pa.getPackage_number());
				orderDetail.setCount(Integer.valueOf(orderDetailDto.getCartnum()));
				orderDetail.setStart_time(format.format(date));
				orderDetailDao.addOrderDetail(orderDetail);
			}else{
				Commodity pro = commodityDao.getcommodity(orderDetailDto.getCartid());
				  //处理订单信息，添加订单中的具体的商品细节，并且删除购物车中的物品
				price = price + pro.getSelling_price() * Integer.valueOf(orderDetailDto.getCartnum());
				OrderDetail orderDetail = new OrderDetail();
				//添加订单细节表
				orderDetail.setOrder_detail_guid(GuidGenerator.generate());
				orderDetail.setOrder_no(orderGuid);
				orderDetail.setPic(pro.getMain_picture());
				orderDetail.setProduct_name(pro.getTitle());
				orderDetail.setAscription("0");
				orderDetail.setAscription_guid(pro.getShop_number());
				orderDetail.setCount(Integer.valueOf(orderDetailDto.getCartnum()));
				orderDetail.setStart_time(format.format(date));
				orderDetailDao.addOrderDetail(orderDetail);
			}
		}
		 
		
		Order order = new Order();
		order.setId(1);
		order.setOrder_no(orderGuid);
		order.setAddr_num(addr_num);
		order.setPrice(price + "");
		order.setUser_guid(username);
		order.setTra_status(1);//未付款
		order.setStart_time(format.format(date));
		orderDao.addOrder(order);
		return order;
	}

	
	
}
