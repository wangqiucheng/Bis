package com.bisa.hkshop.wqc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoingController {
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String requestReport(){
		return "login";
	}
}