package com.derun.common.init;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

import com.derun.common.db.ExeSQL;
import com.derun.common.db.SSRS;
import com.derun.controller.chart.web.ChartServlet;
import com.derun.dbpool.DBConnectionManager;
import com.derun.po.T_CODE;

/**
 * @author	赵文斌
 * @Email	wbzhao7@gmail.com
 * @date	2014-3-4
 *
 * 说明
 * @version
 */
public class CfgLoader implements ServletContextListener {
	
	private static Logger log = Logger.getLogger(com.derun.common.init.CfgLoader.class.getName());
	static SSRS cfg = null;	//系统配置信息
	ExeSQL es = null;
	public static String hzcxData = "";
	public static String mxcxData = "";
	public static String jdcxData = "";
	public static String sdcxData = "";
	public static String smcxData = "";

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		
		DBConnectionManager.getInstance();
		
//		String sql = SqlText.R_00_CODE_001;
		
		try{
			
//			if(null==cfg||cfg.getMaxRow()<1){
//				
//				cfg = new SSRS();
//				
//				ExeSQL es = new ExeSQL();
//				
//				cfg = es.execSQL(sql.toString());
//				
//				log.debug("共加载到"+cfg.getMaxRow()+"条有效配置!");
//				
//			}
			
			//定时任务：每天缓存六个查询接口的初始化数据
			TimerTask task = new TimerTask() {
				public void run() {
					// task to run goes here
					initCxData();
				}
			};
			Calendar calendar = Calendar.getInstance();
			int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH);
	        int day = calendar.get(Calendar.DAY_OF_MONTH);//每天
			calendar.set(year, month, day, 4, 30, 00);
	        Date date = calendar.getTime();
	        Timer timer = new Timer();
			timer.schedule(task, date); 

			log.debug("开始缓存查询数据-------");
			initCxData();
			log.debug("----------------缓存数据完成-------");
			
		}catch (Exception e) {
			log.error(e.getLocalizedMessage());
		}
		
	}
	
	private void initCxData(){
		ChartServlet cs = new ChartServlet();
		Calendar now = Calendar.getInstance();
		String citycode = "";
		String datefrom = String.valueOf(now.get(Calendar.YEAR))+"-01-01";//"2015-11-28";//2015-11-28 张鹏建议2016-01-01
		String dateto = String.valueOf(now.get(Calendar.YEAR))+"-"+String.valueOf(now.get(Calendar.MONTH) + 1)+"-"+String.valueOf(now.get(Calendar.DAY_OF_MONTH)-1);  ;//2016-04-10
		String year = String.valueOf(now.get(Calendar.YEAR));  
		hzcxData = cs.v2hzcx(datefrom, dateto);
		mxcxData = cs.v2mxcx(datefrom, dateto, citycode);
		jdcxData = cs.v2jdcx(citycode, year);
		sdcxData = cs.v2sdcx(datefrom, dateto);
		smcxData = cs.v2smcx(citycode, year);
	}
	
	public static List<T_CODE> getConfig(String codeType){
		
		List<T_CODE> sccList = new ArrayList();

		if(null==cfg||cfg.getMaxRow()<1){
			
			log.debug("获取配置信息失败");
			
		}else{
			
			for(int i = 1;i <= cfg.getMaxRow(); i++){
				
				T_CODE scc =  new T_CODE();
				
				if(cfg.GetText(i, 2).equals(codeType)){
					
					scc.setCODETYPE(cfg.GetText(i, 2));	//代码类型
					scc.setCODE(cfg.GetText(i, 3));		//代码
					scc.setCODENAME(cfg.GetText(i, 4));	//代码名称
					scc.setCODEVALUE(cfg.GetText(i, 5));//代码值
					scc.setCODEALIA(cfg.GetText(i, 6));	//代码别名
					scc.setVALIDATEFLAG(cfg.GetText(i, 7));//有效标识
					scc.setISHOTPARA(cfg.GetText(i, 8));	//是否热配置
					scc.setREMARK(cfg.GetText(i, 9));	//mili
					sccList.add(scc);
				}
				
			}
		}
		
		return sccList;
	}
	
	/**
	 * 获取完整配置信息
	 * @return
	 */
	public static T_CODE getConfig(String codeType,String code){
		
		T_CODE scc = null;
		
		if(null==cfg||cfg.getMaxRow()<1){
			
			log.debug("获取配置信息失败");
			
		}else{
			
			for(int i = 1;i < cfg.getMaxRow(); i++){
				
				scc =  new T_CODE();
				
				if(cfg.GetText(i, 2).equals(codeType)&&cfg.GetText(i, 3).equals(code)){
					
					scc.setCODETYPE(cfg.GetText(i, 2));	//代码类型
					scc.setCODE(cfg.GetText(i, 3));		//代码
					scc.setCODENAME(cfg.GetText(i, 4));	//代码名称
					scc.setCODEVALUE(cfg.GetText(i, 5));//代码值
					scc.setCODEALIA(cfg.GetText(i, 6));	//代码别名
					scc.setVALIDATEFLAG(cfg.GetText(i, 7));//有效标识
					scc.setISHOTPARA(cfg.GetText(i, 8));	//是否热配置
					
					break;
				}
				
			}
		}
		return scc;
	}
	
	/**
	 * 获取配置的值
	 * @return 
	 * @return
	 */
	public static String getConfigValue(String codeType,String code){
		
		return getConfig(codeType,code).getCODEVALUE();
		
	}

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args){
		getConfig("SysCode_DueType");
		System.exit(0);
	}

}
