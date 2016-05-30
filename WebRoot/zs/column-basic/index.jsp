<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>保险公司代收信息统计</title>

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
            freshChart('BXGS',queryMonth); 
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

	Highcharts.setOptions({
        colors: ['#DD88AA', '#008B8B', '#FF9655', '#FFF263', '#919191', '#DDDF00', '#24CBE5', '#64E572', '#7D9EC0']
    });
	
   // $('#container').highcharts({
  chart = new Highcharts.Chart({
        chart: {
        	renderTo: 'container',
        	type: 'column'
        },
        title: {
            text: new Date().getFullYear()+''+thisMonth+'保险公司代收信息统计'
        },
        subtitle: {
            text: ''
        },
        xAxis: {
            categories: [
                '安邦财险',
		'安诚财险',
		'永诚财险',
		'安盟保险',
		'中银保险',
		'渤海财险',
		'大地财险',
		'中华联合',
		'太平洋财险',
		'都邦财险',
		'国寿财险',
		'华安财险',
		'华泰财险',
		'锦泰财险',
		'平安财险',
		'人民财险',
		'天安保险',
		'天平保险',
		'太平保险',
		'信达财险',
		'永安财险',
		'英大泰和',
		'阳光财险'
            ],
            crosshair: true
        },
        yAxis: {
            min: 0,
            title: {
                text: '合计金额 (万元)'
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
        	padding:30,
        	itemWidth:200
        },
        series: [{
            name: '代收税款合计（万元）',
            data: [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

        }, {
            name: '保单数合计（千笔）',
            data: [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]

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
            freshChart('BXGS',queryMonth); 
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
				chart.series[0].setData(newData);
				chart.series[1].setData(newData2);
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
            freshChart('BXGS',queryMonth); 
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
