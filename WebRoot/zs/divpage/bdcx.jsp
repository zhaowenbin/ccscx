<%@ page language="java" import="java.util.*" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>保单明细信息精确查询</title>
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
}
.f1{
	width:130px;
}
</style>
	<script type="text/javascript">
	window.onload=function(){
		parent.layer.config({
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
	
	$(function(){
       $('#ff').form({
          success:function(data){
             $.messager.alert('Info', data, 'info');
          }
	   });
	});
	

	if(typeof JSON == 'undefined'){
		$('head').append($("<script type='text/javascript' src='../js/json2.js'>"));
   	};
   	
   	function clearform(){
   		$("input").val('');
   	}
   	
	function loadrkmx(){
		var index = layer.load(
				   3,{
				      shade:[0.8,'#000']//,
				      //time:2*1000//2秒自动关闭
				   }
				); 
		try{
			//判断车架号、号牌号码
			var hphm = ff.hphm.value;
			var vin = ff.vin.value;
			if($.trim(hphm)==''&&$.trim(vin)==''){
				layer.close(index);
				layer.alert('请输入号牌号码或车架号进行查询！', {
			    	icon: 9,
			    	time: 3*1000,
			    	skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
			 	});
			}else{
				//parent.layer.msg('正在加载，请稍后...', {shade: 0.3});
				$.ajax({
		    		type:"post",//post方法
		    		url:parent.basePath+'chartServlet',
		    		data:{
		    			//time:new Date(),
		    			showType:'v2bdcx',
		    			hphm:$.trim(hphm),
		    			vin:$.trim(vin)
		    		},
		    		success:function(data) {
		    			if(data==''){
		    				layer.alert('未查询到该车投保信息，请确认后重新输入！', {
		    			    	icon: 9,
		    			    	time: 3*1000,
		    			    	skin: 'layer-ext-seaning' //该皮肤由layer.seaning.com友情扩展。关于皮肤的扩展规则，去这里查阅
		    			 	});
		    			}
		    			var rkmx = data.split('@#');
		    			$("#taxqueryno").textbox('setValue',rkmx[0]);
		    			$("#taxconfirmno").textbox('setValue',rkmx[1]);
		    			$("#taxprintno").textbox('setValue',rkmx[2]);
		    			$("#vin").textbox('setValue',rkmx[3]);
		    			$("#hphm").textbox('setValue',rkmx[4]);
		    			$("#hpzl").textbox('setValue',rkmx[5]);
		    			$("#cllx").textbox('setValue',rkmx[6]);
		    			$("#taxconditioncode").textbox('setValue',rkmx[7]);
		    			$("#taxregistrynumber").textbox('setValue',rkmx[8]);
		    			$("#taxpayername").textbox('setValue',rkmx[9]);
		    			$("#taxpayeridentificationcode").textbox('setValue',rkmx[10]);
		    			$("#taxlocationcode").textbox('setValue',rkmx[11]);
		    			$("#taxstartdate").textbox('setValue',rkmx[12]);
		    			$("#taxenddate").textbox('setValue',rkmx[13]);
		    			$("#taxunittypecode").textbox('setValue',rkmx[14]);
		    			$("#unitrate").textbox('setValue',rkmx[15]);
		    			$("#annualtaxamount").textbox('setValue',rkmx[16]);
		    			$("#taxdepartmentcode").textbox('setValue',rkmx[17]);
		    			$("#taxdepartment").textbox('setValue',rkmx[18]);
		    			$("#taxdocumentnumber").textbox('setValue',rkmx[19]);
		    			$("#deductiondepartmentcode").textbox('setValue',rkmx[20]);
		    			$("#deductiondepartment").textbox('setValue',rkmx[21]);
		    			$("#deductionduecode").textbox('setValue',rkmx[22]);
		    			$("#deductionduetype").textbox('setValue',rkmx[23]);
		    			$("#deductiondueproportion").textbox('setValue',rkmx[24]);
		    			$("#deduction").textbox('setValue',rkmx[25]);
		    			$("#deductiondocumentnumber").textbox('setValue',rkmx[26]);
		    			$("#taxdue").textbox('setValue',rkmx[27]);
		    			$("#exceeddate").textbox('setValue',rkmx[28]);
		    			$("#exceeddayscount").textbox('setValue',rkmx[29]);
		    			$("#overdue").textbox('setValue',rkmx[30]);
		    			$("#totalamount").textbox('setValue',rkmx[31]);
		    			$("#loginname").textbox('setValue',rkmx[32]);
		    			$("#revenuecode").textbox('setValue',rkmx[33]);
		    			$("#sjcjrq").textbox('setValue',rkmx[34]);
		    			$("#paycompanycode").textbox('setValue',rkmx[35]);
		    			$("#paydate").textbox('setValue',rkmx[36]);
		    			$("#taxamount_flag").textbox('setValue',rkmx[37]);
		    			$("#annualtaxdue").textbox('setValue',rkmx[38]);
		    			$("#sumtaxdefault").textbox('setValue',rkmx[39]);
		    			$("#sumoverdue").textbox('setValue',rkmx[40]);
		    			$("#sumtax").textbox('setValue',rkmx[41]);
		    			$("#loggedout").textbox('setValue',rkmx[42]);
		    			$("#platformstate").textbox('setValue',rkmx[43]);
		    			$("#changetype").textbox('setValue',rkmx[44]);
		    			$("#counttaxtype").textbox('setValue',rkmx[45]);
		    			$("#refusetype").textbox('setValue',rkmx[46]);
		    			$("#statusdate").textbox('setValue',rkmx[47]);
		    			$("#firstregisterdate").textbox('setValue',rkmx[48]);
		    			$("#specialcartype").textbox('setValue',rkmx[49]);
		    			$("#tsbz").textbox('setValue',rkmx[50]);
		    			$("#engineno").textbox('setValue',rkmx[51]);
		    			$("#insurestartdate").textbox('setValue',rkmx[52]);
		    			$("#insureenddate").textbox('setValue',rkmx[53]);
		    			$("#carserialno").textbox('setValue',rkmx[54]);
		    			$("#carserialnoafter").textbox('setValue',rkmx[55]);
		    			$("#vehicleownername").textbox('setValue',rkmx[56]);
		    			$("#credentialno").textbox('setValue',rkmx[57]);
		    			$("#credentialcode").textbox('setValue',rkmx[58]);
		    			$("#address").textbox('setValue',rkmx[59]);
		    			$("#phoneno").textbox('setValue',rkmx[60]);
		    			$("#carmatchid").textbox('setValue',rkmx[61]);
		    			$("#reverseflag").textbox('setValue',rkmx[62]);
		    			$("#motorusagetypecode").textbox('setValue',rkmx[63]);
		    			$("#model").textbox('setValue',rkmx[64]);
		    			$("#vehicletype").textbox('setValue',rkmx[65]);
		    			$("#ratedpassengercapacity").textbox('setValue',rkmx[66]);
		    			$("#tonnage").textbox('setValue',rkmx[67]);
		    			$("#wholeweight").textbox('setValue',rkmx[68]);
		    			$("#displacement").textbox('setValue',rkmx[69]);
		    			$("#power").textbox('setValue',rkmx[70]);
		    			$("#fueltype").textbox('setValue',rkmx[71]);
		    			$("#citycode").textbox('setValue',rkmx[72]);
		    			$("#countrycode").textbox('setValue',rkmx[73]);
		    			
		    			layer.close(index);
	
					}
		    	});
				}
			
		}catch(e){
			layer.close(index);
		}
		
	}
	
		</script>
	</head>
	<body>
	<div style="margin: 0 auto; width: 950px; ">
	<div class="easyui-panel" title="保单信息" data-options="iconCls:'icon-search'" style="padding:10px;">
        <form name="ff" method="post" enctype="multipart/form-data">
            <table cellspacing="5">
            	<tr>
            		<td colspan="7">温馨提示：请填写完整车辆<b><font color="red">&nbsp;号牌号码&nbsp;</font></b>或<b><font color="red">&nbsp;车架号&nbsp;</font></b>进行查询。</td>
            		<td align="center">
            		<a href="#" onclick="clearform()" class="easyui-linkbutton" data-options="iconCls:'icon-clear'">清 空</a>
            		<a href="#" onclick="loadrkmx()" class="easyui-linkbutton" data-options="iconCls:'icon-search'">查 询</a>
            		</td>
            	</tr>
            	<tr>
            		<td colspan="8"></td>
            	</tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>查询码:</td>
                    <td><input id="taxqueryno" class="f1 easyui-textbox"></input></td>
                    <td>确认码:</td>
                    <td><input id="taxconfirmno" class="f1 easyui-textbox"></input></td>
                    <td>投保起期:</td>
                    <td><input id="insurestartdate" class="f1 easyui-textbox"></input></td>
                    <td>投保止期:</td>
                    <td><input id="insureenddate" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #F0F8FF; ">
                    <td>代收公司:</td>
                    <td><input id="paycompanycode" class="f1 easyui-textbox"></input></td>
                    <td>代收时间:</td>
                    <td><input id="sjcjrq" class="f1 easyui-textbox"></input></td>
                    <td>平台状态:</td>
                    <td><input id="platformstate" class="f1 easyui-textbox"></input></td>
                    <td>申报日期:</td>
                    <td><input id="statusdate" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>车辆类型:</td>
                    <td><input id="cllx" class="f1 easyui-textbox"></input></td>
                    <td style="font-weight: bolder; color: red;">号牌号码:</td>
                    <td><input id="hphm" class="f1 easyui-textbox"></input></td>
                    <td style="font-weight: bolder; color: red;">车架号:</td>
                    <td><input id="vin" class="f1 easyui-textbox"></input></td>
                    <td>发动机号:</td>
                    <td><input id="engineno" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #F0F8FF; ">
                    <td>使用性质:</td>
                    <td><input id="motorusagetypecode" class="f1 easyui-textbox"></input></td>
                    <td>车辆型号:</td>
                    <td><input id="model" class="f1 easyui-textbox"></input></td>
                    <td>交管车型:</td>
                    <td><input id="vehicletype" class="f1 easyui-textbox"></input></td>
                    <td>能源种类:</td>
                    <td><input id="fueltype" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>核载客数:</td>
                    <td><input id="ratedpassengercapacity" class="f1 easyui-textbox"></input></td>
                    <td>核载质量:</td>
                    <td><input id="tonnage" class="f1 easyui-textbox"></input></td>
                    <td>整备质量:</td>
                    <td><input id="wholeweight" class="f1 easyui-textbox"></input></td>
                    <td>排量:</td>
                    <td><input id="displacement" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #F0F8FF; ">
                    <td>税务登记证号:</td>
                    <td><input id="taxregistrynumber" class="f1 easyui-textbox"></input></td>
                    <td>纳税人名称:</td>
                    <td><input id="taxpayername" class="f1 easyui-textbox"></input></td>
                    <td>纳税人识别号:</td>
                    <td><input id="taxpayeridentificationcode" class="f1 easyui-textbox"></input></td>
                    <td>纳税地区代码:</td>
                    <td><input id="taxlocationcode" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>纳税类型:</td>
                    <td><input id="taxconditioncode" class="f1 easyui-textbox"></input></td>
                    <td>税款起期:</td>
                    <td><input id="taxstartdate" class="f1 easyui-textbox"></input></td>
                    <td>税款止期:</td>
                    <td><input id="taxenddate" class="f1 easyui-textbox"></input></td>
                    <td>所属年度:</td>
                    <td><input id="paydate" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #F0F8FF; ">
                    <td>计税单位代码:</td>
                    <td><input id="taxunittypecode" class="f1 easyui-textbox"></input></td>
                    <td>单位计税金额:</td>
                    <td><input id="unitrate" class="f1 easyui-textbox"></input></td>
                    <td>当期应纳税额:</td>
                    <td><input id="taxdue" class="f1 easyui-textbox"></input></td>
                    <td>合计金额:</td>
                    <td><input id="sumtax" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>减免原因:</td>
                    <td><input id="deductionduecode" class="f1 easyui-textbox"></input></td>
                    <td>减免方案:</td>
                    <td><input id="deductionduetype" class="f1 easyui-textbox"></input></td>
                    <td>减免比例:</td>
                    <td><input id="deductiondueproportion" class="f1 easyui-textbox"></input></td>
                    <td>减免金额:</td>
                    <td><input id="deduction" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #F0F8FF; ">
                    <td>减免机关代码:</td>
                    <td><input id="deductiondepartmentcode" class="f1 easyui-textbox"></input></td>
                    <td>减免机关名称:</td>
                    <td><input id="deductiondepartment" class="f1 easyui-textbox"></input></td>
                    <td>减免凭证号:</td>
                    <td><input id="deductiondocumentnumber" class="f1 easyui-textbox"></input></td>
                    <td>税款归属地市</td>
                    <td><input id="citycode" class="f1 easyui-textbox"></input></td>
                </tr>
                <tr style="background-color: #FFF8DC; ">
                    <td>完税机关代码:</td>
                    <td><input id="taxdepartmentcode" class="f1 easyui-textbox"></input></td>
                    <td>完税机关名称:</td>
                    <td><input id="taxdepartment" class="f1 easyui-textbox"></input></td>
                    <td>完税凭证号:</td>
                    <td><input id="taxdocumentnumber" class="f1 easyui-textbox"></input></td>
                    <td>税款归属区县</td>
                    <td><input id="countrycode" class="f1 easyui-textbox"></input></td>
                </tr>
            </table>
        </form>
	

    </div>
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
