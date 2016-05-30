<%@page import="java.math.BigDecimal"%>
<%@ page language="java" import="java.util.*,com.derun.controller.busiQuery.web.*" pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String uid = (String)session.getAttribute("uid");
String uname = (String)session.getAttribute("uname");
int total=0;
double sumtax = 0.00;
String comboData = "";
if(uid==null||"".equals(uid)){
	response.getWriter().write("<script>top.location='login2.jsp'</script>"); 
}else{
	BusiQueryServlet bqs = new BusiQueryServlet();
	comboData = bqs.getUsers(uid);//cityData+@+countryData
	if("26100".equals(uid)){
		uid="2000000";
	}
	/*
	//查询当月总计
	String countStr = bqs.getTJ_ThisMonth(uid);
	total = Integer.parseInt(countStr.split("@")[0]);
	if(countStr.split("@")[2]!=null&&!"".equals(countStr.split("@")[2])){
		  sumtax = new BigDecimal(Double.parseDouble(countStr.split("@")[2])/10000).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue(); 
	}
	*/
}
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>车船税系统数据管理平台-主页</title>
	<link rel="stylesheet" type="text/css" href="themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/easyuidemo.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="layer/layer.js"></script>
	<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
	
	<script src="js/highcharts.js"></script>
	<script src="js/highcharts-3d.js"></script>
	<script src="js/modules/exporting.js"></script>
	<script src="js/locale/easyui-lang-zh_CN.js"></script>
	
	<script type="text/javascript">
	
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
		startloading();
		var basePath = '<%=basePath%>';
		var uid = <%=uid%>;
		if(typeof JSON == 'undefined'){
	 		$('head').append($("<script type='text/javascript' src='js/json2.js'>"));
     	};
	
		function win_load(){//东区pg宽度不能自动调整
			$('#main_layout').layout('expand','east');
			$('#main_layout').layout('collapse','east');
			$('#main_layout').layout('expand','east');
			$('#main_layout').layout('collapse','east');
			layer.config({
				extend:'skin/seaning/style.css'
			});
			
			//区县用户不显示地市统计tab页
			var tab_dqtj = $('#tt').tabs('getTab','地区统计').panel('options').tab;  
			if(uid!=null && uid!='undefined' && (uid.toString()=='2000000'||uid.toString()=='2000001'||uid.toString().substring(5)=='00')){
				tab_dqtj.show();  
			}else{
				//归属地市条件不显示，默认使用本级别权限代码
				tab_dqtj.hide();
			}

			/*加载完成*/
			
			endloading();
		}
		
		function bindCityAndCountry(){
			var comboData = '<%=comboData%>';
			var cityData = JSON.parse(comboData.split('@')[0]);
			var countryData = JSON.parse(comboData.split('@')[1]);
			var rows  = $('#pg').propertygrid('getRows');
			var cityEd = rows[2].editor;
			var countryEd = rows[3].editor;
			cityEd.options = cityData;
			cityEd.options.onChange = function(newValue, oldValue){changeCity(newValue,oldValue,countryEd,countryData);};
			countryEd.options = countryData;
			
			$('#pg').propertygrid('refreshRow',2);
			$('#pg').propertygrid('refreshRow',3);
		}
	
		$(document).ready(function(){  
			startloading();
			var height1 = $(window).height()-20;  //20
			$("#main_layout").attr("style","width:100%;height:"+height1+"px");  
			$("#main_layout").layout("resize",{  
				width:"100%",  
				height:height1+"px"  
			}); 
			
		});  
		
		function changeCity(newValue, oldValue, countryEd, countryData){
			if(uid=='2000000'){
				if(newValue==null || newValue==''){
					//清空country
					var rows = $('#pg').propertygrid('getRows');
        			rows[3].value = '';
        			$('#pg').propertygrid('refreshRow',3);
        			//恢复所有区县
					//var countryData = JSON.parse(comboData.split('@')[1]);
					countryEd.options = countryData;
					$('#pg').propertygrid('refreshRow',3);
				}else{
					var newCountryData={"data":[]};
					var newData= new Array();
					for(var i=0; i<countryData.data.length; i++){//根据地市级联区县
						if(countryData.data[i].value.substring(0,4)==newValue.substring(0,4)){
							newData[newData.length]=countryData.data[i];
						}
					}
					newCountryData.data = newData;
					countryEd.options = newCountryData;
					$('#pg').propertygrid('refreshRow',3);
				}
					
			}
		}
		
		$(window).resize(function(){  
			var height1 = $(window).height()-30;  //30
			$("#main_layout").attr("style","width:100%;height:"+height1+"px");  
			$("#main_layout").layout("resize",{  
				width:"100%",  
				height:height1+"px"  
			});  
		});   
		
		function loadCCSData(){//条件查询车船税数据
			//校验区县代码
			var rows = $('#pg').propertygrid('getRows');
			if(rows[2].value!='' && rows[3].value!='' && rows[2].value.substring(0,4)!=rows[3].value.substring(0,4)){
				layer.alert('该地市下区县代码不存在，请重新选择归属区县！', {
      			     icon: 9,
      			     time: 3*1000,
      			     skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
      			 	});
				return false;
			}
      			
      			
			startloading();
			var pg = $("#pg").datagrid('getData');//查询条件
            var dg =$('#dg');
            var opts =dg.datagrid('options');
            var pager =dg.datagrid('getPager');
            var _pageNumber =opts.pageNumber;
            var _pageSize =opts.pageSize;
            //异步获取数据到javascript对象，入参为查询条件和页码信息
            var urlstr = basePath+'busiQueryServlet';
   		 	
            $.ajax({
            		type:"post",//post方法
            		url:urlstr,
            		data:{
            			time:new Date(),
            			context:JSON.stringify(pg),
            			uid:uid,
            			pageNumber:_pageNumber,
            			pageSize:_pageSize
            		},
            		success:function(data) {
	                    //注意此处从数据库传来的data数据有记录总行数的total列
	                    var dataObj = JSON.parse(data);
	                    var total = dataObj.total;
	                    
	                    var rows = $('#pg').propertygrid('getRows');
	        			rows[9].value = dataObj.sumcar + '';
	        			rows[10].value = parseFloat(dataObj.sumtax).toLocaleString() + ' 元';
	        			$('#pg').propertygrid('refreshRow',9);
	        			$('#pg').propertygrid('refreshRow',10);
	                    
	                    $('#dg').datagrid('loadData', dataObj);
	                    pager.pagination({
	                    //更新pagination的导航列表各参数
	                    time:new Date().getTime(),
	                    total:total,//总数
	                    pageSize: _pageSize,//行数
	                    pageNumber: _pageNumber//页数
                     });
	                 	endloading();
       			 	}
            });
			
		}
		
		function quit(){
			window.location = '../index.jsp';
		}
		
	</script> 	
	

