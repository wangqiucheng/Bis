<%@ page language="java"  pageEncoding="UTF-8"%>
<%@page import="com.bisa.hkshop.model.SystemContext"%>
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
    <title>碧沙康健_商品展示页</title>
    <!-- base -->
    <link href="<%=request.getContextPath() %>/resources/ctrl/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/base.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/shopping/HK_Pro_details.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>
    <%@ include file="../comm/header.jsp" %> 
    <!-- 置顶浮层 -->
    <div class="clear full-w bor bor-t bor-col-D6D6D6 sha-float-titlev1 flo-menuv2 z-999">
        <div class="container pt-10 pb-10 clear line-h-30 plr-0-10-ipad">
            <span class="col-black family-h pull-left cur-d f-20 ">HC3A250 悉心心电仪器</span>
            <button class="pull-right f-20 line-h-30 h-30 text-center bor-none bg-309DE2 hovbg-2D90CF col-white pl-20 pr-20" onclick="document.location='<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=1001';">
                	立即购买
            </button>
        </div>
    </div>
    <div class="clear full-w bor bor-t bor-col-D6D6D6 sha-float-titlev1 affix t-0 l-0 bg-white z-999 dis-n flo-menuv2-aff">
        <div class="container pt-10 pb-10 clear line-h-30 plr-0-10-ipad">
            <span class="col-black family-h pull-left cur-d f-20 ">HC3A250 悉心心电仪器</span>
            <button class="pull-right f-20 line-h-30 h-30 text-center bor-none bg-309DE2 hovbg-2D90CF col-white pl-20 pr-20" onclick="document.location='<%=request.getContextPath() %>/shopping/getCommodityId?shop_number=1001';">
                立即购买
            </button>
        </div>
    </div>
    <!-- 主要内容 -->
    <div class="wrap clear">
        <!-- first floor -->
        <div class="clear full-w min-h-600-500-ipad first-floor ">
            <div class="container clear">
                <div class="col-sm-5 clear pt-82 pb-82">
                    <img class="pull-right" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/first-floor-tipsv1.png" alt="">
                </div>
                <div class="col-sm-7 clear pt-170 pb-150">
                    <div class="clear pull-left pos-r t-20 opa-0 first-floor-aniv1 ani-topa-re">
                        <p class="f-38-28-ipad col-309DE2 cur-d line-h-40 h-40 fw-600">
                            HC3A250 悉心心电仪
                            <span class="f-20 dis-ib h-40 line-h-40 pos-r t--5--0-ipad col-309DE2 ml-10-5-ipad bor pl-15 pr-15 bor-col-309DE2 radius-3">蓝牙版</span>
                        </p>
                        <p class="full-w text-center col-929292 h-40 line-h-40 f-30-24-ipad mt-20 cur-d">
                            常伴父母的悉心呵护
                        </p>
                    </div>
                    <div class="clear mt-60 full-w pull-left col-309DE2 cur-d line-h-40 h-40 fw-600 f-30-24-ipad pl-90-40-ipad pos-r t-20 opa-0 first-floor-aniv2">
                        1800元
                    </div>
                </div>
            </div>
        </div>
        <!-- second floor -->
        <div class="clear full-w min-h-600 bg-f8f7f5 second-floor">
            <div class="container clear">
                <p class="mt-60 text-center f-50-38-ipad col-309DE2 cur-d line-h-50 h-50 second-floor-aniv1 pos-r t-20 opa-0">
                    无需外出，无需排队，测心电，随时随地
                </p>
                <div class="clear text-center f-20-16-ipad cur-d pt-10 pb-10">
                    <div class="clear dis-ib">
                        <p class="col-666 line-h-25 h-25 mt-10 mb-10 second-floor-aniv2 pos-r t-20 opa-0"> 
                            悉心心电仪精确、小巧、易用，只需打开APP，无需任何操作即可自动打开蓝牙连接。
                        </p>
                        <p class="col-666 line-h-25 h-25 mt-10 mb-10 full-w text-left second-floor-aniv3 pos-r t-20 opa-0"> 
                            随时随地一键开启心电监测，让父母健康有保障。
                        </p>
                    </div>
                </div>
                <div class="col-sm-5 clear text-center pt-50">
                    <img class="" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/second-floor-tipsv1.png" alt="">
                </div>
                <div class="col-sm-2 clear text-center pt-50 min-h-300 pl-0 pr-0 line-h-300 cur-d select-none">
                    <span class="icon-circle mr-5 ml-5 col-309DE2 f-14"></span>
                    <span class="icon-circle mr-5 ml-5 col-309DE2 f-14"></span>
                    <span class="icon-circle mr-5 ml-5 col-309DE2 f-14"></span>
                    <span class="icon-circle mr-5 ml-5 col-309DE2 f-14"></span>
                </div>
                <div class="col-sm-5 clear text-center pt-75">
                    <img class="" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/second-floor-tipsv2.png" alt="">
                </div>
            </div>
        </div>
        <!-- third floor -->
        <div class="clear full-w min-h-860-650-ipad third-floor">
            <div class="container clear">
                <!-- third floor duplexv1-->
                <div class="clear text-center  cur-d">
                    <p class="f-38 col-black mt-40 line-h-40 h-40 third-floor-aniv1 pos-r t-20 opa-0">
                        父母一用就会
                    </p>
                    <p class="f-50 col-309DE2 mt-10 line-h-60 h-60 third-floor-aniv2 pos-r t-20 opa-0">
                        一键监测
                    </p>
                </div>
                <!-- third floor duplexv2-->
                <div class="clear cur-d">
                    <div class="clear full-w mt-20 mb-20 third-floor-aniv3 pos-r t-20 opa-0">
                        <div class="col-sm-3"></div>
                        <div class="col-sm-3 pos-r">
                            <div class="clear full-w thirdf-w-is-h full-radius bor bor-3px bor-col-309DE2 pos-r z-9 overflow-h">
                                <img class="full-w pos-a img-thirdfloor-tips z-1 max-w-200p hov-thirdimg" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/third-floor-tipsv1.png" alt="">
                            </div>
                            <div class="clear thirdf-w-is-hv2 full-radius bor bor-3px bor-col-309DE2 z-99 pos-a bg-white text-center">
                                <span class="col-309DE2 f-36-18-ipad mt-5 mb-5 dis-ib">1</span>
                            </div>
                            <p class="text-center f-16 col-black h-20 line-h-20 mt-10 mb-10">
                                佩戴并开启心电仪
                            </p>
                        </div>
                        <div class="col-sm-3 pos-r">
                            <div class="clear full-w thirdf-w-is-h full-radius bor bor-3px bor-col-309DE2 pos-r z-9 overflow-h">
                                <img class="full-w pos-a img-thirdfloor-tips z-1 max-w-200p hov-thirdimg" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/third-floor-tipsv2.png" alt="">
                            </div>
                            <div class="clear thirdf-w-is-hv2 full-radius bor bor-3px bor-col-309DE2 z-99 pos-a bg-white text-center">
                                <span class="col-309DE2 f-36-18-ipad mt-5 mb-5 dis-ib">2</span>
                            </div>
                            <p class="text-center f-16 col-black h-20 line-h-20 mt-10 mb-10">
                                打开悉心APP自动开启蓝牙并连接
                            </p>
                        </div>
                        <div class="col-sm-3"></div>
                    </div>
                    <div class="clear full-w mt-20 third-floor-aniv4 pos-r t-20 opa-0">
                        <div class="col-sm-3"></div>
                        <div class="col-sm-3 pos-r">
                            <div class="clear full-w thirdf-w-is-h full-radius bor bor-3px bor-col-309DE2 pos-r z-9 overflow-h">
                                <img class="full-w pos-a img-thirdfloor-tips z-1 max-w-200p hov-thirdimg" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/third-floor-tipsv3.png" alt="">
                            </div>
                            <div class="clear thirdf-w-is-hv2 full-radius bor bor-3px bor-col-309DE2 z-99 pos-a bg-white text-center">
                                <span class="col-309DE2 f-36-18-ipad mt-5 mb-5 dis-ib">3</span>
                            </div>
                            <p class="text-center f-16 col-black h-20 line-h-20 mt-10 mb-10">
                                点击按钮，开始监测
                            </p>
                        </div>
                        <div class="col-sm-3 pos-r">
                            <div class="clear full-w thirdf-w-is-h full-radius bor bor-3px bor-col-309DE2 pos-r z-9 overflow-h">
                                <img class="full-w pos-a img-thirdfloor-tips z-1 max-w-200p hov-thirdimg" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/third-floor-tipsv4.png" alt="">
                            </div>
                            <div class="clear thirdf-w-is-hv2 full-radius bor bor-3px bor-col-309DE2 z-99 pos-a bg-white text-center">
                                <span class="col-309DE2 f-36-18-ipad mt-5 mb-5 dis-ib">4</span>
                            </div>
                            <p class="text-center f-16 col-black h-20 line-h-20 mt-10 mb-10">
                                查看监测结果报告
                            </p>
                        </div>
                        <div class="col-sm-3"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- fourth floor -->
        <div class="clear full-w min-h-600 pos-r overflow-h bg-a0d8f8 fourth-floor">
            <div class="clear pos-r z-99 full-w min-h-600">
                <div class="container clear">
                    <div class="pt-110">
                        <p class="col-white f-50-40-ipad line-h-60 h-60 text-center cur-d fourth-floor-aniv1 pos-r t-20 opa-0">
                            世界首创三导联无线携带式心电记录仪
                        </p>
                    </div>
                    <div class="pt-75">
                        <p class="col-423f3f f-38-28-ipad line-h-60 pl-40 pr-40 cur-d text-ind fourth-floor-aniv2 pos-r t-20 opa-0">
                            目前市面上的家用便携式心电仪均为单导联，悉心心电仪器首创家用心电仪三导联技术，开启家用便携心电仪新时代，在家也可享受媲美医疗级别的健康保障。
                        </p>
                    </div>
                </div>
            </div>
            <img class="z-1 pos-a w-1920 max-w-1920 img-peodetailfv4-1" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/fourth-floor-bgv2.png" alt="">
        </div>
        <!-- fifth floor -->
        <div class="clear full-w min-h-860 bg-white overflow-h fifth-floor">
            <div class="container clear pos-r z-9">
                <div class="clear full-w pt-110 cur-d z-9 pos-r">
                    <p class="col-309DE2 f-50-40-ipad line-h-60 h-60 mt-20 mb-20 fifth-floor-aniv1 pos-r t-20 opa-0">
                        与安卓手机通用的充电口
                    </p>
                    <p class="col-309DE2 f-50-40-ipad line-h-60 h-60 mt-20 mb-20 fifth-floor-aniv2 pos-r t-20 opa-0">
                        再也无需担心充电线丢失
                    </p>
                </div>
                <div class="clear full-w pt-280-200-ipad cur-d z-9 pos-r">
                    <div class="clear pull-right col-sm-7">
                        <p class="col-666 f-26-20-ipad line-h-35 pt-20 pb-30 bor bor-b bor-col-d2d2d2 fifth-floor-aniv3 pos-r t-20 opa-0">
                            我们使用了和大部分数码设备一致的micro USB充电口，即便线材丢失，也可以使用手机、数码设备等充电线为血压计充电，再也不用在需要充电时到处找充电线了。
                        </p>
                    </div>
                </div>
                <div class="clear full-w pt-20 cur-d z-9 pos-r">
                    <div class="clear pull-right col-sm-7">
                        <p class="col-979797 f-18-14-ipad line-h-25 fifth-floor-aniv4 pos-r t-20 opa-0">
                            悉心心电仪所配充电线为专门适配充电线，不可为其他设备充电，若充电可能会造成负荷过大、线材发热等情况，但不影响使用其他设备充电线为血压计充电。
                        </p>
                    </div>
                </div>
                <img class="pos-a z-1 opa-0 fifth-floor-aniv5" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/fifth-floor-bgv2.png" alt="" >
                <img class="pos-a z-1 opa-0 fifth-floor-aniv6" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/fifth-floor-bgv3.png" alt="">
            </div>
        </div>
        <!-- six floor -->
        <div class="clear full-w min-h-600 bg-a7dbfb six-floor">
            <div class="container clear">
                <div class="clear pt-82 text-center">
                    <p class="text-center col-white f-50-40-ipad cur-d line-h-55 h-55 six-floor-aniv1 pos-r t-20 opa-0">
                        一次充电可使用120小时
                    </p>
                    <div class="clear dis-ib">
                        <p class="col-white f-26 cur-d line-h-30 mt-10 mb-10 six-floor-aniv2 pos-r t-20 opa-0">
                            超长续航能力：独立监测（关闭蓝牙）可持续监测12小时
                        </p>
                        <p class="col-white f-26 cur-d line-h-30 full-w text-left mt-10 mb-10 six-floor-aniv3 pos-r t-20 opa-0">
                             实时监测（连接蓝牙）可监测24小时
                        </p>
                    </div>
                </div>
                <div class="clear text-center mt-30">
                    <div class="clear img-300 bg-white full-radius dis-ib text-center line-h-300">
                        <img class="six-floor-aniv4 pos-r t-20 opa-0" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/six-floor-tipsv1.png" alt="">
                    </div>
                </div>
            </div>
        </div>
        <!-- seven floor -->
        <div class="clear full-w min-h-860-650-ipad bg-f8f7f5 seven-floor">
            <div class="container clear cur-d">
                <div class="col-sm-8 clear pt-80">
                    <p class="col-309DE2 f-50-36-ipad line-h-60 h-60 mt-5 mb-5 seven-floor-aniv1 pos-r t-20 opa-0">
                        专属APP
                    </p>
                    <p class="col-309DE2 f-50-36-ipad line-h-60 h-60 mt-5 mb-5 seven-floor-aniv2 pos-r t-20 opa-0">
                        无法常伴身边也能悉心关爱
                    </p>
                    <p class="col-666 f-36-28-ipad line-h-45 h-45 mt-20 mb-20 seven-floor-aniv3 pos-r t-20 opa-0">
                        让父母每天都能向我汇报健康
                    </p>
                    <p class="col-666 f-26-20-ipad line-h-35 mt-30 mb-15 seven-floor-aniv4 pos-r t-20 opa-0">
                        只要打开APP，心电仪与手机蓝牙连接成功后，父母就能一键开启监测，无需学习、无需心电图专业知识。监测结束后父母可以查看和分享自己心脏健康报告，简单、明了、易懂，更有三种监测类型提供选择，除了免费日常监测外还有15分钟、24小时监测报告，全方位监测各时段高发心脏疾病病征。
                    </p>
                </div>
                <div class="col-sm-4 clear pl-50 pt-80">
                    <img class="seven-floor-aniv5 pos-r t-20 opa-0" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/seven-floor-tipsv1.png" alt="">
                </div>
            </div>
        </div>
        <!-- eight floor -->
        <div class="clear full-w min-h-760-650-ipad eight-floor">
            <div class="container clear cur-d plr-15-0-ipad">
                <div class="col-sm-7 clear min-h-760 pos-r eight-floor-aniv1 t-20 opa-0">
                    <img class="pos-a b-0 l-0" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/eight-floor-tipsv1.png" alt="">
                </div>
                <div class="col-sm-5 clear pt-130">
                    <p class="col-309DE2 f-50-38-ipad line-h-60 h-60 mtb-20-0-ipad eight-floor-aniv1 pos-r t-20 opa-0">
                        监测报告图表化
                    </p>
                    <p class="col-309DE2 f-50-38-ipad line-h-60 h-60 mtb-20-0-ipad eight-floor-aniv2 pos-r t-20 opa-0">
                        父母一看就懂
                    </p>
                    <p class="col-666 f-26-20-ipad line-h-40 mt-30-0-iapd pt-30 mb-15 eight-floor-aniv3 pos-r t-20 opa-0">
                        悉心心电仪摒弃了复杂难懂的心电图数字，监测过程中，它可以分析展示出您的平均心率、异常快慢、健康风险，通过图表形式简单生动的表现出来，并会做出改善建议。监测结果一目了然，清晰易懂，更有各项专业级心率详细数据提供参考。
                    </p>
                </div>
            </div>
        </div>
        <!-- nine floor -->
        <div class="clear full-w min-h-860-760-ipad bg-f8f7f5 nine-floor">
            <div class="container clear cur-d">
                <div class="col-sm-7 clear pt-160-100-ipad">
                    <p class="col-309DE2 f-50-40-ipad line-h-60 h-60 mt-10 mb-10 nine-floor-aniv1 pos-r t-20 opa-0">
                        测量结果云端同步
                    </p>
                    <p class="col-666 f-40-26-ipad line-h-60 h-60 mt-10 mb-10 nine-floor-aniv2 pos-r t-20 opa-0">
                        父母在家测，我在办公室就知道
                    </p>
                    <p class="col-666 f-24-16-ipad line-h-40 mt-10 mb-20 pt-50 nine-floor-aniv3 pos-r t-20 opa-0">
                        只要监测时手机能够联网，监测结束后测量的结果会自动同步到云端，不论你身在何处，打开微信关注悉心康健公众号，就能实时了解家人的健康状况。
                    </p>
                    <div class="clear text-center mt-25 pt-30">
                        <img class="nine-floor-aniv4 pos-r t-20 opa-0" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/nine-floor-tipsv1.png" alt="">
                    </div>
                </div>
                <div class="col-sm-5 clear pos-r min-h-860-760-ipad nine-floor-aniv4 t-20 opa-0">
                    <img class="pos-a b-0 r-30-0-ipad" src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/nine-floor-tipsv2.png" alt="">
                </div>
            </div>
        </div>
        <!-- ten floor -->
        <div class="clear full-w min-h-250 ten-floor">
            <div class="container clear cur-d">
                <div class="clear col-sm-4 text-center pt-35 pb-35 text-center">
                    <div class="clear img-120 full-radius bg-a3d9fb mt-30 mb-10 line-h-120 text-center dis-ib">
                        <img src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/ten-floor-tipsv1.png" alt="">
                    </div>
                    <div class="full-w col-979797 f-18 text-center">
                        7天无理由退货
                    </div>
                </div>
                <div class="clear col-sm-4 text-center pt-35 pb-35 text-center">
                    <div class="clear img-120 full-radius bg-a3d9fb mt-30 mb-10 line-h-120 text-center dis-ib">
                        <img src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/ten-floor-tipsv2.png" alt="">
                    </div>
                    <div class="full-w col-979797 f-18 text-center">
                        15天换货
                    </div>
                </div>
                <div class="clear col-sm-4 text-center pt-35 pb-35 text-center">
                    <div class="clear img-120 full-radius bg-a3d9fb mt-30 mb-10 line-h-120 text-center dis-ib">
                        <img src="<%=request.getContextPath() %>/resources/img/HK_Pro_details/ten-floor-tipsv3.png" alt="">
                    </div>
                    <div class="full-w col-979797 f-18 text-center">
                        2年免费保修
                    </div>
                </div>
            </div>
        </div>
    </div>
   <%@ include file="../comm/footer.jsp" %> 
    <script src="<%=request.getContextPath() %>/resources/js/comm/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/shopping/HK_Pro_details.js"></script>
</body>
</html>