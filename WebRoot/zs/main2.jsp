<%@page import="java.math.BigDecimal"%>
<%@ page language="java" import="java.util.*,com.derun.controller.busiQuery.web.*" pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String uid = (String)session.getAttribute("uid");
String uname = (String)session.getAttribute("uname");
int total=0;
double sumtax = 0.00;
String comboData = "";
if(uid==null||"".equals(uid)){
	response.getWriter().write("<script>top.location='login2.jsp'</script>"); 
}else{
	BusiQueryServlet bqs = new BusiQueryServlet();
	comboData = bqs.getUsers(uid);//cityData+@+countryData
	if("26100".equals(uid)){
		uid="2000000";
	}
	/*
	//查询当月总计
	String countStr = bqs.getTJ_ThisMonth(uid);
	total = Integer.parseInt(countStr.split("@")[0]);
	if(countStr.split("@")[2]!=null&&!"".equals(countStr.split("@")[2])){
		  sumtax = new BigDecimal(Double.parseDouble(countStr.split("@")[2])/10000).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	*/
}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车船税系统数据管理平台-主页</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/easyuidemo.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	
	<script src="js/highcharts.js"></script>
	<script src="js/highcharts-3d.js"></script>
	<script src="js/modules/exporting.js"></script>
	<script src="js/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
	
	function startloading(){
		layer.load(
		   1,{
		      shade:[0.9,'#000']//,
		      //time:2*1000//2秒自动关闭
		   }
		);   
	}
	function endloading(){
		layer.closeAll('loading');
	}
		startloading();
		var basePath = '<%=basePath%>';
		var uid = <%=uid%>;
		if(typeof JSON == 'undefined'){
	 		$('head').append($("<script type='text/javascript' src='js/json2.js'>"));
     	};
	
		function win_load(){//东区pg宽度不能自动调整
			layer.config({
				extend:'skin/seaning/style.css'
			});
			
			

			/*加载完成*/
			
			endloading();
		}
		
	
		$(document).ready(function(){  
			startloading();
			var height1 = $(window).height()-30;  //20
			$("#main_layout").attr("style","width:100%;height:"+height1+"px");  
			$("#main_layout").layout("resize",{  
				width:"100%",  
				height:height1+"px"  
			}); 
			
		});  
		
		
		$(window).resize(function(){  
			var height1 = $(window).height()-40;  //30
			$("#main_layout").attr("style","width:100%;height:"+height1+"px");  
			$("#main_layout").layout("resize",{  
				width:"100%",  
				height:height1+"px"  
			});  
		});   
		
		
		function quit(){
			window.location = '../index.jsp';
		}
		
	</script> 	
	

</head>
<body style="overflow-y : hidden;">
	
<div style="margin-top:5px;margin-left:5px;margin-right:5px;margin-bottom:5px;">
	<div id="main_layout" class="easyui-layout"  style="width:100%; height:680px;">
		<!-- 北方 
		<a href="#" onclick="quit()"> <font size="3" color="red">退出</font> </a>
		-->
		<!-- 东方 -->
		<!-- 中间 -->
		<div data-options="region:'center',title:'代收代缴信息展示区',iconCls:'icon-large-chart'" style="width:100%;height:100%">	


			<div id="tt" class="easyui-tabs" data-options="tabPosition:'top'" style="width:100%;height:100%">
				
				<div title="车船税代征信息表" data-options="iconCls:'icon-sum',closable:false,selected:true" style="padding:10px">
					<iframe src="table.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage4" name="iframepage4" onLoad="" ></iframe>
				</div>
				<div title="全省车船税代征情况" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="chart2/chart1.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage4" name="iframepage4" onLoad="" ></iframe>
				</div>
				
				<div title="税源情况分析(地市)" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="chart2/chart2.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage" name="iframepage" onLoad="" ></iframe>
				</div>
				<div title="税源情况分析(车型)" id='tab_dqtj' data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="chart2/chart3.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage5" name="iframepage5" onLoad="" ></iframe>
				</div>
				<div title="代征情况统计(保险公司)" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="chart2/chart4.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage3" name="iframepage3" onLoad="" ></iframe>
				</div>
				
			</div>
			
			
			<script>
				window.onload = function(){ 
					/*加载数据*/
					win_load();
					//pg中city&country重新绑定
					endloading();
					var tt = $('#tt');
				};
				
			</script>	
			
		</div>
		<!-- 南方 -->
	</div>
</div>

<input type="hidden" id="h_sumtax">	
<input type="hidden" id="h_sumcar">
	
</body>
</html>