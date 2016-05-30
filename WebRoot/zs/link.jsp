<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>link</title>
<style>
/*
{ margin:0; padding:0;}
	background-image: url("images/bg4.jpg");
*/
body{
	background-repeat: no-repeat; 
	background-position: center;
}
.layertitle{
	width:1000px; text-align:center; font-weight:bold; font-size:large; color: navy;
}
ul{width:900px; }
ul,li{ list-style:none; margin:0; padding:0; float:left; display: inline;overflow:hidden;}
img{border:0;}
.brandsShow{ width:1200px; height:620px; margin:0 auto; }
.brandsShow ul{ margin-left:-20px; width:1225px; height:auto; }
.brandsShow ul li{ float:left; display:inline; width:160px; height:153px; }
.flip-container {perspective: 1000;
-webkit-perspective: 1000px; /*父类容器中 perspective 子类允许透视*/
-moz-perspective: 1000px;
 -ms-perspective: 1000px;
 -o-perspective: 1000px;
 perspective: 1000px;
 margin:0px auto; float:left; margin-left:110px; margin-bottom:50px; border:0px ;}
 /*
.flip-container:hover .back {transform: rotateY(0deg); -webkit-transform: rotateY(0deg);-moz-transform: rotateY(0deg);-ms-transform: rotateY(0deg);-o-transform: rotateY(0deg); z-index:2;}
.flip-container:hover .front { transform: rotateY(180deg);-webkit-transform: rotateY(180deg);-moz-transform: rotateY(180deg);-ms-transform: rotateY(180deg);-o-transform: rotateY(180deg); z-index:1}
 */
.flip-container, .front, .back {width: 160px;height: 153px;}
.flipper {transition:transform 0.6s ease-out;
transition: transform .5s ease-in-out;
-webkit-transition: transform .5s ease-in-out;
-moz-transition: transform .5s ease-in-out;
-ms-transition: transform .5s ease-in-out;
-o-transition: transform .5s ease-in-out;
-webkit-transform-style: preserve-3d; /*使其子类变换后得以保留 3d转换后的位置*/
-moz-transform-style: preserve-3d;
 -ms-transform-style: preserve-3d;
 -o-transform-style: preserve-3d;
 transform-style: preserve-3d;
 display:block;position: relative;}
.front, .back {backface-visibility: hidden;transition: 0.6s ease-out;-webkit-transition: .6s ease-out; -webkit-transform-style: preserve-3d; -moz-transform-style: preserve-3d; -ms-transform-style: preserve-3d;-o-transform-style: preserve-3d;transform-style: preserve-3d;position: absolute;top: 0;left: 0;}
.front img, .back img{ width:160px; height:153px; overflow:hidden;}
.front {z-index: 2;transform: rotateY(0deg);transform: rotateY(0deg); -webkit-transform: rotateY(0deg);-moz-transform: rotateY(0deg);-ms-transform: rotateY(0deg);-o-transform: rotateY(0deg);}
.back { z-index:1;transform: rotateY(-180deg);transform: rotateY(-180deg);-webkit-transform: rotateY(-180deg);-moz-transform: rotateY(-180deg);
-ms-transform: rotateY(-180deg);-o-transform: rotateY(-180deg);}
</style>
<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
<script type="text/javascript" src="layer/layer.js"></script>
<script language="javascript">
	var basePath = '<%=basePath%>';
	window.onload=function(){
		layer.config({//parent.
			extend:'skin/seaning/style.css'
		});
	}
	function gotoPage(pageid){
		var divtitle;
		if(pageid=='hzcx'){
			divtitle = '<div style="width:1000px; text-align:center; font-weight:bold; font-size:large; color: #4673A7;">全省车船税代征情况汇总表</div>';
		}else if(pageid=='mxcx'){
			divtitle = '<div style="width:1000px; text-align:center; font-weight:bold; font-size:large; color: #4673A7;">全省车船税代征情况明细表</div>';
		}else if(pageid=='jdcx'){
			divtitle = '<div style="width:1000px; text-align:left; font-weight:bold; font-size:large; color: #4673A7;">全省车船税代征进度统计分析</div>';
		}else if(pageid=='sdcx'){
			divtitle = '<div style="width:1000px; text-align:left; font-weight:bold; font-size:large; color: #4673A7;">全省车船税代征情况分属地统计分析</div>';
		}else if(pageid=='smcx'){
			divtitle = '<div style="width:1000px; text-align:left; font-weight:bold; font-size:large; color: #4673A7;">全省车船税代征情况分税目统计分析</div>';
		}else if(pageid=='bdcx'){
			divtitle = '<div style="width:1000px; text-align:left; font-weight:bold; font-size:large; color: #4673A7;">保单信息精确查询</div>';
		}else{
			divtitle = '';
		}
		parent.layer.open({
		      type: 2,
		      title: divtitle,
		      shadeClose: true,
		      //closeBtn: 0,
		      shade: 0,
		      scrollbar: false,
		      maxmin: true, //开启最大化最小化按钮
		      area: ['1000px', '600px'],
		      content: 'divpage/'+pageid+'.jsp'
		    });
		
		var linkwinindex = parent.layer.getFrameIndex(window.name); 
		parent.layer.close(linkwinindex);
		
	}
	function quit(){
		var linkwinindex = parent.layer.getFrameIndex(window.name); 
		parent.layer.close(linkwinindex);
		window.location.href=window.location.href;
	}
</script>
</head>
<body style="margin-top: 70px; ">
<!-- 
 -->
<div style="z-index: -1; margin-left: 25px;margin-top: -60px;">
<img src="images/sxds.gif" alt="陕西地税" />
</div>
<div style="margin: 0 auto; width: 900px; ">
 <ul>
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('hzcx')" class="flipper">
 <div class="front "><img src="images/hzcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/hzcx2.png"></div>
  -->
 </a>
 </li>
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('mxcx')" class="flipper">
 <div class="front "><img src="images/mxcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/mxcx2.png"></div>
  -->
 </a>
 </li>
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('jdcx')" class="flipper">
 <div class="front "><img src="images/jdcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/jdcx2.png"></div>
  -->
 </a>
 </li>
 
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('sdcx')" class="flipper">
 <div class="front "><img src="images/sdcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/sdcx2.png"></div>
  -->
 </a>
 </li>
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('smcx')" class="flipper">
 <div class="front "><img src="images/smcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/smcx2.png"></div>
  -->
 </a>
 </li>
 <li class="flip-container " ontouchstart="this.classList.toggle('hover');">
 <a href="#" onclick="gotoPage('bdcx')" class="flipper">
 <div class="front "><img src="images/bdcx2.png"/></div>
 <!-- 
 <div class="back " ><img src="images/bdcx2.png"></div>
  -->
 </a>
 </li>
 </ul>
 </div>
 <div style="z-index: -2; margin-left: 850px;margin-top: 300px;">
<img onclick="quit();" src="images/quit.png" alt="退出" />
</div>
</body>
</html>
