package com.bisa.hkshop.wqc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bisa.hkshop.model.Order;
import com.bisa.hkshop.model.OrderDetail;
import com.bisa.hkshop.model.SystemContext;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.service.IUserOrderDetailService;
import com.bisa.hkshop.wqc.service.IUserOrderService;

@Controller
public class UserAppraiseController {
	@Autowired
	private IUserOrderService IUserOrderService;
	@Autowired
	private IUserOrderDetailService IUserOrderDetailService;
	
	@RequestMapping(value = "/useAppraise", method = RequestMethod.GET)
	public String useAppraise(HttpServletRequest request,Model model,HttpSession session) throws Exception{
		session.setAttribute("guid", "wc");
		String guid=(String) session.getAttribute("guid");
		if(!"wc".equals(guid)) {
			System.out.println("请去登录");
			return null;
		}else {
			List<OrderDetail> listordertails=new ArrayList<OrderDetail>();
			List<Order> listorder=new ArrayList<Order>();
			//listordertails=IUserOrderDetailService.loadList();
			
			return "user/useAppraiseList";
		}
	}
}
