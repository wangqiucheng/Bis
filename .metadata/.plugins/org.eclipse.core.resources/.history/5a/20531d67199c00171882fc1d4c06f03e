package com.bisa.hkshop.wqc.controller;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.model.Product;
import com.bisa.hkshop.wqc.service.ICommodityService;
import com.bisa.hkshop.wqc.service.IProductService;


@Controller

public class ProductController {
	@Autowired
	private ICommodityService CommodityService;
	@Autowired
	private IProductService ProductService;

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String requestReport(HttpServletRequest request,Model model){
		/*
		String shop_Number=request.getParameter("shop_number");
		Commodity commodity = CommodityService.getcommodity(shop_Number);
		model.addAttribute("commodity", commodity);
		List<Product> product=ProductService.getProduct(shop_Number);
		System.out.println("=======product"+product);
	//	model.addAttribute("product", product);
		List<Commodity> list=new ArrayList<Commodity>();
		Iterator it = product.iterator();
		Commodity shopNub=null;
		while(it.hasNext()){
			Product pro = (Product) it.next();
			String assistant=pro.getAssistant();
			shopNub=CommodityService.getcommodity(assistant);
			list.add(shopNub);
			
		}
		//System.out.println("============="+list.size());
		model.addAttribute("list", list);*/
		return "shopping/product";
	}
	

}
