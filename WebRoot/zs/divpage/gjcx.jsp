<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>全省车船税代征情况高级查询</title>
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
	地市：<input class="easyui-combobox" id="city" style="width:95px;" value="--请选择--"
			data-options=" url:'../data/city.json',
					method:'get',
					valueField:'id',
					textField:'text',
					panelHeight:'auto'
			">
	区县：<input class="easyui-combobox" id="country" style="width:95px;" value="--请选择--"
			data-options=" url:'../data/country.json',
					method:'get',
					valueField:'id',
					textField:'text',
					panelHeight:'auto'
			">
	保险公司：<input class="easyui-combobox" id="bxgs" style="width:110px;" value="--请选择--"
			data-options=" url:'../data/bxgs.json',
					method:'get',
					valueField:'id',
					textField:'text',
					panelHeight:'auto'
			">
	凭证类型：<select class="easyui-combobox" id="pzlx" style="width:80px;">
				<option value="">--请选择--</option>
			 	<option value="jm">减免税</option>
				<option value="ws">完税</option>
			 </select>
	起期：<input id="datefrom" type="text" style="width:95px;" class="easyui-datebox" >
	止期：<input id="dateto" type="text" style="width:95px;" class="easyui-datebox" >
	</div>
	<div style="margin:30px 0;"></div>
	<a id="btn" href="#" style="margin-left: 890px; margin-bottom: 5px; " onclick="reload()" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">查询</a>
	<table id="dg" class="easyui-datagrid" title="查询结果" style="width:950px;height:400px"
			data-options="
				rownumbers: true,
				singleSelect: true,
				iconCls: 'icon-save',				
				method: 'post'
			">
		<thead>		
			<tr><!-- width:85 -->
				<th data-options="field:'bxgsmc',rowspan:1,sortable:true,align:'center'">保险公司</th>
				
				<th data-options="field:'nsrmc',rowspan:1,sortable:true,width:85,align:'center'">纳税人名称</th>
				<th data-options="field:'nsrsbh',rowspan:1,width:80,align:'center'">纳税人识别号</th>
				<th data-options="field:'hphm',rowspan:1,width:65,align:'center'">号牌号码</th><!-- -->
				<th data-options="field:'vin',rowspan:1,width:65,align:'center'">车架号</th>
				<th data-options="field:'pzlx',rowspan:1,width:65,align:'center'">凭证类型</th>
				<th data-options="field:'pzh',rowspan:1,width:65,align:'center'">凭证号</th>
				<th data-options="field:'kjswjgdm',rowspan:1,width:65,align:'center'">开具税务机关代码</th>
				<th data-options="field:'kjswjgmc',rowspan:1,width:65,align:'center'">开具税务机关名称</th>
				<th data-options="field:'skje',rowspan:1,width:65,align:'center'">税款金额</th>
				<th data-options="field:'ds',rowspan:1,width:65,align:'center'">地市</th>
				<th data-options="field:'qx',rowspan:1,width:65,align:'center'">区县</th>
				<th data-options="field:'cjsj',rowspan:1,width:65,align:'center'">采集时间</th>
			</tr>
		</thead>
	</table>
	</div>
	<button style="float: left;margin-top: 15px; margin-left: 450px" >数据导出</button>
	<a href="#" onclick="goLinkPage()" style="position: absolute; float:right; margin-left:300px; margin-top: 0px;"><img src="../images/return.png" width="80px" height="50px" border="0"></a>
	
	<script type="text/javascript">
	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
	window.onload=function(){
		
	};
	
			
	function reload(){
		
		var vcity = $('#city').datebox('getValue');
		if(vcity==null||vcity==''||vcity=='--请选择--'){
			layer.alert('请选择地市', {
			     icon: 9,
			     time: 5*1000,
			     skin: 'layer-ext-seaning' 
			 	});
			return false;
		}
		var vcountry = $('#country').datebox('getValue');
		var vbxgs = $('#bxgs').datebox('getValue');
		var vpzlx = $('#pzlx').datebox('getValue');
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		try{
			layer.alert('地市：'+vcity+' 区县：'+vcountry+" 保险公司："+vbxgs+" 凭证类型："+vpzlx, {
			     icon: 9,
			     time: 5*1000,
			     skin: 'layer-ext-seaning' 
			 	});
			
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
			$("#dg").datagrid("getPanel").panel("setTitle","查询结果【"+datefrom+" 至 "+dateto+"】");
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2gjcx',
	    			city:vcity,
	    			country:vcountry,
	    			bxgs:vbxgs,
	    			pzlx:vpzlx,
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