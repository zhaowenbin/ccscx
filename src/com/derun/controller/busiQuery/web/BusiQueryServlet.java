package com.derun.controller.busiQuery.web;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.derun.common.db.ExeSQL;
import com.derun.common.db.SSRS;
import com.derun.controller.busiQuery.dao.BusiQueryDao;
import com.derun.controller.busiQuery.util.BusiQueryUtil;
import com.derun.controller.busiQuery.util.ResponseUtil;

public class BusiQueryServlet extends HttpServlet {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BusiQueryDao busiQueryDao = new BusiQueryDao();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String uid =  request.getParameter("uid");//用户编号
		String context = request.getParameter("context");//得到查询条件   
		int pageNumber = Integer.parseInt(request.getParameter("pageNumber"));//页数
		int pageSize = Integer.parseInt(request.getParameter("pageSize"));//页大小
		
		JSONObject jo = JSONObject.fromObject(context);
		//jo.get("total");//条件总数
		String startTime = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(0)).get("value");
		String endTime = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(1)).get("value");
		String citycode = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(2)).get("value");
		String countrycode = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(3)).get("value");
		String bxgscode = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(4)).get("value");
		String nslx = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(5)).get("value");
		//String sbflag = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(6)).get("value");
		String pl = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(6)).get("value");
		String hphm = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(7)).get("value");
		String czxm = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(8)).get("value");
		String iswdcStr = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(9)).get("value");
		boolean iswdc = true;//Boolean.parseBoolean(iswdcStr);
		String ishistoryStr = (String) JSONObject.fromObject(JSONArray.fromObject(jo.get("rows")).get(10)).get("value");
		boolean ishistory = false;//Boolean.parseBoolean(ishistoryStr);
	      
	      JSONObject json = new JSONObject();
	      JSONArray array = new JSONArray();
	      JSONObject result = null;
	      
	      ArrayList<BusiQueryUtil> list;
	      try{
	    	  list = (ArrayList<BusiQueryUtil>) busiQueryDao.getCondition(pageNumber, pageSize, startTime, endTime, citycode, countrycode, bxgscode, nslx, pl, hphm, czxm, iswdc, ishistory,uid);
	    	  String countStr = busiQueryDao.busiCount(startTime, endTime, citycode, countrycode, bxgscode, nslx, pl, hphm, czxm, iswdc, ishistory,uid);
	    	  int total = 0;//Integer.parseInt(countStr.split("@")[0]);
	    	  int sumcar = 0;//Integer.parseInt(countStr.split("@")[1]);
	    	  double sumtax = 0.00;
	    	  if(countStr.split("@")[0]!=null&&!"".equals(countStr.split("@")[0])){
	    		  total = Integer.parseInt(countStr.split("@")[0]); 
	    	  }
	    	  if(countStr.split("@")[1]!=null&&!"".equals(countStr.split("@")[1])){
	    		  sumcar = Integer.parseInt(countStr.split("@")[1]); 
	    	  }
	    	  if(countStr.split("@")[2]!=null&&!"".equals(countStr.split("@")[2])){
	    		  sumtax = Double.parseDouble(countStr.split("@")[2]); 
	    	  }
	    	  for(int i=0;i<list.size();i++){
		    	  result = new JSONObject();
		    	  BusiQueryUtil busiQueryUtil = list.get(i);
		    	  result.put("dsjg", busiQueryUtil.getTAXCONFIRMNO().substring(1, 5));
		    	  result.put("hphm", busiQueryUtil.getHPHM());
		    	  result.put("pl", busiQueryUtil.getDISPLACEMENT());
		    	  result.put("czxm", busiQueryUtil.getTAXPAYERNAME());
		    	  result.put("cdrq", busiQueryUtil.getFIRSTREGISTERDATE());
		    	  result.put("nslx", busiQueryUtil.getTAXCONDITIONCODE());
		    	  result.put("hjje", busiQueryUtil.getSUMTAX());
		    	  result.put("sjcjrq", busiQueryUtil.getSJCJRQ());
		    	  result.put("citycode", busiQueryUtil.getCITYCODE());
		    	  result.put("countrycode", busiQueryUtil.getCOUNTRYCODE());
		    	  
		    	  array.add(result);
	    	  }
	    	json.put("total",total );
		    json.put("rows", array);
		    json.put("sumcar",sumcar );
		    json.put("sumtax",sumtax );
		    ResponseUtil.write(response, json);
		    System.out.println(json.toString());
		    System.out.println(array.toString());
	      }catch(Exception e){
	    	 e.printStackTrace(); 
	    	 
	    	
	      }
		
	}
	
	public String readJSONString(HttpServletRequest request) {
		StringBuffer json = new StringBuffer();
		String line = null;
		try {
			BufferedReader reader = request.getReader();
			while ((line = reader.readLine()) != null) {
				json.append(line);
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return json.toString();
	} 
	
	/**
	 * 本月统计信息
	 * @param uid
	 * @return
	 */
	public String getTJ_ThisMonth(String uid){
		Calendar cal = Calendar.getInstance();
		String thisYear = String.valueOf(cal.get(Calendar.YEAR));
		String thisMonth = "";
		int month = cal.get(Calendar.MONTH)+1;
		if(month<10){
			thisMonth = "0"+String.valueOf(month);
		}else{
			thisMonth = String.valueOf(month);
		}
		
		String startTime = thisYear+"-"+thisMonth+"-01 00:00:00";
		String tj_thismonth = busiQueryDao.busiCount(startTime, null, null, null, null, null, null, null, null, true, false, uid);
		return tj_thismonth;
	}
	
	/**
	 * 取得系统配置用户
	 * @return
	 */
	public String getUsers(String uid){
		String cityData = "";
		String countryData = "";
		if(uid.equals("2000000")){//省局
			cityData = "{\"data\": [{ \"value\":\""+"610100"+"\", \"text\":\""+"西安市"+"\"},"
					+ "{ \"value\":\""+"610200"+"\", \"text\":\""+"铜川市"+"\"},"
					+ "{ \"value\":\""+"610300"+"\", \"text\":\""+"宝鸡市"+"\"},"
					+ "{ \"value\":\""+"610400"+"\", \"text\":\""+"咸阳市"+"\"},"
					+ "{ \"value\":\""+"610500"+"\", \"text\":\""+"渭南市"+"\"},"
					+ "{ \"value\":\""+"610600"+"\", \"text\":\""+"延安市"+"\"},"
					+ "{ \"value\":\""+"610700"+"\", \"text\":\""+"汉中市"+"\"},"
					+ "{ \"value\":\""+"610800"+"\", \"text\":\""+"榆林市"+"\"},"
					+ "{ \"value\":\""+"610900"+"\", \"text\":\""+"安康市"+"\"},"
					+ "{ \"value\":\""+"611000"+"\", \"text\":\""+"商洛市"+"\"}]}";
			SSRS ssrs = new ExeSQL().execSQL("select substr(id,2,6)||'@'||name from ccsuser where id!='2000000' and id !='2000001' and substr(id,6,2) !='00' ");
			StringBuffer countryDataBuff = new StringBuffer("{\"data\": [");
			for(int i=1;i<=ssrs.MaxRow;i++){
				countryDataBuff.append("{ \"value\":\""+ssrs.GetText(i, 1).split("@")[0]+"\", \"text\":\""+ssrs.GetText(i, 1).split("@")[1]+"\"},");
			}
			countryDataBuff.delete(countryDataBuff.length()-1, countryDataBuff.length());
			countryDataBuff.append("]}");
			countryData = countryDataBuff.toString();
		}else if(uid.equals("2000001")){//大企业局
			cityData = "{\"data\": [{ \"value\":\""+"610100"+"\", \"text\":\""+"西安市"+"\"}]}";
			countryData = "{\"data\": [{ \"value\":\""+"610102"+"\", \"text\":\""+"新城区"+"\"},"
					+ "{ \"value\":\""+"610103"+"\", \"text\":\""+"碑林区"+"\"},"
							+ "{ \"value\":\""+"610104"+"\", \"text\":\""+"莲湖区"+"\"},"
									+ "{ \"value\":\""+"610111"+"\", \"text\":\""+"灞桥区"+"\"},"
											+ "{ \"value\":\""+"610112"+"\", \"text\":\""+"未央区"+"\"},"
													+ "{ \"value\":\""+"610113"+"\", \"text\":\""+"雁塔区"+"\"}]}";
		}else if(uid.substring(5).equals("00")){//地市级
			String username = new ExeSQL().getOneValue("select name from ccsuser where id='"+uid+"'");
			SSRS ssrs = new ExeSQL().execSQL("select substr(id,2,6)||'@'||name from ccsuser where id!='"+uid+"' and id like '"+uid.substring(0,5)+"%'");
			cityData = "{\"data\": [{ \"value\":\""+uid.substring(1)+"\", \"text\":\""+username+"\"}]}";
			StringBuffer countryDataBuff = new StringBuffer("{\"data\": [");
			for(int i=1;i<=ssrs.MaxRow;i++){
				countryDataBuff.append("{ \"value\":\""+ssrs.GetText(i, 1).split("@")[0]+"\", \"text\":\""+ssrs.GetText(i, 1).split("@")[1]+"\"},");
			}
			countryDataBuff.delete(countryDataBuff.length()-1, countryDataBuff.length());
			countryDataBuff.append("]}");
			countryData = countryDataBuff.toString();
			
		}else{//区县级
			String superUser = new ExeSQL().getOneValue("select id||'@'||name from ccsuser where id='"+uid.substring(0, 5)+"00"+"'");
			String user = new ExeSQL().getOneValue("select id||'@'||name from ccsuser where id='"+uid+"'");
			cityData = "{\"data\": [{ \"value\":\""+superUser.split("@")[0].substring(1)+"\", \"text\":\""+superUser.split("@")[1]+"\"}]}";
			countryData = "{\"data\": [{ \"value\":\""+user.split("@")[0].substring(1)+"\", \"text\":\""+user.split("@")[1]+"\"}]}";
		}
		return cityData+"@"+countryData;
	}
		  
  
}
