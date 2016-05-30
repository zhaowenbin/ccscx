<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>按排量统计代收代缴信息</title>

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
            freshChart('PL',queryMonth); 
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
		
		var thisMonth = new Date().getMonth()+1;
		if(thisMonth<10){
			thisMonth = '0'+thisMonth;
		}
		
$(function () {

	Highcharts.setOptions({
        colors: ['#DD88AA', '#008B8B', '#919191', '#DDDF00', '#24CBE5', '#64E572', '#FF9655', '#FFF263', '#7D9EC0']
    });

    $('#container').highcharts({
        chart: {
            type: 'pie',
            options3d: {
                enabled: true,
                alpha: 45,
                beta: 0
            }
        },
        title: {
            text: new Date().getFullYear()+''+thisMonth+'各排量车型纳税信息分布情况'
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
            name: '代收占比',
            data: [
                ['1.4L-1.6L',   0.0],
                ['1.6L-2.0L',       0.0],
                ['2.0L-3.0L',    0.0],
                ['3.0L-4.0L',    0.0],
                ['4.0L以上',     0.0],
                ['1.0L以下',   0.0]
            ]
        }]
    });
});

function lastMonth(){
	parent.startloading();
	var chart = $('#container').highcharts();
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
        freshChart('PL',queryMonth); 
	}
}

function freshChart(showType,queryMonth){
	var chart = $('#container').highcharts();
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
				                     ['1.4L-1.6L',   0.0],
				                     ['1.6L-2.0L',       0.0],
				                     ['2.0L-3.0L',    0.0],
				                     ['3.0L-4.0L',    0.0],
				                     ['4.0L以上',     0.0],
				                     ['1.0L以下',   0.0]
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
        freshChart('PL',queryMonth); 
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
