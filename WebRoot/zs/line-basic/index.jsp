<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>地市代收信息统计</title>

		<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
		<style type="text/css">
		</style>
		<script type="text/javascript" src="layer/layer.js"></script>
		<script type="text/javascript">
		window.onload=function(){
			layer.config({
				extend:'skin/seaning/style.css'
			});
			var queryMonth = chart.title.textStr.substring(0,6);
            freshChart('DS',queryMonth); 
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
		var chart;
$(function () {
   // $('#container').highcharts({
	   chart = new Highcharts.Chart({
        chart: {
        	renderTo: 'container',
        	type: 'column'
        },
        title: {
            text: new Date().getFullYear()+''+thisMonth+'各地市代收信息统计'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            categories: 
            	[],
            	/*[
                '西安市',
		'铜川市',
		'宝鸡市',
		'咸阳市',
		'渭南市',
		'汉中市',
		'安康市',
		'商洛市',
		'延安市',
		'榆林市',
		'未知市'
            ],*/
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '合计值'
            }
        },
        tooltip: {
            headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
            pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
                '<td style="padding:0"><b>{point.y:.1f} </b></td></tr>',
            footerFormat: '</table>',
            shared: true,
            useHTML: true
        },
        plotOptions: {
            column: {
                pointPadding: 0.2,
                borderWidth: 0
            }
        },
        legend:{
        	itemWidth:200
        },
        series: [{
            name: '代收税款合计（百万元）',
            data: [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

        }, {
            name: '保单数合计（千笔）',
            data: [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

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
        freshChart('DQ',queryMonth); 
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
			var newData = JSON.parse(data.split('@')[0]);
			var newData2 = JSON.parse(data.split('@')[1]);
			var dqname = eval(data.split('@')[2]);
			chart.series[0].setData(newData);
			chart.series[1].setData(newData2);
			chart.xAxis[0].setCategories(dqname);
			var newTitle = queryMonth+''+chart.title.textStr.substring(6);
         	parent.endloading();
			chart.setTitle({text:newTitle});
			chart.redraw(); 
		 	}
	});
}

function nextMonth(){
	parent.startloading();
	var chart = $('#container').highcharts();
	if(parseInt(chart.title.textStr.substring(0,6))+1>parseInt(new Date().getFullYear()+''+thisMonth)){
		parent.layer.alert('系统不存在'+new Date().getFullYear()+'年以后的数据', {
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
        freshChart('DQ',queryMonth); 
	}
}
		</script>
	</head>
	<body>
<script src="../js/highcharts.js"></script>
<script src="../modules/exporting.js"></script>
<div style="width:50px; height:50px; float: left;">
<img alt="上一月" onclick="lastMonth()" src="../images/previous.png" style="width:100%;" title="上一月" >
</div>
<div style="width:50px; height:50px; float: left;">
<img alt="下一月" onclick="nextMonth()" src="../images/next.png" style="width:100%;" title="下一月">
</div>
<div id="container" style="min-width: 310px; height: 400px; margin: 0 auto"></div>

	</body>
</html>
