<%@ page language="java"  pageEncoding="UTF-8"%>
<%@page import="com.bisa.hkshop.wqc.basic.dao.SystemContext"%>
<%@ include file="../comm/tag.jsp" %>

<% String menuType = "sys3"; %>
<!DOCTYPE html>
<html lang="zh-CN">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- necessary -->
    <meta name="keywords" content="1,2,3">
    <meta name="description" content="">
    <!-- description -->
    <meta name="renderer" content="webkit">
    <title>碧沙康健_网上商城</title>
    <!-- base -->
    <link href="<%=request.getContextPath() %>/resources/ctrl/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/base.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/index/index.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<%@ include file="../comm/header.jsp" %>
    <div class="wrap">
        <div class="container pl-0 pr-0">
            <p class="pt-10 pb-10 pl-15 pr-15 line-h-20 bg-f5f5f5 cur-d">
                <a class="col-666 t-nonehove hovecol-309DE2" href="">首页 </a>
                >
                <a class="col-333 t-nonehove hovecol-309DE2" href="">所有商品</a>
            </p>
            <p class="pt-10 pb-10 pl-15 pr-15 line-h-20 cur-d">
                <a class="col-666 t-nonehove hovecol-309DE2" href="">分类：</a>
                <a class="col-333 t-nonehove hovecol-309DE2" href="">全部</a>
                <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-40" href="">心电仪</a>
                <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-40" href="">血压血糖</a>
                <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-40" href="">智能药盒</a>
                <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-40" href="">摄像头</a>
            </p>
            <div class="clear bg-f5f5f5 cur-d"> 
                <p class="pt-10 pb-10 pl-15 pr-15 line-h-20 bg-f5f5f5 cur-d">
                    <a class="col-666 t-nonehove hovecol-309DE2 dis-in pr-15" href="">推荐 </a>
                    |
                    <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-15 pr-15" href="">新品</a>
                    |
                    <a class="col-333 t-nonehove hovecol-309DE2 dis-in pl-15" href="">价格 <i class=" icon-arrow-up col-333 t-nonehove hovecol-309DE2"></i></a>
                </p>
                <div class="clear pt-30 pl-15 pr-15">
                    <!-- 商品信息 -->
                    <c:forEach var="cpager" items="${cpager.datas }">
                 <%--    <c:forEach items="${ReportList.datas}" var="MReport" varStatus="ac"> --%>
                    <div class="col-xs-3 pb-20 pr-20">
                        <div class="clear shopprotips">
                            <div class="clear full-w bg-white pt-20 pl-20 pr-20">
                                <p class="h-15">
                                    <i class="dis-n icon-shopping-cart pr-5 f-14 col-8c8c8c hovecol-309DE2 cur-p"></i>
                                </p>
                                <div class="clear text-center pt-20 pb-20">
                                    <a href="<%=request.getContextPath() %>/product?shop_number=${cpager.shop_number}"><img src="<%=request.getContextPath() %>/resources/${cpager.main_picture}" alt=""></a>
                                </div>
                                <p class="text-center f-14 f-w line-h-20 col-252525">
                                	<a href="<%=request.getContextPath() %>/product?shop_number=${cpager.shop_number}">
                                    			${cpager.title }
                                    </a>
                                </p>
                                <p class="text-center f-14 f-w line-h-20 col-309DE2 pb-40">
                                    		${cpager.selling_price }
                                </p>
                            </div>
                            <p class="h-20 line-h-20 text-right col-white bg-A0D8FB pl-20 pr-20">
                                    	包邮
                            </p>
                        </div>
                    </div>
            	 </c:forEach>
                <!-- 分页 -->
                <div class="clear pt-10 pb-20 text-center">
                   <!--  <nav aria-label="Page navigation">
                      <ul class="pagination">
                        <li>
                          <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                          </a>
                        </li>
                        <li><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li>
                          <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                          </a>
                        </li>
                      </ul>
                    </nav> -->
             <jsp:include page="../comm/pager.jsp">
				<jsp:param value="${cpager.total}" name="totalRecord" />
				<jsp:param value="shopping" name="url" />
			</jsp:include>
            </div>
            </div>
        </div>
    </div>
    </div>
    <%@ include file="../comm/footer.jsp" %> 	
    <script src="<%=request.getContextPath() %>/resources/js/comm/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/base.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/index/index.js"></script>
</body>

</html>