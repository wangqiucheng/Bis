package com.bisa.hkshop.wqc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bisa.hkshop.wqc.service.ICommodityService;

@Controller
public class IndexController {

	@Autowired
	private ICommodityService ICommodityService;
	

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String requestReport(Model model){
		/*List<Commodity> cm=	ICommodityService.getcommodity();
		model.addAttribute("cm",cm);*/
		return "index";
	}
}
