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
import com.bisa.hkshop.wqc.basic.dao.SystemContext;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.dao.ICommodityDao;
import com.bisa.hkshop.wqc.service.ICommodityService;
import com.bisa.hkshop.wqc.service.IProductService;

@Controller

public class CommodityController {
	@Autowired
	private ICommodityService iCommodityService;
	@Autowired
	private IProductService ProductService;
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
		List<Product> product=ProductService.getProduct(shop_Number);
		System.out.println("=======product"+product);
	//	model.addAttribute("product", product);
		List<Commodity> list=new ArrayList<Commodity>();
		Iterator it = product.iterator();
		Commodity shopNub=null;
		while(it.hasNext()){
			Product pro = (Product) it.next();
			String assistant=pro.getAssistant();
			shopNub=iCommodityService.getcommodity(assistant);
			list.add(shopNub);
			
		}
		//System.out.println("============="+list.size());
		model.addAttribute("list", list);
		return "shopping/product";
		
	}
	
	/**
	 * 获取所有商品列表(带分页)，其中包括是否根据分类，标题搜索
	 * @return
	 */
	@RequestMapping(value="/shopping/getCommodity",method=RequestMethod.GET)
	public String getCommmodity(HttpServletRequest request,Model model) {
		
		//SystemContext.setOrder("asc");//desc
		//SystemContext.setSort("time");
		//SystemContext.setPageSize(5);
		//SystemContext.setPageOffset(1);
	//	Pager<Commodity> cpager = iCommodityDao.getselCommodityPage();
		
		
		return null;
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