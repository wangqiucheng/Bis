<%@page language="java"  import="java.util.*" pageEncoding="utf-8"%>  
<%-- <%@page import="com.bisa.hkshop.model.User"%> --%>
<%-- <%@page import="com.bisa.hkshop.wqc.service.ICartService"%> --%>
  
    <header class="clear full-w min-h-120">
    <div class="container">
        <div class="col-xs-2 pt-35 pb-35 pl-0 pr-0">
            <img src="<%=request.getContextPath() %>/resources/img/index/logov1.png" alt="">
        </div>
        <div class="clear col-xs-10 pl-0 pr-0">
            <div class="col-xs-12 pt-20 pl-0 pr-0">
                <ul class="clear h-30 line-h-30 pull-right">
                    <li class="pull-left pr-10"><a class="col-333 hovecol-black" href="">注册</a></li>
                 <!--   <input type="hidden" name="guid" value="wc">  -->
                    <li class="pull-left pr-10"><a class="col-333 hovecol-black" href=""><!--登录  -->小明</a></li>
                    <li class="pull-left pr-10"><a class="col-333 hovecol-black" href="">简</a></li>
                    <li class="pull-left pr-10"><a class="col-333 hovecol-black" href="">繁</a></li>
                    <li class="pull-left pr-5 col-3    33 cur-d hovecol-black">
                    <a href="<%=request.getContextPath() %>/Cart">
                    <i class="icon-shopping-cart pr-5 f-14 col-333 hovecol-black"></i>
                       	 购物车(		
                   <%--  	<% 
                    		session.setAttribute("user", "wc");
	                    	User user= session.getAttribute("user");
                    		String userId=user.getId();
                    		int cartNum=ICartService.selCartNum(userId);
	                    	if(cartNum!=0){
                    	%>
                    		<a class="col-333 count-cartnum" href="<%=request.getContextPath() %>/Cart?&userId=wc"><%=cartNum %></a>	
                    	<% 	
                    		}else{
                    	%>
                    --> 
                    	<a class="col-333 count-cartnum" href="<%=request.getContextPath() %>/Cart?&userId=wc">0</a>
						<%
                    		}
						%>
					--%>
					<a class="col-333 count-cartnum" href="<%=request.getContextPath() %>/Cart">0</a>
                    )
                    </a>
                    </li>
                    <li class="pull-left pr-5 pl-5 bg-eee hovebg-ddd mainsearch">
                        <input type="text" class="h-26 line-h-26 w-100 mt--2 mb-2 bor bor-col-ccc dis-n mainsearchinput">
                        <span class="col-333 t-nonehove cur-p" href=""><i class="icon-search pr-5 f-14"></i>搜索</span>
                    </li>
                </ul>
            </div>
            <div class="col-xs-12 pt-15 pl-0 pr-0">
                <ul class="col-xs-10 clo-md-9 pull-left mainnav clear dis-ib pl-0 pr-0">
           
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7 navborpitch" href="<%=request.getContextPath() %>/index">首页</a></li>
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7" href="">关于碧沙</a></li>
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7" href="<%=request.getContextPath() %>/shopping">网上商城</a></li>
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7" href="">健康咨询</a></li>
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7" href="">购物指南</a></li>
                    <li class="col-xs-2 text-center f-14 cur-p pd-10 f-w"><a class="col-309DE2 t-nonehove pb-7" href="">联系我们</a></li>
                </ul>
            </div>
        </div>
    </div>
    </header>
    
  