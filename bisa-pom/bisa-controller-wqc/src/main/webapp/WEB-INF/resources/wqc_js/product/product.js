var path = "";

$(document).ready(function() {
	path=$("base").attr("href");
});
function add_shop(){
	$("add_product").attr("disable",true);
	if (this.ajaxRequest_ != undefined && this.ajaxRequest_.readyState < 4) {
		layer.alert("请稍后", {
			yes : function(ly) {
				layer.close(ly);
			}
		})
		return false;
	}
	var packId=$("input[name='packId']").val();
	var userId=$("input[name='userId']").val();
	var serviceId=$("input[name='serviceId']").val();
	var issingleorcombo=$("input[name='issingleorcombo']").val();
	$.ajax({
		url : path + "addCart",
		type : "post",
		dataType : "text",
		async : false,
		data : {
			"packId" : packId,
			"userId":userId,
			"serviceId":serviceId,
			"issingleorcombo":issingleorcombo,
		},
		success : function(success) {
			//console.log(success);
		window.location.href=path+"Cart?&userId="+userId;
			
			
		},error:function(){
			//console.log("132321312");
		}

	});

}