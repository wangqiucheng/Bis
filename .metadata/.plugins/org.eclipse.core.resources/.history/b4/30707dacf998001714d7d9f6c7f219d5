package com.bisa.hkshop.wqc.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.model.Product;
import com.bisa.hkshop.model.Package;
import com.bisa.hkshop.model.SystemContext;
import com.bisa.hkshop.wqc.basic.dao.StringUtil;
import com.bisa.hkshop.wqc.basic.model.Pager;

import com.bisa.hkshop.wqc.service.ICommodityService;
import com.bisa.hkshop.wqc.service.IPackageService;
import com.bisa.hkshop.wqc.service.IProductService;

@Controller

public class CommodityController {
	@Autowired
	private ICommodityService iCommodityService;
	@Autowired
	private IProductService ProductService;
	@Autowired
	private IPackageService IPackageService;
	/**
	 *  获取所有商品列表(带分页)
	 */
	@RequestMapping(value = "/shopping", method = RequestMethod.GET)
	public String requestReport(String sort, String order,Model model,HttpServletRequest request){
		//SystemContext.setSort("desc");
		SystemContext.setOrder("updatime");
		Pager<Commodity> cpager = iCommodityService.getselCommodityPage();
		System.out.println("========"+cpager);
		model.addAttribute("cpager", cpager);
		return "shopping/shopping";
	}
	/**
	 * 根据商品id获取商品详情
	 * @return
	 */
	@RequestMapping(value="/shopping/getCommodityId",method=RequestMethod.GET)
	public String getCommodityId(HttpServletRequest request,Model model) {
		String shop_Number=request.getParameter("shop_number");
		Commodity commodity = iCommodityService.getcommodity(shop_Number);
		model.addAttribute("commodity", commodity);
		List<Commodity> listproduct=iCommodityService.selthreeCon(shop_Number);
		model.addAttribute("listproduct", listproduct);
		List<Package> pack=IPackageService.getpackage(shop_Number);
		model.addAttribute("pack", pack);
		//悉心服务
		Commodity comm = iCommodityService.getcommodity("4001");
		model.addAttribute("comm", comm);
		return "shopping/product";
		
	}

	/**
	 * 添加商品
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/shopping/addCommodity",method=RequestMethod.POST)
	public String addCommmodity(HttpServletRequest request,Model model) {
		return null;
	}
	/**
	 * 修改商品
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/shopping/updateCommodity",method=RequestMethod.POST)
	public String updateCommmodity(HttpServletRequest request,Model model) {
		
		return null;
	}
	/**
	 * 删除商品
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/shopping/delCommodity",method=RequestMethod.POST)
	public String delCommmodity(HttpServletRequest request,Model model) {
		return null;
	}
	
}
