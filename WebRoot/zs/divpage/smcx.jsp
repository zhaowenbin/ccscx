<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>全省车船税代征情况分税目统计分析图</title>
		<link rel="stylesheet" type="text/css" href="../themes/default/easyui.css">
		<link rel="stylesheet" type="text/css" href="../themes/icon.css">
		<link rel="stylesheet" type="text/css" href="../css/easyuidemo.css">
		<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript" src="../layer/layer.js"></script>
		<script type="text/javascript" src="../js/jquery.easyui.min.js"></script>
		<script type="text/javascript" src="../js/locale/easyui-lang-zh_CN.js"></script>
		<script type="text/javascript" src="../js/castcode.js"></script>
		<style type="text/css">
#container, #sliders {
	min-width: 310px; 
	max-width: 800px;
	margin: 0 auto;
}
#container {
	height: 375px; 
}
.aaa{
	/*font-weight: bold;*/
	font-size: 14px;
}
		</style>
		<script type="text/javascript">
		var citycode='';	//记住当前选择城市，点刷新按钮时用
		window.onload=function(){
			layer.config({
				extend:'skin/seaning/style.css'
			});
			freshChart0();
		};
		function startloading(){
			layer.load(
			   1,{
			      shade:[0.5,'#000']//,
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
        colors: ['#4673A7', '#AA4744', '#919191', '#DDDF00', '#24CBE5', '#64E572', '#FF9655', '#FFF263', '#7D9EC0']
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
            text: new Date().getFullYear()+'年度全省车船税代征情况分税目统计分析图',
           	style:{
           		fontSize:'14px',
           		fontWeight:'bold',
           		color:'#3E576F'
           	}
        },
        subtitle: {
            text: ''
        },
		xAxis: {
			labels:{ 
				rotation:25
		    },
            categories: ['乘用车1.0（含）以下', '乘用车1.0-1.6（含）', '乘用车1.6-2.0（含）', '乘用车2.0-2.5（含）', '乘用车2.5-3.0（含）', 
                         '乘用车3.0-4.0（含）','乘用车4.0以上', '大型客车','中型客车','货车','挂车','专项作业车','轮式专用机械车','摩托车']
        },
        yAxis: [{
            title: {
                text: '合计金额 (万元)',
                style:{
               		fontSize:'12px',
               		fontWeight:'normal',
               		color:'#6D869F'
               	}
            },
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        },{
            title: {
                text: '',
                //x:50,
                style:{
               		fontSize:'12px',
               		fontWeight:'normal',
               		color:'#FFFFFF'
               	}
            },labels: {
                format: '',
                //x:-100,
                style: {
                    color: '#FFFFFF'
                }
            },
            opposite: true,
            plotLines: [{
                value: 0,
                width: 1,
                color: '#808080'
            }]
        }],
        tooltip: { 
            formatter: function() { 
                var s; 
                if (this.point.name) { // 饼状图 
                    s = '<b>' + this.point.name + '</b>:  ' + this.y+ '  辆 <br><b>占比</b>:  ' +  Highcharts.numberFormat(this.percentage,2) + '%'; 
                }else if(this.series.type=='spline'){
                	s = '<b>同比增幅</b>： '+Highcharts.numberFormat(this.y*100,2)+ '%';
                }else { 
                    s = '' + this.x + ':<br><b>'+ this.series.name +'</b>:' + Highcharts.numberFormat(this.y,2) + '万元'; 
                } 
                return s; 
            } 
        },
        plotOptions: {
            column: {
                depth: 25
            }
        },
        legend:{
        	layout: 'horizontal',       //vertical
            align: 'center',
            verticalAlign: 'top',
            x: -10,
            y: 30,
            floating: true,
            borderWidth: 1,
            shadow: true,
            backgroundColor: '#FFFFFF'
        	
        },
        series: [{
			name:'上期税款',
            data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        },{
			name:'本期税款',
            data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        },{
            type: 'spline',
            name: '同比增幅',
            enabled:false,
            yAxis:1,
            data: [1.2, 1.0, 0.68, 0.8, 0.3,1.5, -0.2, 0.9, 1.1, 2,1.2,1,1.5],
            marker: {
                lineWidth: 2,
                lineColor: Highcharts.getOptions().colors[3],
                fillColor: 'white'
            }
        },{
            type: 'pie',
            //name: '本期车辆数',
            center: [450, 100],
            colors:['#3D96AE', '#80699B', '#BA7669', '#90BF01', '#E6567A', '#FBE47C', '#64E572', '#9D6D45', '#4B6367','#DB843D','#4A6366','#A02312','#7CCADF'],
            data: [
                   {
                       name: '1.0以下',
                       y: 20000,
                       sliced: true,
                       selected: true
                   },['1.0-1.6', 10000],
                   ['1.6-2.0', 10000],
                   ['2.0-2.5', 10000],
                   ['2.5-3.0', 10000],
                   ['3.0-4.0', 10000],
                   ['4.0以上', 10000],
                   ['大型客车', 10000],
                   ['中型客车', 10000],
                   ['货车', 10000],
                   ['挂车', 10000],
                   ['专项作业车', 10000],
                   ['轮式专用机械车', 10000],
                   ['摩托车', 10000]
                   
			]
        }]
    });

    /*
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
    */
});

	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
   	
	function lastYear(){
		var index2 = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				);
		if(parseInt(chart.title.textStr.substring(0,4))-1<2015){
			parent.layer.alert('系统无法查询上线前的数据', {
			     icon: 9,
			     time: 3*1000,
			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			 	});
			layer.close(index2);
		}else{
			var queryYear = parseInt(chart.title.textStr.substring(0,4))-1;
            freshChart('v2smcx',queryYear,index2);
			
		}
	}
	
	function freshChart0(){
		var index2 = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		var newTitle = parseInt(new Date().getFullYear())+''+chart.title.textStr.substring(4);
		chart.setTitle({text:newTitle}); //更新图表年度
		$.ajax({
    		type:"post",//post方法
    		url:parent.basePath+'chartServlet',
    		data:{
    			time:new Date(),
    			citycode:citycode,
    			cacheFlag:true,
    			showType:'v2smcx',
    			year:parseInt(new Date().getFullYear())
    		},
    		success:function(data) {
    			var newData = JSON.parse(data.split('@')[0]);
    			var newData2 = JSON.parse(data.split('@')[1]);
    			var newData3 = JSON.parse(data.split('@')[2]);
    			var newData4 = JSON.parse(data.split('@')[3]);
				chart.series[0].setData(newData);
				chart.series[1].setData(newData2);
				chart.series[2].setData(newData3);
				chart.series[3].setData(newData4);
				layer.close(index2);
				chart.redraw(); 
			 	}
    	});
	}
	
	function freshChart(showType,queryYear,index2){
		var newTitle = queryYear+''+chart.title.textStr.substring(4);
		chart.setTitle({text:newTitle}); //更新图表年度
		$.ajax({
    		type:"post",//post方法
    		url:parent.basePath+'chartServlet',
    		data:{
    			time:new Date(),
    			citycode:citycode,
    			//uid:parent.uid,
    			showType:showType,
    			year:queryYear
    		},
    		success:function(data) {
    			var newData = JSON.parse(data.split('@')[0]);
    			var newData2 = JSON.parse(data.split('@')[1]);
    			var newData3 = JSON.parse(data.split('@')[2]);
    			var newData4 = JSON.parse(data.split('@')[3]);
				chart.series[0].setData(newData);
				chart.series[1].setData(newData2);
				chart.series[2].setData(newData3);
				chart.series[3].setData(newData4);
				layer.close(index2);
				chart.redraw(); 
			 	}
    	});
	}
	
	function nextYear(){
		var index3 = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		if(parseInt(chart.title.textStr.substring(0,4))+1>parseInt(new Date().getFullYear())){
			parent.layer.alert('系统不存在'+new Date().getFullYear()+'年以后的数据', {
			     icon: 9,
			     time: 3*1000,
			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			 	});
			layer.close(index3);
		}else{
			var queryYear = parseInt(chart.title.textStr.substring(0,4))+1;
            freshChart('v2smcx',queryYear,index3); 
		}
	}
	
	function loadChart(){
		//初始化查询系统当年	//chart.title.textStr.substring(0,4)
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				);
		freshChart('v2smcx',parseInt(new Date().getFullYear()),index); 
	}
	function changeCity(city){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		citycode = city;
		freshChart('v2smcx',chart.title.textStr.substring(0,4),index);
		var newTitle = chart.title.textStr.substring(0,4)+'年度'+getCityName(city)+'车船税代征情况分税目统计图';
		chart.setTitle({text:newTitle});	//更新图表省市
		chart.redraw();
	}
		</script>
	</head>
	<body>
