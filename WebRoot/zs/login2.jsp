<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<title>车船税联网征收系统数据平台</title>
		<meta name="generator" content="MShtml 8.00.6001.18783" />
		<meta name="copyright" content="Copyright 2014 - L-Sky.Cn" />
		<meta name="Author" content="车船税代收代缴联网征收系统 - L-Sky.Cn" />
		<meta name="keywords" content="车船税代收代缴联网征收系统" />
		<meta name="description" content="车船税代收代缴联网征收系统登陆页面" />
		<!-- <script src="ccs/js/jquery-1.6.4.min.js"></script> -->
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="layer/layer.js"></script>
		<script type="text/javascript" src="js/castcode.js"></script>
		<link rel="stylesheet" type="text/css" href="css/login2style.css" />
		<style type="text/css">
.download {
	margin: 20px 33px 10px; *
	margin-bottom: 30px;
	padding: 5px;
	border-radius: 3px;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	background: #e6e6e6;
	border: 1px dashed #df0031;
	font-size: 14px;
	font-family: Comic Sans MS;
	font-weight: bolder;
	color: #555
}

.download a {
	padding-left: 5px;
	font-size: 14px;
	font-weight: normal;
	color: #555;
	text-decoration: none;
	letter-spacing: 1px
}

.download a:hover {
	text-decoration: underline;
	color: #36F
}

.download span {
	float: right
}
</style>
	<script type="text/javascript">
	var basePath = '<%=basePath%>';
	document.onkeydown=keyDownSearch;
	function keyDownSearch(e) {  
	    // 兼容FF和IE和Opera  
	    var theEvent = e || window.event;  
	    var code = theEvent.keyCode || theEvent.which || theEvent.charCode;  
	    if (code == 13) {  
	    	onlogin();//具体处理函数  
	        return false;  
	    }  
	    return true;  
	}
	
	function loginUrl(){
		layer.config({
			extend:'skin/seaning/style.css'
		});
		if(window.top!=window.self){
			top.location='../index.jsp';
		}
		//layer.alert('请使用IE8及以上版本的浏览器，推荐使用chrome浏览器以获得最佳效果体验', {icon: 6});
	}
	
	//ie6不认识trim方法
	if(typeof String.prototype.trim !== 'function') {
	    String.prototype.trim = function() {
	        return this.replace(/^\s+|\s+$/g, ''); 
	    }
	}		
	function onlogin(){
		var basePath = '<%=basePath%>';
        var name = $("#name").val();
        var pword = $("#password").val();
        $("#name").focus(function(){
          	$("#umsg").text("");
        });
       $("#password").focus(function(){
          	$("#umsg").text("");
       });
       if(name.trim()==""){
	         $("#umsg").text("用户名不能为空");
	         //$("#name").focus();
       }else if(pword.trim()==""){
	         $("#umsg").text("密码不能为空");
	         //$("#password").focus();
       }else{
    	   if("26100"==name){
    			name="2000000";
    		}
	         $.ajax({
	            type:"POST",
	        	url:basePath+'loginServlet',//"loginServlet",http://192.168.10.216:8001/ccscx
	            data:{
	    			time:new Date().getTime(),
	    			username:name,
	    			password:pword
	    		},
	            //data:{"userName":name,"passWord":pword},
	            beforeSend:function(){
	              $("#umsg").text("正在登录系统,请稍后...");
	              return true;
	            },
	    		success:function(data) {
	                //注意此处从数据库传来的data数据有记录总行数的total列
	                if(data=='ok'){
	                	//location.href = "main2.jsp";//?username="+"form1.username.value
	                	//var divtitle = '<div style="width:1000px; text-align:left; font-weight:bolder; font-size:larger; color: #4673A7;">陕西省车船税联网征收系统数据平台</div>';		
	                	var divtitle = '陕西省车船税联网征收系统数据平台';
	                	layer.open({
					      type: 2,
					      title: divtitle,
					      shadeClose: true,
					      shade: 0,
					      scrollbar: false,
					      maxmin: true, //开启最大化最小化按钮
					      area: ['1000px', '600px'],
					      content: 'link.jsp'
					    });

	                			
	                			
	                	return true;
	                }else{
	                	$("#umsg").text(data); ;
	                	return false;
	                }
	             },
	             error: function(XMLHttpRequest, textStatus, errorThrown) {
	                 layer.alert('服务器异常，建议更换浏览器后重试！', {
	      			     icon: 9,
	      			     time: 3*1000,
	      			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
	      			 	});
	                 /*
	                 alert("服务器异常，请稍候重试!");
	                 alert(XMLHttpRequest.readyState);
	                                alert(XMLHttpRequest.readyState);
	                                alert(textStatus);
	                 */
                 }
	         
	         });
	       
	       }
	      }
      
	
		var hasFlash = false;
		if (window.ActiveXObject) {
			try {
				if (new ActiveXObject("ShockwaveFlash.ShockwaveFlash"))
					hasFlash = true;
			} catch (e) {
			}
		} else {
			if (navigator.plugins["Shockwave Flash"]) {
				hasFlash = true;
			}
		}
		var elems = document.getElementsByTagName("div");
		for ( var i in elems) {
			if (!hasFlash && elems[i].className == "aleoflash-gif")
				elems[i].style.display = "block";
			else if ((!hasFlash && elems[i].className == "aleoflash-swf"))
				elems[i].style.display = "none";
		}
		
	</script>
	</head>

	<body  onload="loginUrl()">
	
	<div class="aleoflash-gif" style="display: none;">
		<img src="images/banner2.gif" border="0" />
	</div>
	<div class="aleoflash-swf" style="display: block; ">
		<embed src="images/banner2.swf" quality="high"
			type="application/x-shockwave-flash" wmode="transparent" width="100%" height="200"
			pluginspage="http://www.macromedia.com/go/getflashplayer"
			allowScriptAccess="always" ></embed>
	</div>
	
	<div class="main">
	<!-- 
			<div class="header hide">
				车船税查询统计系统 v1.0
			</div>
	 -->
			<div class="content">
				<div class="title hide">
					用户登录
				</div>

				<fieldset>
					<div class="checkbox">
						<label for="remember">
							<span id="umsg" style="color: red"></span>
						</label>
					</div>
					<div class="input">
						<input class="input_all name" name="name" id="name" type="text"
							maxLength="24" value=""  />
					</div>
					<div class="input">
						<input class="input_all password" name="password" id="password"
							type="password" value="" maxLength="24"  />
					</div>

					<div class="enter">
						<input class="button hide" type="submit" value="登录"
							onclick="onlogin()"/>
					</div>
				</fieldset>

			</div>
		</div>

	</body>
	<!--[if IE 6]>
		<script type="text/javascript" src="js/placeholder.js"></script>
		<script type="text/javascript" src="js/belatedpng.js" ></script>
	<![endif]-->

</html>
