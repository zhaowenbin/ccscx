<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>全省车船税代征情况分属地统计分析图</title>
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
#container, #sliders {
	min-width: 310px; 
	max-width: 800px;
	margin: 0 auto;
}
#container {
	height: 380px;
	min-width: 310px; 
	max-width: 800px;
	margin: 0 auto; 
}
		</style>
		<script type="text/javascript">
		window.onload=function(){
			layer.config({
				extend:'skin/seaning/style.css'
			});
			freshChart0();
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
            text: '全省车船税代征情况分属地统计分析图',
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
            categories: ['西安', '铜川', '宝鸡', '咸阳', '渭南', '延安',
                '汉中', '榆林', '安康', '商洛', '合计']
        },
        yAxis: [{
            title: {
                text: '合计金额 (百万元)',
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
        }
        /*
        ,{
            title: {
                text: '同比增幅',
                style:{
               		fontSize:'12px',
               		fontWeight:'normal',
               		color:'#6D869F'
               	}
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
        }
        */
        ],
        plotOptions: {
            column: {
                depth: 25
            }
        },
        legend:{
        	align:'center',
        	verticalAlign:'bottom',
        	x:20,
        	y:15,
        	padding:10,
        	itemWidth:150
        },
        series: [{
			name:'税款金额（百万元）',
            data: [560, 420, 600, 720, 820, 760, 699, 530, 831, 750,4000]
        },{
			name:'保单数（万笔）',
            data: [680, 500, 750, 830, 990, 1200, 780, 580, 920, 900,5200]
        }
        /*
        ,{
            type: 'pie',
            name: '同比增幅',
            yAxis:1,
            data: [3, 2.67, 3, -2, 3.33,3, 2.67, 3, 1,1.4],
            marker: {
                lineWidth: 2,
                lineColor: Highcharts.getOptions().colors[3],
                fillColor: 'white'
            }
        
        }
        */
        ]
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
   	
   	/*
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
   	*/
   	
   	function freshChart0(){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
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
			var newTitle = "全省车船税代征情分属地统计分析图【"+datefrom+" 至 "+dateto+"】";
			//$("#dg").datagrid("getPanel").panel("setTitle",title);
			chart.setTitle({text:newTitle});
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			cacheFlag:true,
	    			showType:'v2sdcx',
	    			datefrom:datefrom,
	    			dateto:dateto
	    		},
	    		success:function(data) {
	    			var newData = JSON.parse(data.split('@')[0]);
	    			var newData2 = JSON.parse(data.split('@')[1]);
	    			//var newData3 = JSON.parse(data.split('@')[2]);
					chart.series[0].setData(newData);
					chart.series[1].setData(newData2);
					//chart.series[2].setData(newData3);
					layer.close(index);
					chart.redraw(); 
				}
	    	});
			//-----------------------------------
		}catch(e){
			layer.close(index);
		}
	}
	
	function freshChart(index){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
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
			var newTitle = "全省车船税代征情分属地统计分析图【"+datefrom+" 至 "+dateto+"】";
			//$("#dg").datagrid("getPanel").panel("setTitle",title);
			chart.setTitle({text:newTitle});
			
			//----------------查询-------------------
			$.ajax({
	    		type:"post",//post方法
	    		url:parent.basePath+'chartServlet',
	    		data:{
	    			time:new Date(),
	    			showType:'v2sdcx',
	    			datefrom:datefrom,
	    			dateto:dateto
	    		},
	    		success:function(data) {
	    			var newData = JSON.parse(data.split('@')[0]);
	    			var newData2 = JSON.parse(data.split('@')[1]);
	    			//var newData3 = JSON.parse(data.split('@')[2]);
					chart.series[0].setData(newData);
					chart.series[1].setData(newData2);
					//chart.series[2].setData(newData3);
					layer.close(index);
					chart.redraw(); 
				}
	    	});
			//-----------------------------------
		}catch(e){
			layer.close(index);
		}
	}
	
	/*
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
	*/
	
	function loadChart(){
		//初始化查询系统当年	//chart.title.textStr.substring(0,4)
		
		freshChart(); 
	 
	}
		</script>
	</head>
	<body>
<script src="../js/highcharts.js"></script>
<script src="../js/highcharts-3d.js"></script>
<script src="../js/modules/exporting.js"></script>
<div style="margin: 0 auto; width: 950px; ">
<div style="float: none;">
起：<input id="datefrom" type="text" style="width:95px;" class="easyui-datebox" >
止：<input id="dateto" type="text" style="width:95px;" class="easyui-datebox" >
<a id="btn" href="#" onclick="freshChart()" class="easyui-linkbutton" data-options="iconCls:'icon-reload'">刷新</a>
</div>
<!-- 
<div style="width:50px; height:50px; float: left;">
<img alt="上一年" onclick="lastYear()" src="../images/previous.png" style="width:100%;" title="上一年" >
</div>
<div style="width:50px; height:50px; float: left;">
<img alt="下一年" onclick="nextYear()" src="../images/next.png" style="width:100%;" title="下一年">
</div>
 -->
<div id="container"></div>
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