</head>
<body style="overflow-y : hidden;">
	
<div style="margin-top:5px;margin-left:5px;margin-right:5px;margin-bottom:5px;">
	<div id="main_layout" class="easyui-layout"  style="width:100%; height:680px;">
		<!-- 北方 -->
		<div data-options="region:'north',split:true,title:'最新统计信息',hideCollapsedContent:false,collapsed:true" style="height: 70px; text-align: right; overflow-x : hidden; overflow-y : hidden; ">		
					<!-- 
			<span style="margin-left:0.5%;">
				<font size="5" style="line-height: 2.0em;" >
					陕西省<font color='green'><b><%=Calendar.getInstance().get(Calendar.YEAR) %>年<%=Calendar.getInstance().get(Calendar.MONTH)+1 %>月</b></font>车船税代收代缴车辆总数为<font color='red'><%=total %></font>辆，					
					税款收入总计<font color='red'><%=sumtax %></font>万元
					环比增长<font color='red'>14.68%</font>，
					同比增长<font color='red'>21.54%</font>
					<b></b>
				</font>
			</span>
					 -->
			<!-- 
	    	<a href="javascript:void(0)" class="easyui-linkbutton" onclick="getRows()">getRows</a>
	    	<span style="float:right;margin-top:10px;margin-right:20px;">
	    		<font size="3" >欢迎 :<%=uname%>操作员</font>&nbsp;&nbsp;&nbsp;&nbsp;
	           	<a href="#" onclick="quit()" > <font size="3" color="red">退出</font> </a>
	        </span>
			 -->
			<a href="#" onclick="quit()"> <font size="3" color="red">退出</font> </a>
		</div>
		
		<!-- 东方 -->
		<div data-options="region:'east',split:true,hideCollapsedContent:false,collapsed:false,tools:[{ iconCls:'icon-search',handler:function(){loadCCSData();}}]" title="高级查询" style="width: 307px;">
		<!--
		<a id="btn" href="#" class="easyui-linkbutton" style="margin-left:245px;" data-options="iconCls:'icon-search'">查询</a>
		-->	<div class="easyui-accordion"  data-options="fit:true,border:false" >
			<table id="pg" class="easyui-propertygrid" style="width:300px;" data-options="
				url:'data/propertygrid.json',
				method:'get',
				sortable:false,
				showHeader:false,
				showGroup:true,
				scrollbarSize:0
				">				
			</table>							
			</div>
			
		</div>
		<!-- 中间 -->
		<div data-options="region:'center',title:'代收代缴信息展示区',iconCls:'icon-large-chart'">	


			<div id="tt" class="easyui-tabs" data-options="tabPosition:'left'" style="width:100%;height:100%">
				
				<div title="明细数据" data-options="iconCls:'icon-filter',closable:false" style="padding:10px">
					<table id="dg" title="明细数据" style="width:100%;height:100%" data-options="
						rownumbers:true,
						singleSelect:true,
						autoRowHeight:false,
						pagination:true,				
						pageSize:15,
						pageList:[15,20,25,30,50]
						">
						<thead>
							<tr>
								<th field="dsjg" width="80" align="center">代收机构</th>
								<th field="hphm" width="100" align="center">号牌号码</th>
								<th field="pl" width="80" align="center">排量/L</th>
								<th field="czxm" width="80" align="center">车主姓名</th>
								<th field="cdrq" width="80" align="center">初登日期</th>
								<th field="nslx" width="80" align="center">纳税类型</th>
								<th field="hjje" width="100" align="center">合计金额</th>
								<th field="sjcjrq" width="110" align="center">代收时间</th>
								<th field="citycode" width="110" align="center">地市</th>
								<th field="countrycode" width="110" align="center">区县</th>
														
							</tr>
						</thead>
					</table>
				</div>
				<!-- 
				<div title="统计汇总表" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="tjhz/table.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage4" name="iframepage4" onLoad="" ></iframe>
				</div>
				 -->
				<div title="年度代收统计" data-options="iconCls:'icon-sum',closable:false,selected:true" style="padding:10px">
					<iframe src="3d-column-interactive/index.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage4" name="iframepage4" onLoad="" ></iframe>
				</div>
				
				<div title="地区统计" id='tab_dqtj' data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="line-basic/index.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage5" name="iframepage5" onLoad="" ></iframe>
				</div>
				<!---->
				
				<div title="排量统计" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="3d-pie/index.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage" name="iframepage" onLoad="" ></iframe>
				</div>
				
				<div title="纳税类型统计" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="3dpie-nslx/index.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage" name="iframepage" onLoad="" ></iframe>
				</div>
				
				<div title="保险公司统计" data-options="iconCls:'icon-sum',closable:false" style="padding:10px">
					<iframe src="column-basic/index.jsp" marginheight="0" marginwidth="0" frameborder="0"  width="100%" height="100%" id="iframepage3" name="iframepage3" onLoad="" ></iframe>
				</div>
				
			</div>
			
			
			<script>
				(function($){
					function pagerFilter(data){
						if ($.isArray(data)){	// is array
							data = {
								total: data.length,
								rows: data
							}
						}
						var target = this;
						var dg = $(target);
						var state = dg.data('datagrid');
						var opts = dg.datagrid('options');
						if (!state.allRows){
							state.allRows = (data.rows);
						}
						if (!opts.remoteSort && opts.sortName){
							var names = opts.sortName.split(',');
							var orders = opts.sortOrder.split(',');
							state.allRows.sort(function(r1,r2){
								var r = 0;
								for(var i=0; i<names.length; i++){
									var sn = names[i];
									var so = orders[i];
									var col = $(target).datagrid('getColumnOption', sn);
									var sortFunc = col.sorter || function(a,b){
										return a==b ? 0 : (a>b?1:-1);
									};
									r = sortFunc(r1[sn], r2[sn]) * (so=='asc'?1:-1);
									if (r != 0){
										return r;
									}
								}
								return r;
							});
						}
						var start = (opts.pageNumber-1)*parseInt(opts.pageSize);
						var end = start + parseInt(opts.pageSize);
						data.rows = state.allRows.slice(start, end);
						return data;
					}

					var loadDataMethod = $.fn.datagrid.methods.loadData;
					var deleteRowMethod = $.fn.datagrid.methods.deleteRow;
					$.extend($.fn.datagrid.methods, {
						clientPaging: function(jq){
							return jq.each(function(){
								var dg = $(this);
								var state = dg.data('datagrid');
								var opts = state.options;
								opts.loadFilter = pagerFilter;
								var onBeforeLoad = opts.onBeforeLoad;
								opts.onBeforeLoad = function(param){
									state.allRows = null;
									return onBeforeLoad.call(this, param);
								}
								var pager = dg.datagrid('getPager');
								pager.pagination({
									onSelectPage:function(pageNum, pageSize){
										opts.pageNumber = pageNum;
										opts.pageSize = pageSize;
										pager.pagination('refresh',{
											pageNumber:pageNum,
											pageSize:pageSize
										});
										loadCCSData(pageNum,pageSize);
										dg.datagrid('loadData',state.allRows);
									}
								});
								$(this).datagrid('loadData', state.data);
								if (opts.url){
									$(this).datagrid('reload');
								}
							});
						},
						loadData: function(jq, data){
							jq.each(function(){
								$(this).data('datagrid').allRows = null;
							});
							return loadDataMethod.call($.fn.datagrid.methods, jq, data);
						},
						deleteRow: function(jq, index){
							return jq.each(function(){
								var row = $(this).datagrid('getRows')[index];
								deleteRowMethod.call($.fn.datagrid.methods, $(this), index);
								var state = $(this).data('datagrid');
								if (state.options.loadFilter == pagerFilter){
									for(var i=0; i<state.allRows.length; i++){
										if (state.allRows[i] == row){
											state.allRows.splice(i,1);
											break;
										}
									}
									$(this).datagrid('loadData', state.allRows);
								}
							});
						},
						getAllRows: function(jq){
							return jq.data('datagrid').allRows;
						}
					});
				})(jQuery);

				function getData(){
					var rows = [];
					/*
					for(var i=1; i<=75; i++){
						var amount = Math.floor(Math.random()*1000);
						var price = Math.floor(Math.random()*1000);
						rows.push({
							dsjg: '保险公司'+i,
							hphm: '陕'+i+i+i,
							vin: 'vin '+i,
							czxm: '车主 '+i,
							cdrq: $.fn.datebox.defaults.formatter(new Date()),
							nslx: amount*price,
							hjje: 'Note '+i,
							sjcjrq: '2015-11-28',
							citycode: '西安市',
							countrycode: '莲湖区'
							
						});
					}
					*/
					return rows;
				}
				
				$(function(){
					$('#tt').tabs({
					  onSelect: function(title,index){
						if(index==0){//明细tab打开
							$('#main_layout').layout('expand','east');
						}else{
							$('#main_layout').layout('collapse','east');
						}
					  }
					});
					
					$('#dg').datagrid({data:getData()}).datagrid('clientPaging');
					
				});
				
				window.onload = function(){ 
					/*加载数据*/
					win_load();
					//pg中city&country重新绑定
					if(uid!=null){
						setTimeout("bindCityAndCountry();",100);//在ie8以下版本的浏览器中，onload事件中获取不到propertygrid的rows，延迟一下下就可以
					}endloading();
				};
				
			</script>	
			
		</div>
		<!-- 南方 -->
		<div data-options="region:'south',split:true,collapsed:true,hideCollapsedContent:false,title:'扩展功能区'" style="height:120px; overflow-x : hidden; overflow-y : hidden; ">
			<!-- 
			<iframe src="top.jsp" frameborder=0 scrolling="no" style="width:100%;">
			 -->
		</div>
	</div>
</div>

<input type="hidden" id="h_sumtax">	
<input type="hidden" id="h_sumcar">
	
</body>
</html>