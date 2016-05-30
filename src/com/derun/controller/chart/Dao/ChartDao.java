package com.derun.controller.chart.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.derun.common.db.ConnectDBBean;
import com.derun.common.db.DBConnPool;
import com.derun.common.db.ExeSQL;
import com.derun.common.util.StrTool;
import com.derun.controller.busiQuery.util.BusiQueryUtil;
import com.derun.dbpool.NoFreeConnectionException;
import com.derun.dbpool.ReadWriteDBPool;

public class ChartDao {
	
	
	
	public List<BusiQueryUtil> getBusiQuery(String vin) throws SQLException{  
		PreparedStatement pre = null;
		Connection conn = null;
		ResultSet rs = null;
		List<BusiQueryUtil> list = new ArrayList<BusiQueryUtil>();
		try{
			conn = DBConnPool.getConnection();
			String pageSQL = " select * from syjk_ccs_rkmx t where t.VIN=? and rownum<2";
			System.out.println(pageSQL);
			pre = conn.prepareStatement(pageSQL);
			pre.setString(1, vin);
		    rs=pre.executeQuery();
			if(rs.next()){
				BusiQueryUtil busiQueryUtil = new BusiQueryUtil(); 
				busiQueryUtil.setTAXQUERYNO(rs.getString("TAXQUERYNO"));
				busiQueryUtil.setVIN(rs.getString("VIN"));
				busiQueryUtil.setTAXPAYERNAME(rs.getString("TAXPAYERNAME"));
				busiQueryUtil.setTAXLOCATIONCODE(rs.getString("TAXLOCATIONCODE"));
				busiQueryUtil.setEngineNo(rs.getString("EngineNo"));
				busiQueryUtil.setTAXCONDITIONCODE(rs.getString("TAXCONDITIONCODE"));
				busiQueryUtil.setHPHM(rs.getString("HPHM"));
				busiQueryUtil.setHPZL(rs.getString("HPZL"));
				busiQueryUtil.setCLLX(rs.getString("CLLX"));
				
				list.add(busiQueryUtil);
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				if (rs != null) {
					rs.close();
				}
				if (pre != null) {
					pre.close();
				}
				ConnectDBBean.closeConnection(ReadWriteDBPool.readPool, conn);   //  因关闭方式有问题  需要原来的关闭方式进行连接的关闭  mili 2015-3-20 16:34:57
//				if (conn != null) {
//					conn.close();
//				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NoFreeConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

		   return list;
	
  }
	

	/**
	 * 查询
	 * @param pageNumber
	 * @param pageSize
	 * @param startTime
	 * @param endTime
	 * @param citycode
	 * @param countrycode
	 * @param bxgscode
	 * @param sbflag
	 * @param pl
	 * @param hphm
	 * @param czxm
	 * @return
	 */
	public List<BusiQueryUtil> getCondition(int pageNumber, int pageSize,
			String startTime, String endTime, String citycode,
			String countrycode, String bxgscode, String nslx, String pl,
			String hphm, String czxm, boolean iswdc, boolean ishistory,String uid) {
		// TODO Auto-generated method stub
		String paramSQL = getDefaultWhere()+getUserWhere(startTime, endTime, citycode, countrycode, bxgscode, nslx, pl, hphm, czxm, iswdc, ishistory, uid);
		List<BusiQueryUtil> list = new ArrayList<BusiQueryUtil>();
		PreparedStatement pre = null;
		ResultSet rs = null;
		Connection conn = null;
		try {
			conn = DBConnPool.getConnection();
			String pageSQL = " select * from syjk_ccs_rkmx_temp where rowid in ("
					+ " select A.id from ("
					+ " select ROWID id, rownum rn, hphm from syjk_ccs_rkmx_temp where 1=1 "+paramSQL+" and rownum <= "+pageNumber*pageSize
					+ " order by rn desc) A where A.rn > "+(pageNumber-1)*pageSize+")";
			System.out.println(pageSQL);
			pre = conn.prepareStatement(pageSQL);
			
			rs = pre.executeQuery();
			while (rs.next()) {
				BusiQueryUtil busiQueryUtil = new BusiQueryUtil(); 
				busiQueryUtil.setTAXCONFIRMNO(rs.getString("TAXCONFIRMNO"));//截取代收机构
				busiQueryUtil.setHPHM(rs.getString("HPHM"));
				busiQueryUtil.setVIN(rs.getString("VIN"));
				busiQueryUtil.setTAXPAYERNAME(rs.getString("TAXPAYERNAME"));
				busiQueryUtil.setFIRSTREGISTERDATE(rs.getString("FIRSTREGISTERDATE"));
				busiQueryUtil.setTAXCONDITIONCODE(rs.getString("TAXCONDITIONCODE"));
				busiQueryUtil.setSUMTAX(Double.parseDouble(rs.getString("SUMTAX")));
				busiQueryUtil.setSJCJRQ(rs.getString("SJCJRQ"));
				busiQueryUtil.setCITYCODE(rs.getString("CITYCODE"));
				busiQueryUtil.setCOUNTRYCODE(rs.getString("COUNTRYCODE"));
				list.add(busiQueryUtil);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NoFreeConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pre != null) {
					pre.close();
				}
				ConnectDBBean.closeConnection(ReadWriteDBPool.readPool, conn);   //  因关闭方式有问题  需要原来的关闭方式进行连接的关闭  mili 2015-3-20 16:34:57
//				if (conn != null) {
//					conn.close();
//				}
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NoFreeConnectionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return list;
	
	}



	public String busiCount(String startTime, String endTime, String citycode,
			String countrycode, String bxgscode, String nslx, String pl,
			String hphm, String czxm, boolean iswdc, boolean ishistory, String uid) {
		// TODO Auto-generated method stub
		String whereSql = getDefaultWhere()+getUserWhere(startTime, endTime, citycode, countrycode, bxgscode, nslx, pl, hphm, czxm, iswdc, ishistory, uid);
		//String pageSQL = "select concat(concat(concat(concat(count(1),'@'),count(distinct(hphm))),'@'),sum(sumtax)) from syjk_ccs_rkmx_temp where 1=1 "+whereSql;
		String pageSQL = "select count(1)||'@'||count(distinct(vin))||'@'||decode(sum(sumtax),null,0.00,sum(sumtax)) from syjk_ccs_rkmx_temp where 1=1 "+whereSql;
		ExeSQL es = new ExeSQL();
		String countStr = es.getOneValue(pageSQL);
		
		return countStr;
	}
	
	/**
	 * 默认匹配条件
	 * @return
	 */
	private String getDefaultWhere(){
		
		return "";
	}
	
	/**
	 * 用户查询条件
	 * @param startTime	数据采集始期
	 * @param endTime	数据采集止期
	 * @param citycode	地市
	 * @param countrycode	区县
	 * @param bxgscode	保险公司
	 * @param nslx	纳税类型
	 * @param pl	排量
	 * @param hphm	号牌
	 * @param czxm	车主姓名
	 * @param iswdc	是否包含外地车
	 * @param ishistory	是否包含历史数据
	 * @return
	 */
	private String getUserWhere(String startTime, String endTime, String citycode,
			String countrycode, String bxgscode, String nslx, String pl,
			String hphm, String czxm, boolean iswdc, boolean ishistory, String uid){
		 // 增加参数SQL语句
		StringBuilder paramSQL = new StringBuilder();
		//startTime
		if ( StrTool.isNotEmpty(startTime) ) {
			StrTool.paramSQL(paramSQL).append(" SJCJRQ >= "+"to_date('"+ startTime +"','yyyy-mm-dd hh24:mi:ss')");
		}
		//endTime
		if ( StrTool.isNotEmpty(endTime) ) {
			StrTool.paramSQL(paramSQL).append(" SJCJRQ <= "+"to_date('"+ endTime +"','yyyy-mm-dd hh24:mi:ss')");
		}
		//citycode
		if(StrTool.isNotEmpty(citycode)){
			StrTool.paramSQL(paramSQL).append(" CITYCODE = '"+citycode+"' ");
		}
		//countrycode
		if(StrTool.isNotEmpty(countrycode)){
			StrTool.paramSQL(paramSQL).append(" COUNTRYCODE = '"+countrycode+"' ");
		}
//		//bxgscode
		if(StrTool.isNotEmpty(bxgscode)){
			StrTool.paramSQL(paramSQL).append(" SUBSTR(TAXQUERYNO,2,4) = '"+bxgscode+"' ");
		}
//		//nslx
		if(StrTool.isNotEmpty(nslx)){
			StrTool.paramSQL(paramSQL).append(" TAXCONDITIONCODE = '"+nslx+"' ");
		}
//		//pl
		if(StrTool.isNotEmpty(pl)){
			String[] pl2 = pl.split("-");
			if(pl2.length<2 && pl2[0].split("<").length>1){//	<1.0L
				StrTool.paramSQL(paramSQL).append(" DISPLACEMENT<= "+Double.parseDouble(pl2[0].split("<")[1])*1000);
			}else if(pl2.length<2 && pl2[0].split(">").length>1){//	>4.0L
				StrTool.paramSQL(paramSQL).append(" DISPLACEMENT>= "+Double.parseDouble(pl2[0].split(">")[1])*1000);
			}else{
				StrTool.paramSQL(paramSQL).append(" DISPLACEMENT > "+Double.parseDouble(pl2[0])*1000+" and DISPLACEMENT<= "+Double.parseDouble(pl2[1])*1000);
			}
		}
//		//hphm模糊匹配
		if(StrTool.isNotEmpty(hphm)){
			StrTool.paramSQL(paramSQL).append(" HPHM = '"+hphm+"' ");
		}
//		//czxm
		if(StrTool.isNotEmpty(czxm)){
			StrTool.paramSQL(paramSQL).append(" TAXPAYERNAME = '"+czxm+"' ");
		}
//		//iswdc 包含外地车
		if(!iswdc){
			String localCarId = new ExeSQL().getOneValue("SELECT CODEVALUE FROM SYJK_CCS_CODE WHERE UPPER(CODE) = 'LOCALCARNO'");
			StrTool.paramSQL(paramSQL).append(" HPHM LIKE '"+localCarId+"%' ");//去掉外地车，车牌为空也认为是外地车
		}
//		//ishistory 包含历史数据
		if(!ishistory){
			StrTool.paramSQL(paramSQL).append(" TAXCONFIRMNO NOT LIKE '3%' ");//去掉历史数据
		}
//		//地区编码
		if(StrTool.isNotEmpty(uid)){
			if (uid.equals("2000000")||uid.equals("2000001")) {
				
			} else if (uid.length()>6 && uid.substring(5).equals("00")){
				StrTool.paramSQL(paramSQL).append(" CITYCODE = '"+uid.substring(1)+"' ");//code前加2
			} else {
				StrTool.paramSQL(paramSQL).append(" COUNTRYCODE = '"+uid.substring(1)+"' ");
			}
		}
		
		return String.valueOf(paramSQL);
	}
	
}
