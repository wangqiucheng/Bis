$(document).ready(function() {
	var path=$("base").attr("href");
	 var productSize=$("#productSize").val();
	 if(productSize>2){
		 $(".appraise-more").show();
	 }else{
		 $(".appraise-more").hide(); 
	 }
	 $(".appraise-more").click(function() {
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
		  var pagesize=2;
		  request_url = "&pageOffset="+page_offset+"&pageSize="+pageSize;
		 $.ajax({
				type : "GET", // 用GET方式传输
				dataType : 'json', // 数据格式:JSON
				url : request_url, // 目标地址
				error : function() {
				},
				success : function(data) {
					
					

						}
				});
	 });
	 function pijie(str){
		 var strVar="";
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
		 strVar +=		"游先生" ;
		 strVar +=		                         "<\/span>";
		 strVar += "                            <span class=\"f-20 col-ffd600 dis-ib pull-right cur-d mr-10 appraisesuccess-statetext\">";
		 strVar += "                                超爱";
		 strVar += "                            <\/span>";
		 strVar += "                            <span class=\"img-20 pull-right dis-ib mr-10 cur-d bg-faceauto appraisesuccess-stateface\">";
		 strVar += "                            <\/span>";
		 strVar += "                        <\/p>";
		 strVar += "                        <p class=\"full-w mb-25\">";
		 strVar += "                            <span class=\"f-14 col-b0b0b0\">" ;
		 strVar +=		"2017年9月19日" ;
		 strVar +=		                         "<\/span>";
		 strVar += "                        <\/p>";
		 strVar += "                        <p class=\"f-14 col-333 line-h-20\">";
		 strVar += "                            用了觉得非常棒，我要买1000个！！！！为什么会有这么好用的东西呢？？？棒呆！<\/br>鼎力推荐！快买啊！！";
		 strVar += "                        <\/p>";
		 strVar += "                    <\/div>";
		 strVar += "                <\/div>";

	 }
});