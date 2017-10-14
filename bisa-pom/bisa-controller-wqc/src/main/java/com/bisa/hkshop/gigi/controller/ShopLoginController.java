package com.bisa.hkshop.gigi.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bisa.health.model.UInfo;
import com.bisa.health.model.User;



/***
 * 登入接口
 * @author Administrator
 *
 */
@RequestMapping(value = "l")
@Controller
public class ShopLoginController {
	
	/**
	 * 登录请求地址
	 */
	@Value("${login.url}")
	private String login_url;
	
	/**
	 *注册请求地址
	 */
	@Value("${login.url}")
	private String register_url;
	

	/**
	 * 注册入口
	 * @return
	 */
	@RequestMapping(value = "/hkshopRegister", method = RequestMethod.GET)
	public String hkshopRegister(Model model,HttpServletRequest request,@RequestParam(value="isRegister",required=true) String isRegister) {
		/*
		 * 登录成功
		 */
		System.out.println("是否注册：" +isRegister);
		/**
		 * 注册成功，弹出登录窗口，“您已注册成功，请登录！”
		 */
		if(isRegister.equals("yes")){
			model.addAttribute("message", "您已注册成功，请登录！");
			return login_url;
		}else{
			/**
			 * 注册失败，返回注册页面
			 */
			model.addAttribute("message", "您尚未注册成功，请重新注册！");
			return register_url;
		}
		
		
		//return "redirect:"+request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+"/bisa-appwebserver/l/login";
	}

	/**
	 * 登录入口
	 */
	@RequestMapping(value = "/hkshopLogin", method = RequestMethod.GET)
	public String hkshopLogin(Model model,HttpServletRequest request,HttpServletResponse response,@RequestParam(value="isLogin",required=false) String isLogin) {
		/*
		 * 登录成功
		 */
		System.out.println("是否登入：" +isLogin);
		if(isLogin==null||isLogin.equals("null")||isLogin.isEmpty()||isLogin.equals("no")){
			System.out.println("又是》》》》login_url");
			return login_url;
		}else{
			System.out.println("shop_login>>>>>>>>>>>>>>>");
			Session isSession = SecurityUtils.getSubject().getSession();
			UInfo userInfo =(UInfo) isSession.getAttribute("userInfo");
			
			User user = (User) isSession.getAttribute("user");
			if(userInfo != null){
				model.addAttribute("userInfo", userInfo);
			}else{
				if(user!=null){
					System.out.println("username:"+user.getUsername());
					model.addAttribute("username", user.getUsername());
				}else{
					model.addAttribute("username", "已登入");
				}
			}
			return "redirect:/user/user_index";
		}
	}
	
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		return login_url;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(){
		return register_url;
	}
}
