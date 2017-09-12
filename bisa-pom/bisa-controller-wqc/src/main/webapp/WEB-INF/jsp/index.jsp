<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="./comm/tag.jsp" %>
<%String menuType="sys1"; %>

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
    <title>碧沙康健</title>
    <!-- base -->
 	
    <link href="<%=request.getContextPath() %>/resources/ctrl/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/swiper.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/base.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/index/index.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>

 
     <%@ include file="./comm/header.jsp" %> 
    <div class="wrap">
        <div class="container pl-0 pr-0">
            <!-- banner -->
            <div class="clear pos-r pl-0 pr-0">
                <div class="swiper-container swiper-container-main">
                    <div class="swiper-wrapper">
                        <div class="swiper-slide"><img src="<%=request.getContextPath() %>/resources/img/index/banner1.jpg" alt=""></div>
                        <div class="swiper-slide"><img src="<%=request.getContextPath() %>/resources/img/index/banner2.jpg" alt=""></div>
                        <div class="swiper-slide"><img src="<%=request.getContextPath() %>/resources/img/index/banner3.jpg" alt=""></div>
                        <div class="swiper-slide"><img src="<%=request.getContextPath() %>/resources/img/index/banner4.jpg" alt=""></div>
                        <div class="swiper-slide"><img src="<%=request.getContextPath() %>/resources/img/index/banner5.jpg" alt=""></div>
                    </div>
                    <!-- 如果需要分页器 -->
                    <div class="swiper-pagination swiper-paginationmian"></div>                    
                </div>
                <div class="clear pos-a t-0 l-0 full-wh rgba-30-white z-999 dis-n bannershadev1">
                </div>
            </div>
            <div class="clear full-w bgimg-interlayer text-center pt-50 pb-50 line-h-30">
                <a class="col-white t-nonehove f-18 cur-p family-h" href="">查看更多健康产品 ></a>
            </div>
            <!-- 主要内容 -->
            <div class="clear pos-r pl-0 pr-0 full-w">
                <div class="swiper-container swiper-container-tipsv1 full-w">
                    <div class="swiper-wrapper">
                    <!-- 这块是可以for循环    -->
                  <%--   <c:forEach var="list5" items="${listMap }" > --%>
                        <div class="swiper-slide protips">
                            <div class="full-w pl-0 pr-0 bor bor-t-none bor-b-none bor-col-E9E9E9 protipssidev1 shodow-tip">
                                <div class="clear ">
                                    <div class="clear full-w text-center pt-30 pb-30">
                                        <a href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=1001"><img class="cur-p" src="<%=request.getContextPath() %>/resources/img/index/producttips1.png" alt=""></a>
                                    </div>
                                    <div class="clear pt-30 protipsplmedia cur-d pb-80">
                                        <p class="line-h-30 f-16 f-w col-252525">
                                            HC3A250 悉心心电仪
                                        </p>
                                        <p class="line-h-20 f-14 col-8c8c8c pt-20">
                                           采集数据精确到0.00001mm
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           导联数：3通道 数据传输稳定
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           存储容量：0.9GB 相当于连续采
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           集40天的数据
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           重量：33g 轻巧易携带
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           续航：无蓝牙120小时持续使用
                                        </p>
                                        <p class="line-h-25 f-14 pt-20">
                                           <a class="col-8c8c8c t-nonehove hovecol-333" href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=1001">了解产品细节 ></a>
                                        <!-- </p> -->
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                            <div class="full-w pl-0 pr-0 bor bor-r bor-col-E9E9E9 shodow-tip">
                                <div class="clear shodow-tips">
                                    <div class="clear full-w text-center pt-30 pb-30">
                                        <a href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=2001"><img class="cur-p" src="<%=request.getContextPath() %>/resources/img/index/producttips2.png" alt=""></a>
                                    </div>
                                    <div class="clear pt-30 protipsplmedia pb-80 cur-d">
                                        <p class="line-h-30 f-16 f-w col-252525">
                                            HC3A250 悉心血压计
                                        </p>
                                        <p class="line-h-20 f-14 col-8c8c8c pt-20">
                                           采集数据精确到0.00001mm
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           导联数：3通道 数据传输稳定
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           存储容量：0.9GB 相当于连续采
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           集40天的数据
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           重量：33g 轻巧易携带
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           续航：无蓝牙120小时持续使用
                                        </p>
                                        <p class="line-h-25 f-14 pt-20">
                                           <a class="col-8c8c8c t-nonehove hovecol-333" href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=2001">了解产品细节 ></a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                            <div class="full-w pl-0 pr-0 bor bor-r bor-col-E9E9E9 shodow-tip">
                                <div class="clear shodow-tips">
                                    <div class="clear full-w text-center pt-30 pb-30">
                                        <a href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=4001"><img class="cur-p" src="<%=request.getContextPath() %>/resources/img/index/producttips1.png" alt=""></a>
                                    </div>
                                    <div class="clear pt-30 protipsplmedia pb-80 cur-d">
                                        <p class="line-h-30 f-16 f-w col-252525">
                                            HC3A250 悉心心电仪
                                        </p>
                                        <p class="line-h-20 f-14 col-8c8c8c pt-20">
                                           采集数据精确到0.00001mm
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           导联数：3通道 数据传输稳定
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           存储容量：0.9GB 相当于连续采
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           集40天的数据
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           重量：33g 轻巧易携带
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           续航：无蓝牙120小时持续使用
                                        </p>
                                        <p class="line-h-25 f-14 pt-20">
                                           <a class="col-8c8c8c t-nonehove hovecol-333" href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=4001">了解产品细节 ></a>
                                        </p>
                                    </div>
                                </div>    
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                            <div class="full-w pl-0 pr-0 bor bor-r bor-col-E9E9E9 shodow-tipv2">
                                <div class="clear">
                                    <div class="clear full-w text-center pt-30 pb-30">
                                        <a href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=3001"><img class="cur-p" src="<%=request.getContextPath() %>/resources/img/index/producttips3.png" alt=""></a>
                                    </div>
                                    <div class="clear pt-30 protipsplmedia cur-d pb-80">
                                        <p class="line-h-30 f-16 f-w col-252525">
                                            HC3A250 悉心摄像头
                                        </p>
                                        <p class="line-h-20 f-14 col-8c8c8c pt-20">
                                           采集数据精确到0.00001mm
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           导联数：3通道 数据传输稳定
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           存储容量：0.9GB 相当于连续采
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           集40天的数据
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           重量：33g 轻巧易携带
                                        </p>
                                        <p class="line-h-25 f-14 col-8c8c8c">
                                           续航：无蓝牙120小时持续使用
                                        </p>
                                        <p class="line-h-25 f-14 pt-20">
                                           <a class="col-8c8c8c t-nonehove hovecol-333" href="<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=3001">了解产品细节 ></a>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                 <%--    </c:forEach>   --%>
                       <!-- for循环结束 -->
                        <div class="swiper-slide protips">
                            <div class="full-w protipssidev2 bg-252525 pl-0 pr-0">
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                            <div class="full-w protipssidev2 bg-252525 pl-0 pr-0">
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                            <div class="full-w protipssidev2 bg-252525 pl-0 pr-0">
                            </div>
                        </div>
                        <div class="swiper-slide protips">
                        	<div class="full-w protipssidev2 bg-252525 pl-0 pr-0">
                        </div>
                        </div>
                    </div>
                    <div class="clear pos-a t-0 l-0 rgba-90 z-99">
                        <div class="swiper-button-prev swiper-tipsv1-button-prev"></div>
                        <div class="swiper-button-next swiper-tipsv1-button-next"></div>  
                    </div>
                                  
                </div>
                <div class="clear pos-a t-0 l-0 full-wh rgba-30 tipsshadev1 z-99">
                </div>
            </div>
        </div>
    </div>
   <%@ include file="./comm/footer.jsp" %> 	
	<script src="<%=request.getContextPath() %>/resources/js/comm/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/swiper.jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/base.js"></script>
    <script>
        var mySwiper = new Swiper ('.swiper-container-main', {
            loop: true,
            autoplay : 3000,
            autoplayDisableOnInteraction : false,
            autoHeight: true,
            pagination: '.swiper-paginationmian',
            paginationClickable :true,
            paginationBulletRender: function (swiper, index, className) {
                return '<span class="' + className + '">' + (index + 1) + '<div class=\"mainswiper-pagination-bullet-div\"></div>'+'</span>';
            }
        })
        var mySwiperv2 = new Swiper ('.swiper-container-tipsv1', {
            prevButton:'.swiper-tipsv1-button-prev',
            nextButton:'.swiper-tipsv1-button-next',
            slidesPerView : 4,
            spaceBetween : 0,
        })        
    </script>
    <script src="<%=request.getContextPath() %>/resources/js/index/index.js"></script>
</body>

</html>