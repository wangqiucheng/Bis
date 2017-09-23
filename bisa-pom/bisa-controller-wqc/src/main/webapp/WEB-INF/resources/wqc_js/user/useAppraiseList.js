$(document).ready(function() {
	var path=$("base").attr("href");
		//tab选项卡切换
		var dangpath = window.location.href;
		//alert(dangpath);
			var i=dangpath.indexOf("useAppraise1");
	        var m=dangpath.indexOf("useAppraise2");
	        console.log(i);
			if(i>0){	
		        $(".Appraise-tabtips").hide();
		        $(".Appraise-tabtipsv2").show();
		        $(".Appraise-control").removeClass("col-active");
		        $(".Appraise-tabtipsv2").addClass("col-active");
			}
	        if(m>0){        
		        $(".Appraise-tabtips").hide();
		        $(".Appraise-tabtipsv3").show();
		        $(".Appraise-control").removeClass("col-active");
		        $(".Appraise-tabtipsv3").addClass("col-active");
	        }
	       
	});
	

