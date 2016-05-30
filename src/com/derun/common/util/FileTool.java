package com.derun.common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class FileTool {

//	private static Logger log = Logger.getLogger(FileTool.class);
	public static JSONArray bxgs = null;
	public static JSONArray nslx = null;
	public static JSONArray city = null;
    
	public static void main(String[] args) {
//		String filePath = "E:\\workspaces\\ccs2\\ccszs\\WebRoot\\zs\\data\\bxgs.json";
//		String jsonStr = readJsonFile(filePath);
//		log.debug(jsonStr);
//		JSONArray jsonArray = JSONArray.fromObject(jsonStr);
//		int size = jsonArray.size();
//		log.debug("Size: " + size);;
//		for(int  i = 0; i < size; i++){
//			JSONObject jsonObject = jsonArray.getJSONObject(i);
//			log.debug("[" + i + "]id=" + jsonObject.get("id"));
//			log.debug("[" + i + "]text=" + jsonObject.get("text"));
//		}
	}
	
	public static JSONArray readJsonFile(String filePath) {
		BufferedReader reader = null;
		String laststr = "";
		try {
			FileInputStream fileInputStream = new FileInputStream(filePath);
			InputStreamReader inputStreamReader = new InputStreamReader(
					fileInputStream, "UTF-8");
			reader = new BufferedReader(inputStreamReader);
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				laststr += tempString;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return JSONArray.fromObject(laststr);
	}
	
	/**
	 * 取得保险公司中文名称
	 * @param bxgsCode
	 * @return
	 */
	public static String getBxgsCnName(String bxgsCode){
		String cnName = "";
		if(bxgs == null){
			bxgs = readJsonFile(getWebRootPath()+"\\zs\\data\\bxgs.json");
		}
		for(int  i = 0; i < bxgs.size(); i++){
			JSONObject jsonObject = bxgs.getJSONObject(i);
			if(bxgsCode.equals(jsonObject.get("id"))){
				cnName = (String) jsonObject.get("text");
				break;
			}
		}
		if("".equals(cnName)){
			cnName = bxgsCode;
		}
		return cnName;
	}
	
	/**
	 * 取得纳税类型
	 * @param bxgsCode
	 * @return
	 */
	public static String getNslxCnName(String nslxCode){
		String cnName = "";
		if(nslx == null){
			nslx = readJsonFile(getWebRootPath()+"\\zs\\data\\nslx.json");
		}
		for(int  i = 0; i < nslx.size(); i++){
			JSONObject jsonObject = nslx.getJSONObject(i);
			if(nslxCode.equals(jsonObject.get("id"))){
				cnName = (String) jsonObject.get("text");
				break;
			}
		}
		if("".equals(cnName)){
			cnName = nslxCode;
		}
		return cnName;
	}
	
	/**
	 * 取得地市名称
	 * @param bxgsCode
	 * @return
	 */
	public static String getCityCnName(String cityCode){
		String cnName = "";
		if(cityCode!=null && !"".equals(cityCode)){
			if(city == null){
				city = readJsonFile(getWebRootPath()+"\\zs\\data\\city.json");
			}
			for(int  i = 0; i < city.size(); i++){
				JSONObject jsonObject = city.getJSONObject(i);
				if(cityCode.equals(jsonObject.get("id"))){
					cnName = (String) jsonObject.get("text");
					break;
				}
			}
			if("".equals(cnName)){
				cnName = cityCode;
			}
		}else{
			cnName = cityCode;
		}
		return cnName;
	}
	
	public static String getClassPath() {
		String pathStr = new FileTool().getClass().getClassLoader().getResource("")
				.getPath();
		// 对 Windows 下获取 物理路径 做 特殊处理
		if ("\\".equals(File.separator)) {
			pathStr = pathStr.substring(1).replaceAll("/", "\\\\");
		}
		return pathStr;
	}
	
	public static String getWebRootPath(){
		return getClassPath().substring(0, getClassPath().indexOf("WEB-INF"));
	}

}
