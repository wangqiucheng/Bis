package com.bisa.hkshop.wqc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class OrderController {

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String requestReport(){
		return "shopping/order";
	}
	
}
