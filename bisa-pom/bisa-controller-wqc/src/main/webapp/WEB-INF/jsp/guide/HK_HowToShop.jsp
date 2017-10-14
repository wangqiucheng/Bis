<%@ page language="java" contentType="text/html;charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- necessary -->
    <meta name="keywords" content="1,2,3">
    <meta name="description" content="">
    <!-- description -->
    <meta name="renderer" content="webkit">
   <title>碧沙康健_购物指南</title>
    <!-- base -->
    <link href="<%=request.getContextPath() %>/resources/ctrl/Font-Awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/bootstrap.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/comm/base.css" rel="stylesheet">
    <link href="<%=request.getContextPath() %>/resources/css/news/HK_News.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
          <script type="text/javascript">
			var http_request ="<%=request.getContextPath() %>";
			var request_url ="<%=request.getMethod() %>";
			var request_type ="<%=request.getAttribute("request_type") %>";
		</script>
</head>

<body>
   <jsp:include page="./../comm/header.jsp"/>
    <div class="wrap clear">
        <div class="container clear pl-0 pr-0">
            <div class="clear">
                <p class="pt-10 pb-10 pl-15 pr-15 line-h-20 cur-d ">
                    <a class="col-666 t-nonehove hovecol-309DE2" id="index" href="">首页 </a> >
                    <span class="col-252525 t-nonehove">购物指南</span>
                </p>
            </div>
        </div>
        <div class="clear full-w">
            <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/banner.jpg" alt="">
        </div>
        <div class="container pl-0 pr-0 clear bg-f5f5f5 pt-30 pb-70 mb-60">
            <div class="col-sm-3 pl-30 pr-20">
                <div class="clear bg-white pd-40-10-ipad">
                    <p class="mt-10 mb-10 col-212121 f-30 line-h-40 cur-d">
                        购物指南
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-40 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv1" id="HTS-listv1">
                        购物流程
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-20 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv2" id="HTS-listv2">
                        包邮政策
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-20 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv3" id="HTS-listv3">
                        下单及支付时效
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-20 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv4" id="HTS-listv4">
                        发货时效
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-20 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv5" id="HTS-listv5">
                        支付方式
                    </p>
                    <p class="col-757575 f-20-16-ipad line-h-25 mt-20 mb-20 cur-p hovecol-309DE2 HTS-list HTS-listv6" id="HTS-listv6">
                        售后政策
                    </p>
                </div>
            </div>
            <div class="clear col-sm-9 pr-30 pl-0">
                <div class="clear bg-white HTS-tips HTS-tipsv1 pb-280">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20">
                        购物流程
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        1、在悉心康健商城选择心仪的商品，添加到购物车或立即购买。
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv1-explainv1.jpg" alt="">
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        2.进入购物车查看选购商品，点击结算按钮进入订单页面。
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv1-explainv2.jpg" alt="">
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        3.确认订单商品内容后点击立即下单进入支付页面。
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv1-explainv3.jpg" alt="">
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        4.在支付页面选择支付方式并付款后就购买成功啦，商品会尽快发货配送到家。
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv1-explainv4.jpg" alt="">
                </div>
                <div class="clear bg-white HTS-tips HTS-tipsv2 pb-280 dis-n">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20">
                        包邮政策
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10">
                        香港、澳门地区
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        一次性惠顾满HKD$300（实付金额），即可享受免费送货服务，购物金额少于指定金额将会收取HKD$30作为运费。
                    </p>
                    <p class="pt-20 f-20 col-696969 pl-50 line-h-30 pb-10">
                        大陆、国外地区
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        一次性惠顾满HKD$1500（实付金额），即可享受免费送货服务，购物金额少于指定金额将会按照您下单时所选地址计算运费金额。
                    </p>
                </div>
                <div class="clear bg-white HTS-tips HTS-tipsv3 pb-280 dis-n">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20">
                        下单及支付时效
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-20 pr-50">
                        1.在线支付的订单通常情况下支付时效为48小时，过期后订单将会自动关闭
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv3-explainv1.jpg" alt="">
                    <p class="pt-20 f-20 col-696969 pl-50 line-h-20 pb-10 f-w">
                        备注：
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-20 pb-20 pr-50">
                        在您提交订单之后页面上会有相应的时间提示，请注意查看，不要错过支付时效哦。
                    </p>
                </div>
                <div class="clear bg-white HTS-tips HTS-tipsv4 pb-280 dis-n">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20 pr-50">
                        发货时效
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        我们将参照支付顺序在7天内发出，最快情况下我们的商品会在24小时内出库的，受客观物流因素影响，可能会有部分延迟，请您耐心等待。
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        注：快递配送可能会因为交通、天气等原因有所延误，建议您登陆悉心康健商城，到订单详情或者快递公司官网关注配送进度。
                    </p>
                </div>
                <div class="clear bg-white HTS-tips HTS-tipsv5 pb-280 dis-n">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20 pr-50">
                        支付方式
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        悉心康健提供微信、支付宝等第三方平台支付，暂时不支持货到付款的支付方式，您购买的时候一定要注意哦，以免影响您的正常收货。
                    </p>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv5-explainv1.jpg" alt="">
                </div>
                <div class="clear bg-white HTS-tips HTS-tipsv6 pb-280 dis-n">
                    <p class="pt-40-20-ipad f-50-40-ipad col-b0b0b0 pl-50 line-h-70-50-ipad pb-20 pr-50">
                        售后政策
                    </p>
                    <div class="clear ml-50 mr-50 bor bor-b bor-col-f5f5f5">
                    </div>
                    <img class="full-w" src="<%=request.getContextPath() %>/resources/img/news/HK_HowToShop/HTS-tipsv6-explainv1.jpg" alt="">
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        1、凡通过悉心康健商城购买本产品的用户，可在自签收次日起七日内享受无理由退货服务。退货时用户须出示有效购买凭证，并退回发票。用户须保证退货商品保持原有品质和功能、外观完好、商品本身及配件的商标和各种标识完整齐全，如有赠品需一并退回。如果商品出现人为损坏、包装箱缺失、零配件缺失的情况，不予办理退货。退货时产生的物流费用由用户承担。
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        自收到退货商品之日起七日内向用户返还已支付的货款。退款方式与付款方式相同。具体到账日期可能会受银行、支付机构等因素影响。
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        2、自用户签收次日起七日内，发生非人为损坏性能故障，经由悉心售后服务中心检测确认后，为用户办理退货业务，退货时用户须出示有效购买凭证，并退回发票。如有赠品需一并退回。
                    </p>
                    <p class="pt-10 f-20 col-696969 pl-50 line-h-30 pb-10 pr-50">
                        3、自用户签收次日起七日后并且在一年内，发生非人为损坏性能故障，请直接联系爱和公司，以便更快捷获得售后服务，服务电话：400-XXX-XXXX。
                    </p>
                </div>
            </div>
        </div>
    </div>
    
   <jsp:include page="./../comm/footer.jsp"/>
   
    <script src="<%=request.getContextPath() %>/resources/js/comm/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/bootstrap.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/comm/base.js"></script>
    <script src="<%=request.getContextPath() %>/resources/js/news/HK_News.js"></script>
        <script src="<%=request.getContextPath() %>/resources/js/guide/guide.js"></script>

</body>

</html>