<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>代征情况统计(保险公司)</title>

		<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
		<style type="text/css">
#container, #sliders {
	min-width: 310px; 
	max-width: 800px;
	margin: 0 auto;
}
#container {
	height: 380px; 
}
		</style>
		<script type="text/javascript" src="layer/layer.js"></script>
		<script type="text/javascript">
		window.onload=function(){
			layer.config({
				extend:'skin/seaning/style.css'
			});
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
$(function () {

	Highcharts.setOptions({
        colors: ['#FF0000', '#00CD00', '#919191', '#DDDF00', '#24CBE5', '#64E572', '#FF9655', '#FFF263', '#7D9EC0']
    });
    // Set up the chart
     chart = new Highcharts.Chart({
        chart: {
            renderTo: 'container',
            type: 'column',
            margin: 75,
            options3d: {
                enabled: true,
                alpha: 0,
                beta: 0,
                depth: 50,
                viewDistance: 25
            }
        },
        title: {
            text: '2016年度保险公司代征情况统计'
        },
        subtitle: {
            text: ''
        },
		xAxis: {
			labels:{ 
				rotation:25
		    },
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
                 		'阳光财险',
                 		'合计'
                             ]
        },
        yAxis: [{
            title: {
                text: '合计金额 (万元)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },{
            title: {
                text: '同比增幅'
            },labels: {
                format: '{value} %',
                style: {
                    color: '#4572A7'
                }
            },
            opposite: true,
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        }],
        plotOptions: {
            column: {
                depth: 25
            }
        },
        legend:{
        	padding:10,
        	itemWidth:200
        	
        },
        series: [{
			name:'上期税款（万元）',
            data: [560, 420, 600, 720, 820, 760, 981, 760, 699, 530, 
                   560, 420, 600, 720, 820, 760, 981, 760, 699, 530, 
                   831, 750, 801, 1000]
        },{
			name:'本期税款（万元）',
            data: [680, 500, 750, 830, 875, 628, 990, 810, 780, 580, 
                   680, 500, 750, 830, 875, 628, 990, 810, 780, 580, 
                   920, 900, 761, 1256]
        },{
            type: 'spline',
            name: '同比增幅',
            yAxis:1,
            data: [1.2, 1.0, 0.68, 0.8, 0.3,1.5, -0.2, 0.9, 1.1, 2,
                   1.2, 1.0, 0.68, 0.8, 0.3,1.5, -0.2, 0.9, 1.1, 2,
                   1.2,1,1.5],
            marker: {
                lineWidth: 2,
                lineColor: Highcharts.getOptions().colors[3],
                fillColor: 'white'
            }
        }]
    });

    function showValues() {
        $('#R0-value').html(chart.options.chart.options3d.alpha);
        $('#R1-value').html(chart.options.chart.options3d.beta);
    }

    // Activate the sliders
    $('#R0').on('change', function () {
        chart.options.chart.options3d.alpha = this.value;
        showValues();
        chart.redraw(false);
    });
    $('#R1').on('change', function () {
        chart.options.chart.options3d.beta = this.value;
        showValues();
        chart.redraw(false);
    });

    showValues();
});

	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
   	
	function lastYear(){
		parent.startloading();
		if(parseInt(chart.title.textStr.substring(0,4))-1<2015){
			parent.layer.alert('系统无法查询上线前的数据', {
			     icon: 9,
			     time: 3*1000,
			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			 	});
			parent.endloading();
		}else{
			var queryYear = parseInt(chart.title.textStr.substring(0,4))-1;
            freshChart('NDDS',queryYear);
			
		}
	}
	
	function freshChart(showType,queryYear){
		$.ajax({
    		type:"post",//post方法
    		url:parent.basePath+'chartServlet',
    		data:{
    			time:new Date(),
    			uid:parent.uid,
    			showType:showType,
    			year:queryYear
    		},
    		success:function(data) {
    			var newData = JSON.parse(data.split('@')[0]);
    			var newData2 = JSON.parse(data.split('@')[1]);
				chart.series[0].setData(newData);
				chart.series[1].setData(newData2);
				var newTitle = queryYear+''+chart.title.textStr.substring(4);
             	parent.endloading();
				chart.setTitle({text:newTitle});
				chart.redraw(); 
			 	}
    	});
	}
	
	function nextYear(){
		parent.startloading();
		if(parseInt(chart.title.textStr.substring(0,4))+1>parseInt(new Date().getFullYear())){
			parent.layer.alert('系统不存在'+new Date().getFullYear()+'年以后的数据', {
			     icon: 9,
			     time: 3*1000,
			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			 	});
			parent.endloading();
		}else{
			var queryYear = parseInt(chart.title.textStr.substring(0,4))+1;
            freshChart('NDDS',queryYear); 
		}
	}
	
	function loadChart(){
		//freshChart('NDDS',parseInt(chart.title.textStr.substring(0,4))); 
	}
		</script>
	</head>
	<body onload="loadChart()">
<script src="../js/highcharts.js"></script>
<script src="../js/highcharts-3d.js"></script>
<script src="../js/modules/exporting.js"></script>
<div style="width:50px; height:50px; float: left;">
<img alt="上一年" onclick="lastYear()" src="../images/previous.png" style="width:100%;" title="上一年" >
</div>
<div style="width:50px; height:50px; float: left;">
<img alt="下一年" onclick="nextYear()" src="../images/next.png" style="width:100%;" title="下一年">
</div>
<div id="container"></div>
	</body>
</html>
