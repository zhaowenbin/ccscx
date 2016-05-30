package com.derun.webservice.client;

import java.rmi.Remote;

import com.derun.webservice.client.taxmonitor.BaseMonitorReqInfo;
import com.derun.webservice.client.taxmonitor.BaseMonitorResInfo;

public interface ITaxMonitorClient extends Remote {
	
	public BaseMonitorResInfo taxMon(BaseMonitorReqInfo req);

}
