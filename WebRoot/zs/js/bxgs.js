/**
 * 根据代码获取保险公司名称或简称
 */

function getFullNameOfBxgs(code){
	var name;
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
}

function getShortNameOfBxgs(){
	var name;
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
}