$(document).ready(function() {
    /*选择头像的弹出层*/
    $(".set-heads").click(function() {
        $(".show-selhead").show();
        $(".selhead-content").removeClass("ani-selhead-logoout");
        $(".selhead-content").addClass("ani-selhead-logoin");
    });
    $(".show-selhead").on("click", function(event) {
        event.stopPropagation();
        var target = event.target;
        if (!$(target).closest(".selhead-content").length > 0 || $(target).attr("class").indexOf("close-mod") != -1) {
            $(".selhead-content").removeClass("ani-selhead-logoin");
            $(".selhead-content").addClass("ani-selhead-logoout");
            $(".show-selhead").fadeOut();
        };
    });
    /*选择头像部分图像操作部分js*/
    cutimg();
    function cutimg(){
        $('#show-main-img').cropper({
            aspectRatio: 1 / 1,
            crop: function(e) {
                var nowspace = $('#show-main-img').cropper("getCroppedCanvas",{width:200,height:200});
                var dataurl = nowspace.toDataURL('image/jpeg');
                $("#show-little-imgv1").attr("src",dataurl);
                $("#show-little-imgv2").attr("src",dataurl);
            }
        });
    };
    
    $('#sel-file').change(function(e){
        var file = e.target.files[0];
        var bloburl = URL.createObjectURL(file);
        $('#show-main-img').attr("src",bloburl);
        $('#show-main-img').cropper("destroy");
        cutimg();
    });
    $(".cro-btn-big").click(function(){
        $('#show-main-img').cropper("zoom",0.1);
    })
    $(".cro-btn-small").click(function(){
        $('#show-main-img').cropper("zoom",-0.1);
    })
    $(".cro-btn-left").click(function(){
        $('#show-main-img').cropper("rotate",-90);
    })
    $(".cro-btn-right").click(function(){
        $('#show-main-img').cropper("rotate",90);
    })
    $(".cro-btn-reset").click(function(){
        $('#show-main-img').cropper("reset");
    })
    $(".cro-btn-submit").click(function(){
        var submitspace = $('#show-main-img').cropper("getCroppedCanvas",{width:200,height:200});
        var submiturl = submitspace.toDataURL('image/jpeg');
        console.log(submiturl);
        $.ajax({
             type: "POST", //用POST方式传输
             dataType: "json", //数据格式:JSON
             url: http_request+'/l/upload_portrait', //目标地址 
             data: { user_guid: user.user_guid, img_portrait: submiturl },//传参数
             error: function (XMLHttpRequest, textStatus, errorThrown) { },
             success: function (){
                  alert("验证码已发送！");
             }
        	
        });
        
        var layindex = layer.load(2, {
          shade: [0.4,'#000'] //0.1透明度的白色背景
        });
        //此处用setTimeout演示ajax的回调
        setTimeout(function(){
          layer.close(layindex);
        }, 3000);
        
    })
/*    var canvas = document.getElementById("canvas");
        canvas.toBlob(function(blob) {
        var newImg = document.createElement("img"),
          url = URL.createObjectURL(blob);

      newImg.onload = function() {
        // no longer need to read the blob so it's revoked
        URL.revokeObjectURL(url);
      };
      https://developer.mozilla.org/zh-CN/docs/Web/API/HTMLCanvasElement/toBlob
      newImg.src = url;
      document.body.appendChild(newImg);
    });*/
});