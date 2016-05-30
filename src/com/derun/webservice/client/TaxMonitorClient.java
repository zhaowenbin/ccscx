package com.derun.webservice.client;

import javax.xml.bind.JAXBElement;

import com.derun.webservice.client.taxmonitor.BaseMonitorReqInfo;
import com.derun.webservice.client.taxmonitor.ObjectFactory;


public class TaxMonitorClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		callTaxMon();

	}
	
//	public static void callTaxMon() throws Exception {
//
//		String wsdlUrl = "http://192.168.10.216:7002/taxcarship/services/TaxMonitorService?wsdl";
//
//		JaxWsDynamicClientFactory clientFactory = JaxWsDynamicClientFactory.newInstance();
//
//		Client client = clientFactory.createClient(wsdlUrl);
//
//		BaseMonitorReqInfo req = new BaseMonitorReqInfo();
//		req.setBusiDataLength(1);
//		ObjectFactory objFac=new ObjectFactory();
//		JAXBElement<String> monType = objFac.createBaseMonitorReqInfoMonType("04");
//		req.setMonType(monType);
//		
//		Object[] result = client.invoke("taxMon", new Object[1]);
//
//		
//		System.out.println(result);
//
//
//	}
	

}
