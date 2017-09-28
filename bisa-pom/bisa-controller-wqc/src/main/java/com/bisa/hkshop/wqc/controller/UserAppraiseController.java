package com.bisa.hkshop.wqc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bisa.health.entity.SystemContext;
import com.bisa.hkshop.model.Appraise;
import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.basic.utility.GuidGenerator;
import com.bisa.hkshop.wqc.service.IAppraiseService;
import com.bisa.hkshop.wqc.service.IUserOrderDetailService;
import com.bisa.hkshop.wqc.service.IUserOrderService;

@Controller
public class UserAppraiseController {
	@Autowired
	private IUserOrderService IUserOrderService;
	@Autowired
	private IUserOrderDetailService IUserOrderDetailService;
	@Autowired
	private IAppraiseService IAppraiseService;
	
	@RequestMapping(value = "/useAppraise", method = RequestMethod.GET)
	public String useAppraise(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
			List<OrderDetail> listordertails=new ArrayList<OrderDetail>();
			List<OrderDetail> ordertails=new ArrayList<OrderDetail>();
			List<Order> listorder=new ArrayList<Order>();
			Pager<OrderDetail> odtail=new Pager<OrderDetail>();
			SystemContext.setSort("start_time");
			SystemContext.setOrder("desc");
			listorder=IUserOrderService.Ordertra_statusList(user_guid,30,1);
			listordertails=IUserOrderDetailService.pageuserdetails(user_guid, 1);
			for(OrderDetail od: listordertails) {
				for(Order o:listorder) {
					if(od.getOrder_no().equals(o.getOrder_no())){
						ordertails.add(od);

					}
				 }
			}
			odtail.setTotal(ordertails.size());
			odtail.setDatas(ordertails);
			model.addAttribute("odtail",odtail);
			return "user/useAppraiseList";
		}
	}
	@RequestMapping(value = "/useAppraise1", method = RequestMethod.GET)
	public String useAppraise1(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
			List<OrderDetail> listordertails=new ArrayList<OrderDetail>();
			listordertails=IUserOrderDetailService.pageuserdetails(user_guid, 0);
			Pager<OrderDetail> odpingjia=new Pager<OrderDetail>();
			SystemContext.setSort("start_time");
			SystemContext.setOrder("desc");
			
			odpingjia.setTotal(listordertails.size());
			odpingjia.setDatas(listordertails);
			model.addAttribute("odpingjia",odpingjia);
		}
		return "user/useAppraiseList";
	}
	
	@RequestMapping(value = "/useAppraise2", method = RequestMethod.GET)
	public String useAppraise2(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "10");
		String guid=(String) session.getAttribute("guid");
		int user_guid=Integer.parseInt(guid);
		if(user_guid!=10) {
			System.out.println("请去登录");
			return null;
		}else {
			List<OrderDetail> listordertails=new ArrayList<OrderDetail>();
			List<Order> listorder=new ArrayList<Order>();
			List<OrderDetail> odtas=new ArrayList<OrderDetail>();
			listorder=IUserOrderService.Ordertra_statusList(user_guid,30,2);
			listordertails=IUserOrderDetailService.getOrderDetail(user_guid);
			Pager<OrderDetail> odtail=new Pager<OrderDetail>();
			SystemContext.setSort("start_time");
			SystemContext.setOrder("desc");
			for(OrderDetail od: listordertails) {
				for(Order o:listorder) {
					if(od.getOrder_no().equals(o.getOrder_no())){
						odtas.add(od);

					}
				 }
			}
			odtail.setTotal(odtas.size());
			odtail.setDatas(odtas);
			model.addAttribute("odtas",odtail);
		}
		return "user/useAppraiseList";
	}
	
	
	@RequestMapping(value = "/goAppraise", method = RequestMethod.GET)
	public String goAppraise(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		String order_detail_guid=request.getParameter("detail_guid");
		OrderDetail od=IUserOrderDetailService.loadOrderDetail(order_detail_guid);
		model.addAttribute("od", od);
		return "user/userAppraiseInfo";
	}
	@RequestMapping(value = "/addAppraise", method = RequestMethod.POST)
	@ResponseBody
	public String addAppraise(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		String appraise_one=request.getParameter("appraise_one");
		String appraise_degree=request.getParameter("appraise_degree");
		String order_detail_guid=request.getParameter("order_detail_guid");
		OrderDetail od=IUserOrderDetailService.loadOrderDetail(order_detail_guid);
		String main_picture=od.getPic();
		Double price=od.getPrice();
		String title=od.getProduct_name();
		String product_number=od.getAscription_guid();
		int user_guid=od.getUser_guid();
		session.setAttribute("userImg", "/img/user/Appraise/appraise-portraitv3.png");
		String userImg=(String) session.getAttribute("userImg");
		//把值设置进评价信息
		Appraise appraise=new Appraise();
		appraise.setAppraise_no(GuidGenerator.generate());
		appraise.setAppraise_degree(appraise_degree);
		appraise.setAppraise_one(appraise_one);
		appraise.setAppraise_status("1");
		appraise.setInsert_time(new Date());
		appraise.setUpdate_time(new Date());
		appraise.setMain_picture(main_picture);
		appraise.setOrder_detail_guid(order_detail_guid);
		appraise.setTitle(title);
		appraise.setProduct_number(product_number);
		appraise.setUser_guid(user_guid);
		appraise.setUserImg(userImg);
		appraise.setPrice(price);
		IAppraiseService.addAppraise(appraise);
		//把订单详情 的状态改变，成已评价的商品
		OrderDetail ods=IUserOrderDetailService.loadOrderDetail(order_detail_guid);
		ods.setAppraise_isnot(0);
		IUserOrderDetailService.updateActive(ods);
		return "success";
	}
	@RequestMapping(value = "/AppraiseSuccess", method = RequestMethod.GET)
	public String AppraiseSuccess(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		String order_detail_guid=request.getParameter("order_detail_guid");
		Appraise appraise=IAppraiseService.loadAppraise(order_detail_guid);
		model.addAttribute("appraise", appraise);
		return "user/userAppraiseSuceess";
		
	}
	@RequestMapping(value = "/selAppraise", method = RequestMethod.GET)
	public String selAppraise(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		String order_detail_guid=request.getParameter("order_detail_guid");
		Appraise productDto=IAppraiseService.loadAppraise(order_detail_guid);
		model.addAttribute("productDto", productDto);
		return "user/userAppraise";
		
	}
}
