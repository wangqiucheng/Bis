$(document).ready(function() {
	
/*	$(".appraise-more").click(function(){
		var path = $("base").attr("href");
		var productId=$("#productId").val();
		var page_num = 0;
		var page_size=2;
  	   	var flag = Math.ceil(page_total/page_size);
  	   	var page_offset;
  	   	if(page_num == 0 ){
  		 page_offset =page_num;
  	   	}if(page_num != 0 ){
  		   page_offset = (page_num) * page.size;
		var appraise_more=1;
		$.ajax({
            url: path +"shopping/Uappraise1",
            type: "post",
            dataType: "text",
            async: false,
            data: {
                "appraise_more": appraise_more,
            },
            success: function(success) {
            	if(success==1){
                window.location.href = path +"shopping/Uappraise?productId="+productId+"&appraise_more="+appraise_more;
             }
            }
        });
	});
})*/