$(document).ready(function() {
    $(".add_shopcar").click(function() {
        var path = "";
    	path = $("base").attr("href");
    	var packId = $("input[name='packId']").val();
     //   var userId = $("input[name='userId']").val();
        var serviceId = $("input[name='serviceId']").val();
        var issingleorcombo = $("input[name='issingleorcombo']").val();
        var service_number = $("input[name='service_number']").val();
		$.ajax({
            url: path + "addCart",
            type: "post",
            dataType: "text",
            async: false,
            data: {
                "packId": packId,
               // "userId": userId,
                "serviceId": serviceId,
                "service_number": service_number,
                "issingleorcombo": issingleorcombo,
            },
            success: function(success) {
                var i = "Cart";
                window.location.href = path + i;
            }
        });

    });
});