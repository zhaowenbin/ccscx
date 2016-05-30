<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>年度代收代缴数据统计</title>

		<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
		<style type="text/css">
#container, #sliders {
	min-width: 310px; 
	max-width: 800px;
	margin: 0 auto;
}
#container {
	height: 400px; 
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
        colors: ['#DD88AA', '#008B8B', '#919191', '#DDDF00', '#24CBE5', '#64E572', '#FF9655', '#FFF263', '#7D9EC0']
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
            text: new Date().getFullYear()+'年度代收代缴信息统计'
        },
        subtitle: {
            text: ''
        },
		xAxis: {
            categories: ['一月', '二月', '三月', '四月', '五月', '六月',
                '七月', '八月', '九月', '十月', '十一月', '十二月']
        },
        yAxis: {
            title: {
                text: '合计金额 (百万元)'
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },
        plotOptions: {
            column: {
                depth: 25
            }
        },
        series: [{
			name:'合计税款（百万元）',
            data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        },{
			name:'保单数（万笔）',
            data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
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
		freshChart('NDDS',parseInt(chart.title.textStr.substring(0,4))); 
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
<div id="sliders">
	<table>
		<tr><td>垂直旋转</td><td><input id="R0" type="range" min="0" max="45" value="0"/> <span id="R0-value" class="value"></span></td></tr>
	    <tr><td>水平旋转</td><td><input id="R1" type="range" min="0" max="45" value="0"/> <span id="R1-value" class="value"></span></td></tr>
	</table>
</div>
	</body>
</html>
