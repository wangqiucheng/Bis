package com.bisa.hkshop.wqc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bisa.hkshop.wqc.service.IUserOrderDetailService;
import com.bisa.hkshop.wqc.service.IUserOrderService;
import com.bisa.health.entity.SystemContext;
import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.model.OrderDetail;

import com.bisa.hkshop.wqc.basic.model.Pager;

@Controller
public class UserOrderController {

	@Autowired
	private IUserOrderService iUserOrderService;
	@Autowired
	private IUserOrderDetailService IUserOrderDetailService;
	
	@RequestMapping(value = "/userOrder", method = RequestMethod.GET)
	public String userOrder(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
				//查询订单带分页
				Pager<Order> orderList=null;
				SystemContext.setSort("start_time");
				SystemContext.setOrder("desc");
				orderList=iUserOrderService.selPaOrder(user_guid);
				//查询订单细节
				List<Order> orderList2=iUserOrderService.loadOrderList(user_guid);
				Map<String,List<OrderDetail>> map= new HashMap<String,List<OrderDetail>>();  
				List<OrderDetail> listordertails=new ArrayList<>(); //
				for(Order o:orderList2) {
					String oi=o.getOrder_no();
					listordertails=IUserOrderDetailService.loadOrderDetailList(user_guid,oi);
					map.put(oi, listordertails);		
				}
				model.addAttribute("listordertails", map);
				model.addAttribute("orderList", orderList);
				model.addAttribute("orderList2", orderList2);
				//查询其他状态的总数
				Pager<Order> orderList5=null;
				SystemContext.setSort("start_time");
				SystemContext.setOrder("desc");
				orderList5=iUserOrderService.seltra_status1(user_guid,10);
				long oListnum1=orderList5.getTotal();
				model.addAttribute("oListnum1", oListnum1);

				Pager<Order> orderList3=null;
				SystemContext.setSort("start_time");
				SystemContext.setOrder("desc");
				orderList3=iUserOrderService.seltra_status4(user_guid, 2);
				long oListnum2=orderList3.getTotal();
				model.addAttribute("oListnum2", oListnum2);
				 
				Pager<Order> orderList4=null;
				SystemContext.setSort("start_time");
				SystemContext.setOrder("desc");
				orderList4=iUserOrderService.seltra_status1(user_guid,50);
				long oListnum3=orderList4.getTotal();
				 model.addAttribute("oListnum3", oListnum3);
			return "user/userOrder";
		}
	}
	@RequestMapping(value = "/userOrder1", method = RequestMethod.GET)
	public String userOrder1(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
		//查询订单待支付
		Pager<Order> orderList5=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList5=iUserOrderService.seltra_status1(user_guid,10);
		 long oListnum1=orderList5.getTotal();
		 model.addAttribute("oListnum1", oListnum1);
		model.addAttribute("orderList5", orderList5);
		List<Order> orderList2=iUserOrderService.Otra_effective_statu(user_guid,10,1);
	//	List<Order> orderList2=iUserOrderService.Ordertra_statusList(user_guid,10,1);
		Map<String,List<OrderDetail>> map= new HashMap<String,List<OrderDetail>>();  
		List<OrderDetail> listordertails=new ArrayList<>(); //
		for(Order o:orderList2) {
			String oi=o.getOrder_no();
			listordertails=IUserOrderDetailService.loadOrderDetailList(user_guid,oi);
			map.put(oi, listordertails);		
		}
		model.addAttribute("listordertails", map);
		//查询其他的状态
		Pager<Order> orderList3=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList3=iUserOrderService.seltra_status4(user_guid, 2);
		long oListnum2=orderList3.getTotal();
		model.addAttribute("oListnum2", oListnum2);
		 
		Pager<Order> orderList4=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList4=iUserOrderService.seltra_status1(user_guid,50);
		long oListnum3=orderList4.getTotal();
		 model.addAttribute("oListnum3", oListnum3);
		 
		return "user/userOrder";
		}
	}
	@RequestMapping(value = "/userOrder2", method = RequestMethod.GET)
	public String userOrder2(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
		//查询订单待收货
		Pager<Order> orderList3=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList3=iUserOrderService.seltra_status4(user_guid, 2);
		long oListnum2=orderList3.getTotal();
		 model.addAttribute("oListnum2", oListnum2);
		model.addAttribute("orderList3", orderList3);
		List<Order> orderList2=iUserOrderService.Ordertra_statusList2(user_guid,2);
		Map<String,List<OrderDetail>> map= new HashMap<String,List<OrderDetail>>();  
		List<OrderDetail> listordertails=new ArrayList<>(); //
		for(Order o:orderList2) {
			String oi=o.getOrder_no();
			listordertails=IUserOrderDetailService.loadOrderDetailList(user_guid,oi);
			map.put(oi, listordertails);		
		}
		model.addAttribute("listordertails", map);
		
		//查询其他状态的总数
		Pager<Order> orderList5=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList5=iUserOrderService.seltra_status1(user_guid,10);
		long oListnum1=orderList5.getTotal();
		model.addAttribute("oListnum1", oListnum1);
		
		Pager<Order> orderList4=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList4=iUserOrderService.seltra_status1(user_guid,50);
		long oListnum3=orderList4.getTotal();
		 model.addAttribute("oListnum3", oListnum3);
		 
		return "user/userOrder";
		}
	}
	@RequestMapping(value = "/userOrder3", method = RequestMethod.GET)
	public String userOrder3(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
		//查询订单待支付
		Pager<Order> orderList4=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList4=iUserOrderService.seltra_status1(user_guid,50);
		long oListnum3=orderList4.getTotal();
		 model.addAttribute("oListnum3", oListnum3);
		model.addAttribute("orderList4", orderList4);
		List<Order> orderList2=iUserOrderService.Ordertra_statusList(user_guid,50,1);
		Map<String,List<OrderDetail>> map= new HashMap<String,List<OrderDetail>>();  
		List<OrderDetail> listordertails=new ArrayList<>(); 
		for(Order o:orderList2) {
			String oi=o.getOrder_no();
			listordertails=IUserOrderDetailService.loadOrderDetailList(user_guid,oi);
			map.put(oi, listordertails);		
		}
		model.addAttribute("listordertails", map);
		//查询其他的状态
		Pager<Order> orderList5=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList5=iUserOrderService.seltra_status1(user_guid,10);
		long oListnum1=orderList5.getTotal();
		model.addAttribute("oListnum1", oListnum1);

		Pager<Order> orderList3=null;
		SystemContext.setSort("start_time");
		SystemContext.setOrder("desc");
		orderList3=iUserOrderService.seltra_status4(user_guid, 2);
		long oListnum2=orderList3.getTotal();
		model.addAttribute("oListnum2", oListnum2);
		return "user/userOrder";
		}
	}
}
