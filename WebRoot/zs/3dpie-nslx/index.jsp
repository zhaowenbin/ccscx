<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>按纳税类型统计代收代缴信息</title>

		<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="layer/layer.js"></script>
		<style type="text/css">
${demo.css}
		</style>
		<script type="text/javascript">
		window.onload=function(){
			layer.config({
				extend:'skin/seaning/style.css'
			});
			var queryMonth = chart.title.textStr.substring(0,6);
            freshChart('NSLX',queryMonth); 
		};
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
		
		var chart;
		var thisMonth = new Date().getMonth()+1;
		if(thisMonth<10){
			thisMonth = '0'+thisMonth;
		}
		
$(function () {
    //$('#container').highcharts({
    chart = new Highcharts.Chart({
        chart: {
        	renderTo: 'container',
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: new Date().getFullYear()+''+thisMonth+'各纳税类型车辆分布情况统计'
        },
		subtitle: {
            text: ''
        },
        tooltip: {
            pointFormat: '{series.name}: <b>{point.percentage:.1f}%</b>'
        },
        plotOptions: {
            pie: {
                allowPointSelect: true,
                cursor: 'pointer',
                depth: 35,
                dataLabels: {
                    enabled: true,
                    format: '{point.name}'
                }
            }
        },
        series: [{
            type: 'pie',
            name: '代收车辆数占比',
            data: [
                ['正常纳税',   0.0],
                ['已完税',       0.0],
                ['减税',    0.0],
                ['免税',     0.0],
                ['拒缴',   0.0]
            ]
        }]
    });
    
});

if(typeof JSON == 'undefined'){
	$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
};	

function lastMonth(){
	parent.startloading();
	var chart = $('#container').highcharts();
	//alert(parent.uid);
	//subtitle = now subtitle - 1年，不能小于2015年
	if(parseInt(chart.title.textStr.substring(0,6))-1<201511){
		parent.layer.alert('系统无法查询上线前的数据', {
		     icon: 9,
		     time: 3*1000,
		     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
		 	});
		parent.endloading();
	}else{
		var queryMonth = parseInt(chart.title.textStr.substring(0,6))-1+'';
		if(queryMonth.substring(4,6)=='00'){
			queryMonth=parseInt(parseInt(chart.title.textStr.substring(0,4))-1+'12');
		}
        freshChart('NSLX',queryMonth); 
	}
}

function freshChart(showType,queryMonth){
	$.ajax({
		type:"post",//post方法
		url:parent.basePath+'chartServlet',
		data:{
			time:new Date(),
			uid:parent.uid,
			showType:showType,
			month:queryMonth
		},
		success:function(data) {
			if(data=='[]'||data==']'){
				parent.endloading();
				parent.layer.alert('未加载到'+queryMonth+'月的数据', {
				     icon: 9,
				     time: 3*1000,
				     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
				 	});
				var newData = [
				                ['正常纳税（T）',   0.0],
				                ['已完税（P）',       0.0],
				                ['减税（C）',    0.0],
				                ['免税（E）',     0.0],
				                ['拒缴（R）',   0.0]
				            ];
				var newTitle = queryMonth+''+chart.title.textStr.substring(6);
				chart.series[0].setData(newData);
				chart.setTitle({text:newTitle});
				chart.redraw(); 
			}else{
				var newData = eval(data);
				chart.series[0].setData(newData);
				var newTitle = queryMonth+''+chart.title.textStr.substring(6);
	         	parent.endloading();
				chart.setTitle({text:newTitle});
				chart.redraw(); 
			}
		}
	});
}

function nextMonth(){
	parent.startloading();
	var chart = $('#container').highcharts();
	if(parseInt(chart.title.textStr.substring(0,6))+1>parseInt(new Date().getFullYear()+''+thisMonth)){
		parent.layer.alert('系统不存在'+new Date().getFullYear()+''+thisMonth+'月以后的数据', {
		     icon: 9,
		     time: 3*1000,
		     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
		 	});
		parent.endloading();
	}else{
		var queryMonth = parseInt(chart.title.textStr.substring(0,6))+1+'';
		if(queryMonth.substring(4,6)=='13'){
			queryMonth=parseInt(parseInt(chart.title.textStr.substring(0,4))+1+'01');
		}
        freshChart('NSLX',queryMonth); 
	}
}
		</script>
	</head>
	<body>

<script src="../js/highcharts.js"></script>
<script src="../js/highcharts-3d.js"></script>
<script src="../js/modules/exporting.js"></script>
<div style="width:50px; height:50px; float: left;">
<img alt="上一月" onclick="lastMonth()" src="../images/previous.png" style="width:100%;" title="上一月" >
</div>
<div style="width:50px; height:50px; float: left;">
<img alt="下一月" onclick="nextMonth()" src="../images/next.png" style="width:100%;" title="下一月">
</div>
<div id="container" style="height: 400px"></div>
	</body>
</html>
