<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>全省车船税代征情况汇总查询</title>
	<script type="text/javascript" src="../js/castcode.js"></script>
	<script type="text/javascript">
	if(myBrowser()=="IE6"||myBrowser()=="IE7"||myBrowser()=="IE8"){  
        document.write("<script type=\"text/javascript\" src=\"..\/js\/jquery-1.8.3.min.js\"><\/script>"); //ie8引入jquery1.8.3  
    }else{
    	document.write("<script type=\"text/javascript\" src=\"..\/js\/jquery-2.1.4.min.js\"><\/script>");
    }
	</script>
	<!-- 
	<script type="text/javascript" src="../js/jquery-2.1.4.min.js"></script>
	 -->
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../css/easyuidemo.css">
	<script type="text/javascript" src="../layer/layer.js"></script>
	<script type="text/javascript" src="../js/locale/easyui-lang-zh_CN.js"></script>
</head>
<body>
	
	<!--
	<h4 style="margin:-20px 0; float: left;">截至2016年03月23日24时，全省保险公司共代征车船税<font color="red">62300</font>万元。</h4>
	<p align="right" style="margin-top: -20px">单位：万元</p>
	-->
	<div style="margin: 0 auto; width: 950px">
	<div style="margin:0px 0;">
	起：<input id="datefrom" type="text" style="width:95px;" class="easyui-datebox" >
	止：<input id="dateto" type="text" style="width:95px;" class="easyui-datebox" >
	<a id="btn" href="#" onclick="reload()" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">刷新</a>
	</div>
	<div style="margin:0px 0;"></div>
	<table id="dg" class="easyui-datagrid" title="全省车船税代征情况汇总表" style="width:950px;height:450px"
			data-options="
				rownumbers: true,
				singleSelect: true,
				iconCls: 'icon-save',				
				method: 'post',
				rowStyler:function(index,row){
		           if (index==23){ 
		               return 'background-color:#C0FF3E;';   
		           }       
				},
				onLoadSuccess: function(){
					$(this).datagrid('freezeRow',23);
				}
			">
		<thead>		
			<tr><!-- width:85 -->
				<th data-options="field:'bxgsmc',rowspan:1,sortable:true,align:'center'">保险公司</th>
				
				<th data-options="field:'sk',rowspan:1,sortable:true,width:85,align:'center'">税款(万元)</th>
				<th data-options="field:'bds',rowspan:1,width:80,align:'center'">保单数(万笔)</th>
				<th data-options="field:'xa',rowspan:1,width:65,align:'center'">西安</th><!-- -->
				<th data-options="field:'tc',rowspan:1,width:65,align:'center'">铜川</th>
				<th data-options="field:'bj',rowspan:1,width:65,align:'center'">宝鸡</th>
				<th data-options="field:'xy',rowspan:1,width:65,align:'center'">咸阳</th>
				<th data-options="field:'wn',rowspan:1,width:65,align:'center'">渭南</th>
				<th data-options="field:'ya',rowspan:1,width:65,align:'center'">延安</th>
				<th data-options="field:'hz',rowspan:1,width:65,align:'center'">汉中</th>
				<th data-options="field:'yl',rowspan:1,width:65,align:'center'">榆林</th>
				<th data-options="field:'ak',rowspan:1,width:65,align:'center'">安康</th>
				<th data-options="field:'sl',rowspan:1,width:65,align:'center'">商洛</th>
			</tr>
			<!--
			<th data-options="field:'dsqk',colspan:2,align:'center'">代收情况</th> 
			<tr>
				<th data-options="field:'sk',sortable:true,width:85,align:'center'">税款(万元)</th>
				<th data-options="field:'bds',width:80,align:'center'">保单数(万笔)</th>
			</tr>		
			 -->
		</thead>
	</table>
	</div>

	<a href="#" onclick="goLinkPage()" style="position: absolute; margin-left:850px; margin-top: 0px;"><img src="../images/return.png" width="80px" height="50px" border="0"></a>
	
	<script type="text/javascript">
	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
	window.onload=function(){
		reload0();
	};
	
	function reload0(){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		try{
			var datefrom = $('#datefrom').datebox('getValue'); //yyyy-mm-dd
			var dateto = $('#dateto').datebox('getValue'); 
			//var d = new Date();
			var yesterday = GetDateStr(-1);	//d.getFullYear()+'-'+(d.getMonth()+1)+'-'+(d.getDate());
			if(datefrom==''){
				//datefrom='2015-11-28';
				var d = new Date();
				datefrom=d.getFullYear()+'-01-01';
			}
			if(dateto!=''&&!dateCmp('2015-11-27',dateto)){
				layer.alert('请选择上线日【2015-11-28】（包含）之后的日期作为查询止期!', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}else if(dateto!='' && !dateCmp(datefrom,dateto)){
				layer.alert('请选择止期以前的日期作为查询起期！', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}
			if(!dateCmp(datefrom,yesterday)){
				layer.alert('请选择系统当日以前的日期作为查询起期!', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}
			if(dateto=='' || !dateCmp(dateto,yesterday)){
				dateto=yesterday; //昨日24时
			}
			$("#dg").datagrid("getPanel").panel("setTitle","全省车船税代征情况汇总表【"+datefrom+" 至 "+dateto+"】");
			
			//----------------初始化查询使用缓存-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2hzcx',
	    			cacheFlag:true,
	    			datefrom:datefrom,
	    			dateto:dateto
	    		},
	    		success:function(data) {
	    			var newData = JSON.parse(data);
	    			$('#dg').datagrid('loadData',newData);
					layer.close(index);
				}
	    	});
			//-----------------------------------
		}catch(e){
			layer.close(index);
		}
	}	
			
	function reload(){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		try{
			var datefrom = $('#datefrom').datebox('getValue'); //yyyy-mm-dd
			var dateto = $('#dateto').datebox('getValue'); 
			//var d = new Date();
			var yesterday = GetDateStr(-1);	//d.getFullYear()+'-'+(d.getMonth()+1)+'-'+(d.getDate());
			if(datefrom==''){
				//datefrom='2015-11-28';
				var d = new Date();
				datefrom=d.getFullYear()+'-01-01';
			}
			if(dateto!=''&&!dateCmp('2015-11-27',dateto)){
				layer.alert('请选择上线日【2015-11-28】（包含）之后的日期作为查询止期!', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}else if(dateto!='' && !dateCmp(datefrom,dateto)){
				layer.alert('请选择止期以前的日期作为查询起期！', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}
			if(!dateCmp(datefrom,yesterday)){
				layer.alert('请选择系统当日以前的日期作为查询起期!', {
				     icon: 9,
				     time: 5*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				//$('#datefrom').combo('setText','');
				layer.close(index);
				return false;
			}
			if(dateto=='' || !dateCmp(dateto,yesterday)){
				dateto=yesterday; //昨日24时
			}
			$("#dg").datagrid("getPanel").panel("setTitle","全省车船税代征情况汇总表【"+datefrom+" 至 "+dateto+"】");
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2hzcx',
	    			datefrom:datefrom,
	    			dateto:dateto
	    		},
	    		success:function(data) {
	    			var newData = JSON.parse(data);
	    			$('#dg').datagrid('loadData',newData);
					layer.close(index);
				}
	    	});
			//-----------------------------------
		}catch(e){
			layer.close(index);
		}
	}
	
	function goLinkPage(){
		parent.layer.open({
		      type: 2,
		      title: '陕西省车船税联网征收系统数据平台',
		      shadeClose: true,
		      shade: 0,
		      scrollbar: false,
		      maxmin: true, //开启最大化最小化按钮
		      area: ['1000px', '600px'],
		      content: 'link.jsp'
		    });
		var linkwinindex = parent.layer.getFrameIndex(window.name); 
		parent.layer.close(linkwinindex);
	}
	
	
	</script>
</body>
</html>