<%@ page language="java"  pageEncoding="UTF-8"%>
<%@ include file="../comm/tag.jsp" %>
<%String menuType="sys3"; %>
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
    <title>碧沙康健_商品详细页</title>
    <!-- base -->
    <link href="<%=request.getContextPath() %>/resources/ctrl/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/base.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/index/index.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    /* 页面嵌入部分CSS为设置zoom框大小 */

    @media (min-width:768px) and (max-width:991px) {
        .zoomLens {
            width: 80px !important;
            height: 80px !important;
        }
        .zoomWindow {
            border-width: 1px !important;
            width: 260px !important;
            height: 260px !important;
        }
    }

    @media (min-width:992px) and (max-width:1199px) {
        .zoomLens {
            width: 100px !important;
            height: 100px !important;
        }
        .zoomWindow {
            border-width: 1px !important;
            width: 366px !important;
            height: 366px !important;
        }
    }

    @media (min-width:1200px) and (max-width:1299px) {
        .zoomLens {
            width: 130px !important;
            height: 130px !important;
        }
        .zoomWindow {
            border-width: 1px !important;
            width: 400px !important;
            height: 400px !important;
        }
    }

    @media (min-width:1300px) {
        .zoomLens {
            width: 130px !important;
            height: 130px !important;
        }
        .zoomWindow {
            border-width: 1px !important;
            width: 400px !important;
            height: 400px !important;
        }
    }
    </style>
</head>

