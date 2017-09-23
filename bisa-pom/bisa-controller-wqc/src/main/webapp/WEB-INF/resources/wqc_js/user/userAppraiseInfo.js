$(document).ready(function() {
	userAppraiseInfo();
	function userAppraiseInfo(){
	    var i=$(".appraises-one").val();
	    var appraise_one=$(".text-appraise").val(i);
	    var appraise_degree=$(".record-face").val();
	    var order_detail_guid=$(".text-orderguid").val();
		$.ajax({
			url : path + "addAppraise",
			type : "post",
			dataType : "text",
			async : false,
			data : {
				"appraise_one" : appraise_one,
				"appraise_degree":appraise_degree,
				"order_detail_guid":order_detail_guid,
			},
			success : function(success) {
				window.location.href=path+"AppraiseSuccess";	
			},error:function(){
			}

		});
	    
	}
});