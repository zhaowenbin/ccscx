/**
 * 根据代码获取保险公司名称或简称
 */

function getFullNameOfBxgs(code){
	var name='';
	var bigCode = code.toUpperCase();
	if(bigCode=='ABIC'){
		name = '安邦财产保险股份有限公司';
	}else if(bigCode=='ACIC'){
		name = '安诚财产保险股份有限公司';
	}else if(bigCode=='AICS'){
		name = '永诚财产保险股份有限公司';
	}else if(bigCode=='AMIC'){
		name = '安盟保险（中国）有限公司';
	}else if(bigCode=='BOCI'){
		name = '中银保险有限公司';
	}else if(bigCode=='BPIC'){
		name = '渤海财产保险股份有限公司';
	}else if(bigCode=='CCIC'){
		name = '中国大地财产保险股份有限公司';
	}else if(bigCode=='CIPC'){
		name = '中华联合财产保险公司';
	}else if(bigCode=='CPIC'){
		name = '中国太平洋财产保险股份有限公司';
	}else if(bigCode=='DBIC'){
		name = '都邦财产保险股份有限公司';
	}else if(bigCode=='GPIC'){
		name = '中国人寿财产保险公司';
	}else if(bigCode=='HAIC'){
		name = '华安财产保险股份有限公司';
	}else if(bigCode=='HTIC'){
		name = '华泰财产保险有限公司';
	}else if(bigCode=='JTIC'){
		name = '锦泰财产保险股份有限公司';
	}else if(bigCode=='PAIC'){
		name = '中国平安财产保险股份有限公司';
	}else if(bigCode=='PICC'){
		name = '中国人民财产保险股份有限公司';
	}else if(bigCode=='TAIC'){
		name = '天安财产保险股份有限公司';
	}else if(bigCode=='TPBX'){
		name = '安盛天平财产保险股份有限公司';
	}else if(bigCode=='TPIC'){
		name = '太平保险有限公司';
	}else if(bigCode=='XDCX'){
		name = '信达财产保险股份有限公司';
	}else if(bigCode=='YAIC'){
		name = '永安财产保险股份有限公司';
	}else if(bigCode=='YDCX'){
		name = '英大泰和财产保险股份有限公司';
	}else if(bigCode=='YGBX'){
		name = '阳光财产保险股份有限公司';
	}
	return name;
}

/**
 * 根据保险公司代码获得简称
 */
function getShortNameOfBxgs(){
	var name='';
	var bigCode = code.toUpperCase();
	if(bigCode=='ABIC'){
		name = '安邦财险';
	}else if(bigCode=='ACIC'){
		name = '安诚财险';
	}else if(bigCode=='AICS'){
		name = '永诚财险';
	}else if(bigCode=='AMIC'){
		name = '安盟保险';
	}else if(bigCode=='BOCI'){
		name = '中银保险';
	}else if(bigCode=='BPIC'){
		name = '渤海财险';
	}else if(bigCode=='CCIC'){
		name = '大地财险';
	}else if(bigCode=='CIPC'){
		name = '中华联合';
	}else if(bigCode=='CPIC'){
		name = '太平洋财险';
	}else if(bigCode=='DBIC'){
		name = '都邦财险';
	}else if(bigCode=='GPIC'){
		name = '国寿财险';
	}else if(bigCode=='HAIC'){
		name = '华安财险';
	}else if(bigCode=='HTIC'){
		name = '华泰财险';
	}else if(bigCode=='JTIC'){
		name = '锦泰财险';
	}else if(bigCode=='PAIC'){
		name = '平安财险';
	}else if(bigCode=='PICC'){
		name = '人保财险';
	}else if(bigCode=='TAIC'){
		name = '天安财险';
	}else if(bigCode=='TPBX'){
		name = '安盛天平';
	}else if(bigCode=='TPIC'){
		name = '太平保险';
	}else if(bigCode=='XDCX'){
		name = '信达财险';
	}else if(bigCode=='YAIC'){
		name = '永安财险';
	}else if(bigCode=='YDCX'){
		name = '英大泰和';
	}else if(bigCode=='YGBX'){
		name = '阳光财险';
	}
	return name;
}

function getCityName(citycode){
	var cityname='';
	if(citycode==undefined || citycode==''){
		cityname='全省';
	}else if(citycode=='610100'){
		cityname='西安市';
	}else if(citycode=='610200'){
		cityname='铜川市';
	}else if(citycode=='610300'){
		cityname='宝鸡市';
	}else if(citycode=='610400'){
		cityname='咸阳市';
	}else if(citycode=='610500'){
		cityname='渭南市';
	}else if(citycode=='610600'){
		cityname='延安市';
	}else if(citycode=='610700'){
		cityname='汉中市';
	}else if(citycode=='610800'){
		cityname='榆林市';
	}else if(citycode=='610900'){
		cityname='安康市';
	}else if(citycode=='611000'){
		cityname='商洛市';
	}
	return cityname;
}

function dateCmp(a,b){//a小于b返回true
	var arr = a.split("-");
	var starttime = new Date(arr[0], arr[1], arr[2]);
	var starttimes = starttime.getTime();
	
	var arrs = b.split("-");
	var lktime = new Date(arrs[0], arrs[1], arrs[2]);
	var lktimes = lktime.getTime();
	
	if (starttimes <= lktimes) {//开始时间必须不大于终止时间
		return true;
	}
	else
		return false;
}

function GetDateStr(AddDayCount) { 
	var dd = new Date(); 
	dd.setDate(dd.getDate()+AddDayCount);//获取AddDayCount天后的日期 
	var y = dd.getFullYear(); 
	var m = dd.getMonth()+1;//获取当前月份的日期 
	var d = dd.getDate(); 
	return y+"-"+m+"-"+d; 
}

function myBrowser(){
	
	var Sys = {};
    var ua = navigator.userAgent.toLowerCase();
    if (window.ActiveXObject) {
        Sys.ie = ua.match(/msie ([\d.]+)/)[1];
    }
    else if(ua.indexOf('firefox')>-1 ){
        Sys.firefox = ua.match(/firefox\/([\d.]+)/)[1];
    }
    else if (window.MessageEvent && !document.getBoxObjectFor && ua.indexOf('chrome') > -1) {
      Sys.chrome = ua.match(/chrome\/([\d.]+)/)[1];
    }
    else if (window.opera) {
        Sys.opera = ua.match(/opera.([\d.]+)/)[1];
    }
	
    if(Sys.ie){
    	var browser=navigator.appName ;
    	var b_version=navigator.appVersion ;
    	var version=b_version.split(";"); 
    	var trim_Version=version[1].replace(/[ ]/g,""); 	
    	if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE6.0") 
    	{ 
    		return "IE6";
    	} 
    	else if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE7.0") 
    	{ 
    		return "IE7";
    	} 
    	else if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE8.0") 
    	{ 
    		return "IE8";
    	} 
    	else if(browser=="Microsoft Internet Explorer" && trim_Version=="MSIE9.0") 
    	{ 
    		return "IE9";
    	} 
    }else if(Sys.firefox){
    	return "FF";
    }else if(Sys.chrome){
    	return "Chrome";
    }else if(Sys.opera){
    	return "Opera";
    }else if(Sys.safari){
    	return "Safari";
    }else{
    	return "Other";
    }
}