<body>
      <%@ include file="../comm/header.jsp" %>  
    <div class="clear full-w bor bor-t bor-col-D6D6D6 sha-float-titlev1 flo-menuv2">
        <div class="containerv2 pt-10 pb-10 clear line-h-30 plr-0-10-ipad">
            <span class="col-black family-h pull-left cur-d f-20 ">${commodity.title }</span>
            <span class="col-black family-h pull-right f-12">
                <span class="t-nonehove hovecol-309DE2 col-black cur-p">概述</span>
            <span>|</span>
            <span class="t-nonehove hovecol-309DE2 col-black cur-p sf-pointer">参数</span>
            <span>|</span>
            <span class="t-nonehove hovecol-309DE2 col-black cur-p">用户评价</span>
            </span>
        </div>
    </div>
    <div class="clear full-w bor bor-t bor-col-D6D6D6 sha-float-titlev1 affix t-0 l-0 bg-white z-999 dis-n flo-menuv2-aff">
        <div class="containerv2 pt-10 pb-10 clear line-h-30 plr-0-10-ipad">
            <span class="col-black family-h pull-left cur-d f-20 ">${commodity.title }</span>
            <button class="pull-right f-20 line-h-30 h-30 text-center bor-none bg-309DE2 hovbg-2D90CF col-white pl-20 pr-20">
                立即购买
            </button>
        </div>
    </div>
    <div class="wrap">
        <div class="containerv2 pl-0 pr-0">
            <div class="clear cont-other pb-40">
                <div class="clear full-w ">
                    <div class="clear col-sm-5 pl-0 pr-0 pull-left">
                        <div class="claer col-md-12 pull-left text-center pd-50-30-ipad">
                            <img id="prode-zoom-main" class="full-w produ-max-show" src="<%=request.getContextPath() %>/resources/${commodity.main_picture }" data-zoom-image="<%=request.getContextPath() %>/resources/${commodity.pic1_large }" alt="">
                        </div>
                        <div class="clear col-md-12 mtb-20-5-ipad pl-0 pr-0 pull-left">
                            <div class="prode-zoom-img clear dis-ib cur-p col-sm-3 plr-10-5-ipad" data-image="<%=request.getContextPath() %>/resources/${ commodity.pic1_midium}" data-zoom-image="<%=request.getContextPath() %>/resources/${commodity.pic1_large }">
                                <img class="full-w bor bor-col-B2B2B2 bor-col-309DE2 produ-min-tips " src="<%=request.getContextPath() %>/resources/${commodity.pic1_mix }" />
                            </div>
                            <div class="prode-zoom-img clear dis-ib cur-p col-sm-3 plr-10-5-ipad" data-image="<%=request.getContextPath() %>/resources/${ commodity.pic2_midium}" data-zoom-image="<%=request.getContextPath() %>/resources/${commodity.pic2_large }">
                                <img class="full-w bor bor-col-B2B2B2 produ-min-tips" src="<%=request.getContextPath() %>/resources/${commodity.pic2_mix }" />
                            </div>
                            <div class="prode-zoom-img clear dis-ib cur-p col-sm-3 plr-10-5-ipad" data-image="<%=request.getContextPath() %>/resources/${ commodity.pic3_midium}" data-zoom-image="<%=request.getContextPath() %>/resources/${commodity.pic3_large }">
                                <img class="full-w bor bor-col-B2B2B2 produ-min-tips" src="<%=request.getContextPath() %>/resources/${commodity.pic3_mix }" />
                            </div>
                            <div class="prode-zoom-img clear dis-ib cur-p col-sm-3 plr-10-5-ipad" data-image="<%=request.getContextPath() %>/resources/${ commodity.pic4_midium}" data-zoom-image="<%=request.getContextPath() %>/resources/${commodity.pic4_large }">
                                <img class="full-w bor bor-col-B2B2B2 produ-min-tips" src="<%=request.getContextPath() %>/resources/${commodity.pic4_mix }" />
                            </div>
                        </div>
                    </div>
                    <div class="clear col-sm-5 pull-left pt-20-5-ipad plr-25-5-ipad">
                        <p class="f-30-20-ipad col-black family-h h-30 line-h-30 mtb-10-5-ipad">
                            ${commodity.title }
                        </p>
                        <p class="f-18-14-ipad col-616161 min-h-125-60 family-hs line-h-25">
                            ${commodity.subtitle }
                        </p>
                        <div class="clear line-h-25 ptb-20-0-ipad bor bor-l-none bor-r-none bor-col-B2B2B2-hide-ipad">
                            <span class="col-309DE2 f-30 family-h dis-ib pull-left">
                                ${commodity.selling_price }
                            </span>
                            <span class="col-309DE2 f-16 family-h dis-ib pull-left">
                                元
                            </span>
                        </div>
                        <div class="clear mtb-30-10-ipad full-w h-40">
                            <div class="w-150-100-ipad h-40-30-ipad line-h-40-30-ipad text-center f-18 col-black pull-left bor-col-309DE2 bor cur-p ">
                                标&nbsp;&nbsp;配
                            </div>
                        </div>
                        <div class="clear mb-30 full-w bor bor-col-B2B2B2 cur-p shieldframe">
                            <!-- 此框的选中状态1为选中，0为未选中 -->
                            <input class="shieldframe_sel" type="hidden" value="0">
                            <div class="clear col-md-3 col-sm-2 pull-left ptb-35-16-ipad text-center pl-0 pr-0">
                                <div class="clear img-30-20 bg-B1B1B1 full-radius text-center dis-ib line-h-30 shieldframe_circle">
                                    <img class="img-20-14 pos-r t--2--6-ipad" src="<%=request.getContextPath() %>/resources/img/net_shopping/ico_ok.png" alt="">
                                </div>
                            </div>
                            <div class="clear col-md-7 col-sm-8 pull-left pt-30-10-ipad pl-0 pr-0">
                                <div class="clear pull-left col-sm-2 pl-0 pr-0">
                                    <img class="pos-r t--2" src="<%=request.getContextPath() %>/resources/img/net_shopping/shield.png" alt="">
                                </div>
                                <div class="clear pull-left col-sm-10 pl-5 pr-0">
                                    <p class="col-black f-18-14-ipad family-h line-h-25-30-ipad">
                                        悉心平安服务
                                        <span class="col-309DE2 f-12 hidden-sm">
                                        了解服务详情
                                    </span>
                                    </p>
                                    <p class="col-aaa f-12 family-h line-h-20 hidden-sm">
                                        居家外出&nbsp;身体不适&nbsp;一键通知亲人
                                    </p>
                                </div>
                            </div>
                            <div class="clear col-md-2 col-sm-2 pull-left pt-10 pl-0 pr-0">
                                <p class="clear pb-10 line-h-30 col-309DE2 f-14 pr-10">
                                    <a class="t-nonehove col-309DE2 pull-right hovecol-309DE2 " href="">选购</a>
                                </p>
                                <p class="clear line-h-20 pr-10 hidden-sm">
                                    <span class="col-aaa f-12 family-h pull-right">100元/月</span>
                                </p>
                            </div>
                        </div>
                        <div class="clear ptb-20-10-ipad bor bor-l-none bor-r-none bor-col-B2B2B2">
                            <div class="clear col-sm-8 pl-0 pr-10">
                                <button class="line-h-45-30-ipad h-45-30-ipad col-white f-18-14-ipad text-center full-w radius-0 bg-309DE2 bor-none hovbg-2D90CF" onclick="document.location='HK_cart.html';">加入购物车</button>
                            </div>
                            <div class="clear col-sm-4 pl-10 pr-0">
                                <button class="line-h-45-30-ipad h-45-30-ipad col-white f-18-14-ipad text-center full-w radius-0 bg-9BD2F4 bor-none hovbg-9BD2F4" onclick="document.location='HK_Order.html';">立即购买</button>
                            </div>
                        </div>
                        <p class="pt-10 pb-10 line-h-30 f-16 ">
                            <img class="img-20 mr-5 pos-r t--2" src="<%=request.getContextPath() %>/resources/img/net_shopping/find-more.png" alt="">
                            <a class="col-616161 hovecol-309DE2 t-nonehove" href="<%=request.getContextPath()%>/index">返回首页查看更多心脏健康产品</a>
                        </p>
                    </div>
                    <div class="clear col-sm-2 pull-left pt-20 pl-10 pr-10">
                        <div class="pos-r clear text-center line-h-20 f-16-14-ipad col-black pb-20-0-ipad">
                            相关产品
                            <div class="pos-a bor bor-b w-50 t-10 l-0 hidden-sm hidden-md">
                            </div>
                            <div class="pos-a bor bor-b w-50 t-10 r-0 hidden-sm hidden-md">
                            </div>
                        </div>
                 <%--       <c:forEach var="product" items="${ product}"> --%>
                          <c:forEach var="shopNub" items="${ list}">
                        	<div class="clear pos-r bor bor-col-B2B2B2 pull-left mt-10 mb-10 cur-p"> 
                       		 <img class="full-wh" src="<%=request.getContextPath() %>/resources/${ shopNub.main_picture}" alt=""> 
                            	<div class="clear h-25 line-h-25 rgba-d2d2d2-20 pos-a b-0 l-0 pl-10 pr-10 full-w hidden-sm hidden-md">
                              <span class="col-727272 t-nonehove hovecol-309DE2" href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=${shopNub.shop_number}">${shopNub.title }</span> 
                            	</div>
                      	  </div>
                           </c:forEach> 
                    
                    <%--   </c:forEach> --%>
                    </div>
                </div>
            </div>
            <div class="clear pro_first_floor pt-40 bor bor-b bor-col-B2B2B2">
                <div class="clear col-sm-3 pt-230 pb-230 bor bor-r bor-col-B2B2B2">
                    <p class="f-20 col-black text-center line-h-40">外观</p>
                </div>
                <div class="clear col-sm-9 pt-100 pl-100-0-ipad">
                    <div class="clear col-sm-5 pd-0">
                        <img class="img-250" src="<%=request.getContextPath() %>/resources/img/net_shopping/producttip-frontage.jpg" alt="">
                    </div>
                    <div class="clear col-sm-7 pl-0 pr-0 pt-130">
                        <img class="" src="<%=request.getContextPath() %>/resources/img/net_shopping/producttip-side.jpg" alt="">
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            产品尺寸：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            66*46*13mm
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear pro_second_floor bor bor-b bor-col-B2B2B2">
                <div class="clear col-sm-3 pt-230 pb-230 bor bor-r bor-col-B2B2B2">
                    <p class="f-20 col-black text-center line-h-40">参数</p>
                </div>
                <div class="clear col-sm-9 pt-40 pl-100-0-ipad">
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            产品名称：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            悉心心电仪
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            产品型号：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            HC3A50
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            产品重量：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            33g
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            产品导联数：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            3导联
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            实时数据接口：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            蓝牙4.0
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            工作周期：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4">
                            蓝牙关闭时 120小时 / 蓝牙开启 24小时
                        </div>
                    </div>
                    <div class="clear col-sm-12 pt-40 pl-25 pr-0">
                        <div class="clear col-sm-3 f-14 col-b4b4b4">
                            存储容量：
                        </div>
                        <div class="clear col-sm-9 f-14 col-b4b4b4 line-h-20">
                            0.9GB其中100MB用于存放应用程序，878MB ECG 数据文件 （相当于连续采集40天的数据）。重量: 33g
                        </div>
                    </div>
                </div>
            </div>
            <div class="clear pro_third_floor pb-80">
                <div class="clear col-sm-3 pt-230 pb-230 bor bor-r bor-col-B2B2B2">
                    <p class="f-20 col-black text-center line-h-40">包装清单</p>
                </div>
                <div class="clear col-sm-9 pt-100 pl-100-0-ipad">
                    <div class="clear col-sm-4 pd-0 text-center">
                        <img class="img-180" src="<%=request.getContextPath() %>/resources/img/net_shopping/producttips1-small.png" alt="">
                    </div>
                    <div class="clear col-sm-4 pl-0 pr-0 pt-100 text-center">
                        <img class="" src="<%=request.getContextPath() %>/resources/img/net_shopping/Pro-inventoryv2.jpg" alt="">
                    </div>
                    <div class="clear col-sm-4 pl-0 pr-0 pt-20 text-center">
                        <img class="" src="<%=request.getContextPath() %>/resources/img/net_shopping/Pro-inventoryv3.jpg" alt="">
                    </div>
                    <div class="clear col-sm-12 pt-10 f-14 pl-0 pr-0">
                        <div class="clear col-sm-4 pd-0 text-center col-black">
                            心电仪
                        </div>
                        <div class="clear col-sm-4 pd-0 text-center col-black">
                            连接线
                        </div>
                        <div class="clear col-sm-4 pd-0 text-center col-black">
                            包装盒
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="img-60 bg-9BD2F4 affix t-80s r-40 z-999 hk-upbtn dis-n">
        <img src="<%=request.getContextPath() %>/resources/img/net_shopping/up.png" class="img-40 mt-10 ml-10" alt="">
    </div>
        <%@ include file="../comm/footer.jsp" %> 
    <script src="<%=request.getContextPath() %>/resources/js/comm/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/jquery.elevatezoom.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/base.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/index/index.js"></script>
    <script>
    $("#prode-zoom-main").elevateZoom({
        gallery: 'gallery_01',
        cursor: 'pointer',
        galleryActiveClass: 'active',
        easing: true,
    });
    </script>
</body>

</html>