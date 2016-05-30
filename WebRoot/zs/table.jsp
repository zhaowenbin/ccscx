<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车船税代征信息</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/easyuidemo.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	
	<!---->
	<h4 style="margin:-20px 0; float: left;">截至2016年03月23日24时，全省保险公司共代征车船税<font color="red">62300</font>万元。</h4>
	<p align="right" style="margin-top: -20px">单位：万元</p>
	<div style="margin:0px 0;"></div>
	<table id="dg" class="easyui-datagrid" title="保险公司代收情况" style="width:875px;height:280px"
			data-options="
				rownumbers: true,
				singleSelect: true,
				iconCls: 'icon-save',				
				method: 'get'
			">
		<thead>		
			<tr>
				<th data-options="field:'bxgsmc',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk',colspan:2,width:80,align:'center'">代收情况</th>
				<th data-options="field:'bxgsmc2',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk2',colspan:2,width:80,align:'center'">代收情况</th>
				<th data-options="field:'bxgsmc3',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk3',colspan:2,width:80,align:'center'">代收情况</th>
			</tr>
			<tr>
				<th data-options="field:'je',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj',width:80,align:'center'">同比增减</th>
				<th data-options="field:'je2',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj2',width:80,align:'center'">同比增减</th>
				<th data-options="field:'je3',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj3',width:80,align:'center'">同比增减</th>
			</tr>		
		</thead>
	</table>

	<div style="margin:20px 0;"></div>
	<table id="dg2" class="easyui-datagrid" title="分市代收统计表" style="width:875px;height:180px"
			data-options="
				rownumbers: true,
				singleSelect: true,
				iconCls: 'icon-save',				
				method: 'get'
			">
		<thead>		
			<tr>
				<th data-options="field:'bxgsmc',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk',colspan:2,width:80,align:'center'">代收情况</th>
				<th data-options="field:'bxgsmc2',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk2',colspan:2,width:80,align:'center'">代收情况</th>
				<th data-options="field:'bxgsmc3',rowspan:2,sortable:true,align:'center',width:100">名称（简）</th>
				<th data-options="field:'dsqk3',colspan:2,width:80,align:'center'">代收情况</th>
			</tr>
			<tr>
				<th data-options="field:'je',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj',width:80,align:'center'">同比增减</th>
				<th data-options="field:'je2',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj2',width:80,align:'center'">同比增减</th>
				<th data-options="field:'je3',sortable:true,width:100,align:'center'">金额</th>
				<th data-options="field:'tbzj3',width:80,align:'center'">同比增减</th>
			</tr>		
		</thead>
	</table>	
	
	<script type="text/javascript">
	
	
	window.onload=function(){
		
		$('#dg').datagrid('loadData',[
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安诚财险","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"安诚财险","je":126.50,"tbzj":"5.2%","bxgsmc2":"安诚财险","je2":126.50,"tbzj2":"5.2%"}
			]);
			
			
			$('#dg2').datagrid('loadData',[
				{"bxgsmc":"西安","je":126.50,"tbzj":"5.2%","bxgsmc2":"铜川","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"宝鸡","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"咸阳","je":126.50,"tbzj":"5.2%","bxgsmc2":"渭南","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"延安","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"汉中","je":126.50,"tbzj":"5.2%","bxgsmc2":"榆林","je2":126.50,"tbzj2":"5.2%","bxgsmc3":"安康","je3":126.50,"tbzj3":"5.2%"},
				{"bxgsmc":"商洛","je":126.50,"tbzj":"5.2%"}				
			]);
			
	}
	
	
	</script>
</body>
</html>