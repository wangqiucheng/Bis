package com.bisa.hkshop.wqc.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bisa.hkshop.wqc.service.ICommodityService;


@Controller

public class ProductController {
	@Autowired
	private ICommodityService CommodityService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String requestReport(HttpServletRequest request,Model model){
		return "shopping/product";
	}
	

}
