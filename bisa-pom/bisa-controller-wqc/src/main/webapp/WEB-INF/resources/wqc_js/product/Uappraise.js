$(document).ready(function() {
	
	$(".appraise-more").click(function(){
		var path = $("base").attr("href");
		var productId=$("#productId").val();
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
})