<script src="../js/highcharts.js"></script>
<script src="../js/highcharts-3d.js"></script>
<script src="../js/modules/exporting.js"></script>

<!-- 
<div style="float: left;">
起：<input id="datefrom" type="text" style="width:95px;" class="easyui-datebox" >
止：<input id="dateto" type="text" style="width:95px;" class="easyui-datebox" >
<a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">刷新</a>
</div>
 -->

<div style="width:50px; height:50px; float: left;">
<img alt="上一年" onclick="lastYear()" src="../images/previous.png" style="width:100%;" title="上一年" >
</div>
<div style="width:50px; height:50px; float: left;">
<img alt="下一年" onclick="nextYear()" src="../images/next.png" style="width:100%;" title="下一年">
</div>
<div id="container"></div>
<div id="cities" style="margin-top: 40px; margin-left: 30px; z-index: 99;">
	<table style="margin-left: -30px;">
		<tr><td colspan="7"><b>【地市数据】</b></td></tr>
		<tr>
			<td width="120px">
			</td>
			<td width="150px">
			<a href="#" onclick="changeCity('')" class="aaa">陕西省</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610100')" class="aaa">西安</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610200')" class="aaa">铜川</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610300')" class="aaa">宝鸡</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610400')" class="aaa">咸阳</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610500')" class="aaa">渭南</a>
			</td>
		</tr>
		<tr>
			<td width="120px">
			</td>
			<td width="150px">
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610600')" class="aaa">延安</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610700')" class="aaa">汉中</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610800')" class="aaa">榆林</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('610900')" class="aaa">安康</a>
			</td>
			<td width="150px">
				<a href="#" onclick="changeCity('611000')" class="aaa">商洛</a>
			</td>
		</tr>
	</table>
</div>
	<a href="#" onclick="goLinkPage()" style="margin-left: 800px;"><img src="../images/return.png" width="80px" height="50px" border="0"></a>
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
