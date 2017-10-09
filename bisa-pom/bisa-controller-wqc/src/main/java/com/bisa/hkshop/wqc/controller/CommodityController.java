package com.bisa.hkshop.wqc.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bisa.hkshop.model.Appraise;
import com.bisa.hkshop.model.Commodity;
import com.bisa.hkshop.model.Package;
import com.bisa.hkshop.wqc.basic.dao.StringUtil;
import com.bisa.hkshop.wqc.basic.model.Pager;
import com.bisa.hkshop.wqc.service.IAppraiseService;
import com.bisa.hkshop.wqc.service.ICommodityService;
import com.bisa.hkshop.wqc.service.IPackageService;


@Controller
@RequestMapping("/l")
public class CommodityController {
	@Autowired
	private ICommodityService iCommodityService;

	@Autowired
	private IPackageService IPackageService;
	@Autowired
	private IAppraiseService IAppraiseService;
	/**
	 *  获取所有商品列表(带分页)
	 */
	@RequestMapping(value = "/shopping", method = RequestMethod.GET)
	public String requestReport(String sort, String order,Model model,HttpServletRequest request){
		
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
	/**
	 * 查看用户评价
	 */
	@RequestMapping(value="/shopping/Uappraise",method=RequestMethod.GET)
	public String Uappraise(HttpServletRequest request,Model model) {
		String productId=request.getParameter("productId");
		String appraise_more=request.getParameter("appraise_more");
		//用来区别是第一次加载还是第二次加载
			Commodity commodity=iCommodityService.getcommodity(productId);
			int product_guid=commodity.getProduct_guid();
			List<Appraise> appraise=IAppraiseService.loadAppraiseList(product_guid);
			Pager<Appraise> appraisePager=new Pager<Appraise>();
			appraisePager.setDatas(appraise);
			appraisePager.setSize(2);
			appraisePager.setTotal(appraise.size());
			appraisePager.getOffset();
			model.addAttribute("productDto", appraisePager);
			Commodity comm=iCommodityService.getcommodity(productId);
			model.addAttribute("comm", comm);
			return "shopping/Uappraise";
		}
	}

	

