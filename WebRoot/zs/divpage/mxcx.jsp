<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>全省车船税代征情况明细表查询</title>
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
	<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../css/easyuidemo.css">
	<script type="text/javascript" src="../layer/layer.js"></script>
	<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="../js/locale/easyui-lang-zh_CN.js"></script>
	<style type="text/css">
	.tds{
		width: 100px;
	}
	.aaa{
		font-size: 14px;
	}
	</style>
</head>
<body>
<div style="margin: 0 auto; width: 950px">
	<!--
	<h4 style="margin:-20px 0; float: left;">截至2016年03月23日24时，全省保险公司共代征车船税<font color="red">62300</font>万元。</h4>
	<p align="right" style="margin-top: -20px">单位：万元</p>
	<div style="margin:0px 0;"></div>
	-->
	<div>
	起：<input id="datefrom" type="text" style="width:95px;" class="easyui-datebox" >
	止：<input id="dateto" type="text" style="width:95px;" class="easyui-datebox" >
	<a id="btn" href="#" onclick="reload()" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">刷新</a>
	</div>
		<table id="dg" class="easyui-datagrid" title="全省车船税代征情况明细表" style="width:950px;height:410px"
			data-options="
				rownumbers: true,
				singleSelect: true,
				iconCls: 'icon-save',				
				method: 'post'
			">
		<thead>		
			<tr>
				<th data-options="field:'bxgs',rowspan:1,align:'center',width:80">保险公司</th>
				<th data-options="field:'sk',sortable:true,width:100,align:'center'">税款(万元)</th>
				<th data-options="field:'bds',width:80,align:'center'">保单数(万笔)</th>
				<th data-options="field:'jsje',rowspan:1,width:90,align:'center'">减税金额(万元)</th>
				<th data-options="field:'jsbd',rowspan:1,width:90,align:'center'">减税保单(万笔)</th>
				<th data-options="field:'jszb',rowspan:1,width:70,align:'center'">减税占比%</th>
				<th data-options="field:'msje',rowspan:1,align:'center',width:90">免税金额(万元)</th>
				<th data-options="field:'msbd',rowspan:1,width:90,align:'center'">免税保单(万笔)</th>
				<th data-options="field:'mszb',rowspan:1,width:70,align:'center'">免税占比%</th>
				
				<th data-options="field:'pzjm',rowspan:1,width:70,align:'center'">凭证减免(笔)</th>
				<th data-options="field:'pzws',rowspan:1,width:70,align:'center'">凭证完税(笔)</th>
			</tr>
			<!-- 
			<th data-options="field:'dsqk',colspan:2,align:'center'">代收情况</th>
			<tr>
				<th data-options="field:'sk',sortable:true,width:100,align:'center'">税款(万元)</th>
				<th data-options="field:'bds',width:100,align:'center'">保单数(万笔)</th>
			</tr>		
			 -->
		</thead>
	</table>
<div id="cities" style="margin-top: 10px; ">
	<table>
		<tr>
			<td width="150px;"><b>【各地市数据】</b></td>
			<td class="tds">
			<a href="#" onclick="reload('')" class="aaa">陕西省</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610100')" class="aaa">西安</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610200')" class="aaa">铜川</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610300')" class="aaa">宝鸡</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610400')" class="aaa">咸阳</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610500')" class="aaa">渭南</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610600')" class="aaa">延安</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610700')" class="aaa">汉中</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610800')" class="aaa">榆林</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('610900')" class="aaa">安康</a>
			</td>
			<td class="tds">
				<a href="#" onclick="reload('611000')" class="aaa">商洛</a>
			</td>
		</tr>
	</table>
</div>
	
	<script type="text/javascript">
	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
	var citycode='';
	window.onload=function(){
		reload0();	
	};
	function reload0(city){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		if(city!=undefined){
			citycode=city;
		}
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
			$("#dg").datagrid("getPanel").panel("setTitle",  getCityName(city)+"车船税代征情况明细表【"+datefrom+" 至 "+dateto+"】");
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2mxcx',
	    			cacheFlag:true,
	    			citycode:citycode,
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
	 
	function reload(city){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		if(city!=undefined){
			citycode=city;
		}
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
			$("#dg").datagrid("getPanel").panel("setTitle",  getCityName(city)+"车船税代征情况明细表【"+datefrom+" 至 "+dateto+"】");
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2mxcx',
	    			citycode:citycode,
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
	
	
	</script>
	<a href="#" onclick="goLinkPage()" style="position: absolute; margin-left:850px; margin-top: 0px;"><img src="../images/return.png" width="80px" height="50px" border="0"></a>
</div>	
</body>
	<script type="text/javascript">
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
</html>