var path = "";

$(document).ready(function() {
	path=$("base").attr("href");
});

	function del_shop(){
		var deleteId=$("input[name='deleteId']").val();	
		var userId=$("input[name='userId']").val();
		$.ajax({
			url : path + "delCart",
			type : "post",
			dataType : "text",
			async : false,
			data : {
				"deleteId" : deleteId,
				
			},
			success : function(result) {
				if(result=="success"){
					window.location.href=path+"Cart?&userId="+userId;
				}	
				
			},error:function(){
				
			}

		});
	}