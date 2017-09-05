<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
 <!DOCTYPE dwr PUBLIC "-//GetAhead Limited//DTD Direct Web Remoting 3.0//EN" "http://getahead.org/dwr//dwr30.dtd">
<html>
<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Login Here</title>
		<style type="text/css"></style>		
		<script src="<%=request.getContextPath() %>/resources/js/jquery-1.11.1.min.js"></script><!--独立js文件-->
		<script src="<%=request.getContextPath() %>/resources/js/bootstrap.min.js"></script><!--独立js文件-->
		<script src="http://cdn.bootcss.com/jquery-mockjax/1.6.2/jquery.mockjax.min.js"></script> <!--独立js文件 模拟实现-->
</head>
<body>

<div>
<a id="btn_sumbit" href="#">点这里</a>

</div>	    
<script type="text/javascript">
			$('#btn_sumbit').click(function() {
			//alert("Data Loaded: ");
			/* $.post("http://localhost:8080/bisa-teama-controller/l/ajaxtest", { accessname: "18654541222", code: "123456" },
					   function(data){
					     alert("Data Loaded: ");
					   }); */
			   //向后台发送处理数据  
 	        $.ajax({  //当点击发送验证码时,可能向后台执行的ajax事件
	            type: "POST", //用POST方式传输  
	            dataType: "text", //数据格式:JSON  
	            url: 'http://localhost:8080/bisa-teama-controller/l/ajaxtest', //目标地址  {name:name,gender:gender}
	            data: { accessname: "18654541222", code: "123456" },  
	            error: function (XMLHttpRequest, textStatus, errorThrown) { },  
	            success: function (){ 
	            	 alert("验证码已发送！");
	            }  
	        });  
		});
</script>
</body>
</html>