$(document).ready(function() { 
    /*评价部分js*/
    $(".appraise-protips").mouseenter(function() {
        $(this).find(".appraise-btninto").stop(true);
        $(this).find(".appraise-btninto").fadeIn(500);
    });
    $(".appraise-protips").mouseleave(function() {
        $(this).find(".appraise-btninto").stop(true);
        $(this).find(".appraise-btninto").fadeOut(500);
    });
    /*评价星级部分js*/
    $(".star-tips").mouseenter(function() {
        var allstartips = $(".star-tips").length;
        var thisindex = $(this).index();
        for (var i = 0; i < allstartips; i++) {
            var str = ".star-tips:eq("+i+")"
            if (i<=thisindex) {
                $(str).addClass("bg-starsel");
            }else{
                $(str).removeClass("bg-starsel");
            }
            switch (thisindex) {
                case 0:
                    $(".face-item").text("失望");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev1.png)");
                    break;
                case 1:
                    $(".face-item").text("一般");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev2.png)");
                    break;
                case 2:
                    $(".face-item").text("满意");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev3.png)");
                    break;
                case 3:
                    $(".face-item").text("喜欢");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev4.png)");
                    break;
                case 4:
                    $(".face-item").text("超爱");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev5.png)");
                    break;
                default:
                    $(".face-item").text("超爱");
                    $(".face-tips").css("background-image","url(../../img/user/Appraise/facev5.png)");
                    break;
            };
        };
    });
    $(".face-main-box").mouseleave(function() {
        var recordfaceval = parseInt($(".record-face").val());
        switch (recordfaceval) {
            case 0:
                $(".star-tips").removeClass("bg-starsel");
                $(".face-item").text("超爱");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev5.png)");
                break;
            case 1:
                $(".star-tips").removeClass("bg-starsel");
                $(".star-tipsv1").addClass("bg-starsel");
                $(".face-item").text("失望");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev1.png)");
                break;
            case 2:
                $(".star-tips").removeClass("bg-starsel");
                $(".star-tipsv1").addClass("bg-starsel");
                $(".star-tipsv2").addClass("bg-starsel");
                $(".face-item").text("一般");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev2.png)");
                break;
            case 3:
                $(".star-tips").removeClass("bg-starsel");
                $(".star-tipsv1").addClass("bg-starsel");
                $(".star-tipsv2").addClass("bg-starsel");
                $(".star-tipsv3").addClass("bg-starsel");
                $(".face-item").text("满意");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev3.png)");
                break;
            case 4:
                $(".star-tips").removeClass("bg-starsel");
                $(".star-tipsv1").addClass("bg-starsel");
                $(".star-tipsv2").addClass("bg-starsel");
                $(".star-tipsv3").addClass("bg-starsel");
                $(".star-tipsv4").addClass("bg-starsel");
                $(".face-item").text("喜欢");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev4.png)");
                break;
            case 5:
                $(".star-tips").removeClass("bg-starsel");
                $(".star-tipsv1").addClass("bg-starsel");
                $(".star-tipsv2").addClass("bg-starsel");
                $(".star-tipsv3").addClass("bg-starsel");
                $(".star-tipsv4").addClass("bg-starsel");
                $(".star-tipsv5").addClass("bg-starsel");
                $(".face-item").text("超爱");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev5.png)");
                break;
            default:
                $(".star-tips").removeClass("bg-starsel");
                $(".face-item").text("超爱");
                $(".face-tips").css("background-image","url(../../img/user/Appraise/facev5.png)");
                break;
        };
    });
    $(".star-tips").click(function() {
        var thisindex = $(this).index();
        $(".record-face").val(thisindex+1);
    });
    /*评价列表页js*/
    $(window).scroll(function() {
        backscrollshow();
    });
    $(".appraise-backup").click(function() {
        var speed = 200;
        $('body,html').animate({ scrollTop: 0 }, speed);
    });
    /*返回顶部按钮隐藏显示*/
    backscrollshow();
    function backscrollshow(){
        //获取网页的总高度 
        var htmlHeight = document.body.scrollHeight || document.documentElement.scrollHeight;
        //获取网页的可视高度，  
        var clientHeight = document.body.clientHeight || document.documentElement.clientHeight;
        //获取滚动条的top位置，  
        var scrollTop = document.body.scrollTop || document.documentElement.scrollTop;
        var footerheight = $(".footer").height()
        var backscroll = htmlHeight-scrollTop-clientHeight+70;
        if (backscroll >= footerheight) {
            $(".appraise-backup").show();
        }
        if (backscroll < footerheight) {
            $(".appraise-backup").hide();
        }
    }
   
});
   