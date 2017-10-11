$(document).ready(function() {
	var path=$("base").attr("href");
	var page_offset=null;
	var productId=$("#productId").val();
	 $(".appraise-more").click(function() {
		 //判断页面有没有pageOffset
		 var dangpath = window.location.href;
		 var o=dangpath.indexOf("userAppraise");
		 if(o<0){
			 page_offset=0;
		 }else{
		 var request_url =location.href;
		 var num=request_url.indexOf("?");
		 request_url=request_url.substr(num+1);
		 var arr=request_url.split("&");
		 for(var i=0;i<arr.length;i++){
			 num=arr[i].indexOf("=");
			 if(num>0){ 
				 name=arr[i].substring(0,num);
			     value=arr[i].substr(num+1);
			     if(name="pageOffset"){
			    	 page_offset=value; 
			     }
			 }
		 	}
		 }
		 
		 $.ajax({
				type : "GET", // 用GET方式传输
				dataType : 'json', // 数据格式:JSON
				url : path+"l/shopping/addUappraise?productId="+productId+"&pageOffset="+page_offset, // 目标地址
				success : function(data) {
					console.log(data);
					console.log(data.length);
					var datas = eval(data);
					var htmls=null;
						for(var i=0;i<datas.length;i++){
							//console.log("datas[i]:"+datas[i].appraise_degree);
							//$(".add-appraise").parent().last().append(pijie(datas[i]));
							htmls=pijie(datas[i]);
						function pijie(str){
							var strVar="";
							if(str.appraise_degree==1){
								str.appraise_degree="失望";
							}else if(str.appraise_degree==2){
								str.appraise_degree="一般";
							}else if(str.appraise_degree==3){
								str.appraise_degree="满意";
							}else if(str.appraise_degree==4){
								str.appraise_degree="喜爱";
							}else{
								str.appraise_degree="超爱";
							}
							strVar += " <div class=\"clear mt-20 full-w bg-white pt-40 pb-35 pr-15\">";
							strVar += "                    <div class=\"clear col-sm-2 pl-0 pr-0\">";
							strVar += "                        <img class=\"img-70 pull-right\" src=\"" ;
							strVar +=		"..\/..\/img\/user\/Appraise\/appraise-portraitv3.png\" ";
							strVar +=		"alt=\"\">";
							strVar += "                    <\/div>";
							strVar += "                    <div class=\"clear col-sm-10 pl-20 pr-20\">";
							strVar += "                        <p class=\"line-h-20 mb-20 clear\">";
							strVar += "                            <input type=\"hidden\" class=\"appraisesuccess-state\" value=\"0\">";
							strVar += "                            <span class=\"col-8d665a f-18 pull-left dis-ib\">" ;
							strVar += str.user_guid ;
							strVar +=		                         "<\/span>";
							strVar += "                            <span class=\"f-20 col-ffd600 dis-ib pull-right cur-d mr-10 appraisesuccess-statetext\">";
							strVar += str.appraise_degree;
							strVar += "                            <\/span>";
							strVar += "                            <span class=\"img-20 pull-right dis-ib mr-10 cur-d bg-faceauto appraisesuccess-stateface\">";
							strVar += "                            <\/span>";
							strVar += "                        <\/p>";
							strVar += "                        <p class=\"full-w mb-25\">";
							strVar += "                            <span class=\"f-14 col-b0b0b0\">" ;
							strVar += str.update_time ;
							strVar +=		                         "<\/span>";
							strVar += "                        <\/p>";
							strVar += "                        <p class=\"f-14 col-333 line-h-20\">";
							strVar += str.appraise_one;
							strVar += "                        <\/p>";
							strVar += "                    <\/div>";
							strVar += "                <\/div>";
							console.log(strVar);
							return strVar;
						}
							
						}
						//console.log(htmls);
						$("#appraiseList").html(htmls);
					}
				});
	 });
});