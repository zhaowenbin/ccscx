package com.derun.controller.chart.web;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.derun.common.db.ExeSQL;
import com.derun.common.db.SSRS;
import com.derun.common.init.CfgLoader;
import com.derun.common.util.StrTool;
import com.derun.controller.busiQuery.dao.BusiQueryDao;
import com.derun.controller.busiQuery.util.ResponseUtil;

public class ChartServlet extends HttpServlet {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ExeSQL exesql = new ExeSQL();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		String uid = request.getParameter("uid");// 用户编号
		String showType = request.getParameter("showType");// 统计类型
		String year = request.getParameter("year");// 年度
		String month = request.getParameter("month");// 月份
		String chartData = "";	//返回图表数据
		//---------------------------v2 arrow down----------------------------------
		String hphm = request.getParameter("hphm");
		String vin = request.getParameter("vin");
		String citycode = request.getParameter("citycode");
		String datefrom = request.getParameter("datefrom");
		String dateto = request.getParameter("dateto");
		
		boolean cacheFlag = false;	//界面初始化使用缓存的数据
		if(request.getParameter("cacheFlag")!=null){
			try {
				cacheFlag = new Boolean(request.getParameter("cacheFlag"));
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		if (showType!=null && showType.toUpperCase().equals("NDDS")) {
			chartData = getNddsData(uid,year);
		}else if(showType!=null && showType.toUpperCase().equals("DQ")){
			chartData = getDqData(uid,month);
		}else if(showType!=null && showType.toUpperCase().equals("PL")){
			chartData = getPlData(uid,month);
		}else if(showType!=null && showType.toUpperCase().equals("NSLX")){
			chartData = getNslxData(uid,month);
		}else if(showType!=null && showType.toUpperCase().equals("BXGS")){
			chartData = getBxgsData(uid,month);
		}
		//---------------------------------v2------------------------------------
		else if(showType!=null && showType.toUpperCase().equals("V2BDCX")){//保单查询
			chartData = v2bdcx(hphm,vin);
		}else if(showType!=null && showType.toUpperCase().equals("V2JDCX")){//进度查询
			if(cacheFlag){
				chartData = CfgLoader.jdcxData;
			}else{
				chartData = v2jdcx(citycode,year);
			}
		}else if(showType!=null && showType.toUpperCase().equals("V2HZCX")){//汇总查询
			if(cacheFlag){
				chartData = CfgLoader.hzcxData;
			}else{
				chartData = v2hzcx(datefrom, dateto);
			}
		}else if(showType!=null && showType.toUpperCase().equals("V2MXCX")){//明细查询
			if(cacheFlag){
				chartData = CfgLoader.mxcxData;
			}else{
				chartData = v2mxcx(datefrom, dateto, citycode);
			}
		}else if(showType!=null && showType.toUpperCase().equals("V2SMCX")){//税目查询
			if(cacheFlag){
				chartData = CfgLoader.smcxData;
			}else{
				chartData = v2smcx(citycode,year);
			}
		}else if(showType!=null && showType.toUpperCase().equals("V2SDCX")){//属地查询
			if(cacheFlag){
				chartData = CfgLoader.sdcxData;
			}else{
				chartData = v2sdcx(datefrom, dateto);
			}
		}
		//---------------------------------v2------------------------------------
		else{
			System.out.println("不支持的统计类型");
		}

		try {

			ResponseUtil.write(response, chartData);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String v2sdcx(String datefrom, String dateto){
		String[] sumtax = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00"};
		String[] bds = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00"};
		StringBuffer sb = new StringBuffer("select "
				+ " SUM( CASE WHEN citycode = '610100' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610100' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 xa, "
				+ " SUM( CASE WHEN citycode = '610200' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610200' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 tc,  "
				+ " SUM( CASE WHEN citycode = '610300' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610300' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 bj,  "
				+ " SUM( CASE WHEN citycode = '610400' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610400' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 xy,  "
				+ " SUM( CASE WHEN citycode = '610500' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610500' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 wn,  "
				+ " SUM( CASE WHEN citycode = '610600' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610600' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 ya,  "
				+ " SUM( CASE WHEN citycode = '610700' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610700' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 hz,  "
				+ " SUM( CASE WHEN citycode = '610800' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610800' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 yl,  "
				+ " SUM( CASE WHEN citycode = '610900' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '610900' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 ak,  "
				+ " SUM( CASE WHEN citycode = '611000' THEN sumtax ELSE 0 END)/ 1000000||'@'||count(CASE WHEN citycode = '611000' and sumtax>0 THEN taxconfirmno ELSE null END)/10000 sl "
				+ "from syjk_ccs_rkmx_temp where 1=1"
				+ " and loggedout='0' and TAXCONFIRMNO NOT LIKE '3%' and changetype = '0' "//and TAXCONDITIONCODE NOT IN ('E','P') 
				+ " and SJCJRQ >= "+"to_date('"+ datefrom +"','yyyy-mm-dd')"
				+ " and SJCJRQ <= "+"to_date('"+ dateto +"','yyyy-mm-dd')  ");
		SSRS ssrs = new ExeSQL().execSQL(sb.toString());
		double hjSumtax = 0,hjBds = 0;
		if(ssrs.MaxRow>0){
			for(int c=0;c<=ssrs.MaxCol-1;c++){
				String sumtax2 = ssrs.GetText(1, c+1).split("@")[0];
				String bds2 = ssrs.GetText(1, c+1).split("@")[1];
				hjSumtax += Double.parseDouble(sumtax2);
				hjBds += Double.parseDouble(bds2);
				sumtax[c] = String.valueOf(df2(Double.parseDouble(sumtax2)));
				bds[c] = String.valueOf(df2(Double.parseDouble(bds2)));
			}
			hjSumtax = df2(hjSumtax);
			hjBds = df2(hjBds);
			sumtax[10] = String.valueOf(hjSumtax);
			bds[10] = String.valueOf(hjBds);
		}
		return Arrays.toString(sumtax)+"@"+Arrays.toString(bds);
	}
	
	public String v2smcx(String citycode, String year){
		//15、16年的两个sql查出来后，合计
		String[] sumtaxLast = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00",null};
		String[] sumtax = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00",null};
		String[] sumtaxLast2 = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00"};
		String[] sumtax2 = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00"};
		String[] sumcar = {"0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00","0.00"};
		String[] increase = {null,null,null,null,null,null,null,null,null,null,null,null,null,null};
		
		StringBuffer sb = new StringBuffer("select "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 <=1.0 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 <= 1.0 THEN vin else null end)) c10, "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >1.0 and displacement/1000 <=1.6 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 1.0 and displacement / 1000 <= 1.6 then vin else null end)) c16,  "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >1.6 and displacement/1000 <=2.0 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 1.6 and displacement / 1000 <= 2.0 then vin else null end)) c20,  "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >2.0 and displacement/1000 <=2.5 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 2.0 and displacement / 1000 <= 2.5 then vin else null end)) c25,  "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >2.5 and displacement/1000 <=3.0 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 2.5 and displacement / 1000 <= 3.0 then vin else null end)) c30,  "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >3.0 and displacement/1000 <=4.0 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 3.0 and displacement / 1000 <= 4.0 then vin else null end)) c40,  "
				+ " SUM( CASE WHEN cllx in ('11','12') and displacement/1000 >4.0 THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('11','12') and displacement / 1000 > 4.0 then vin else null end)) c40u,  "
				+ " SUM( CASE WHEN cllx in ('14','15') THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('14','15') THEN vin else null end)) dk,  "
				+ " SUM( CASE WHEN cllx='13' THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx='13' THEN vin else null end)) zk,  "
				+ " SUM( CASE WHEN cllx in ('21','22','23','24') THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('21','22','23','24') THEN vin else null end)) hc,  "	//货车
				+ " SUM( CASE WHEN cllx in ('25','26','27','28') THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('25','26','27','28') THEN vin else null end)) gc,  "	//挂车
				+ " SUM( CASE WHEN cllx in ('30','32','40') THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('30','32','40') THEN vin else null end)) zxzyc,  "	//专项作业车
				+ " SUM( CASE WHEN cllx = '33' THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when  cllx = '33' THEN vin else null end)) lszyjxc, "	//轮式专项机械车
				+ " SUM( CASE WHEN cllx in ('36','37','38') THEN sumtax ELSE 0 END)/10000||'@'||count(distinct(case when cllx in ('36','37','38') THEN vin else null end)) mtc,  "//摩托车
				+ " to_char(sjcjrq,'yyyy') "	
				+ "from syjk_ccs_rkmx_temp where 1=1"
				+ " and loggedout='0' and TAXCONFIRMNO NOT LIKE '3%' and changetype = '0' and displacement>0 "//and TAXCONDITIONCODE NOT IN ('E','P') 
				+ " and to_char(sjcjrq,'yyyy') in ('"+String.valueOf(Integer.parseInt(year)-1)+"','"+year+"') ");
		if(citycode!=null && !"".equals(citycode)){
			sb.append(" and CITYCODE = '"+citycode+"' ");
		}
		sb.append("group by to_char(sjcjrq,'yyyy') ");
		SSRS ssrs = exesql.execSQL(sb.toString());
		if(ssrs.MaxRow>0 && ssrs.MaxRow<2){
			if(ssrs.GetText(1, 15).equals(year)){
				//拆出车辆统计数
				for(int i=1; i<15; i++){
					if(ssrs.GetText(1, i)!=null){
						sumcar[i-1] = ssrs.GetText(1, i).split("@")[1];
					}
				}
//				sumtax = ssrs.getRowData(1);
				for(int i=1; i<15; i++){
					if(ssrs.GetText(1, i)!=null){
						sumtax[i-1] = ssrs.GetText(1, i).split("@")[0];
						if(sumtax[i-1].startsWith(".")){
							sumtax[i-1] = "0"+sumtax[i-1];
						}
					}
				}
			}else{
//				sumtaxLast = ssrs.getRowData(1);
				for(int i=1; i<15; i++){
					if(ssrs.GetText(1, i)!=null){
						sumtaxLast[i-1] = ssrs.GetText(1, i).split("@")[0];
						if(sumtaxLast[i-1].startsWith(".")){
							sumtaxLast[i-1] = "0"+sumtaxLast[i-1];
						}
						
					}
				}
			}
		}else if(ssrs.MaxRow>1){
			//拆出车辆统计数
			if(ssrs.GetText(1, 15)!=null && ssrs.GetText(2, 15)!=null){
				if(Integer.parseInt(ssrs.GetText(1, 15))>Integer.parseInt(ssrs.GetText(2, 15))){
					for(int i=1; i<15; i++){
						if(ssrs.GetText(1, i)!=null){
							sumcar[i-1] = ssrs.GetText(1, i).split("@")[1];
						}
					}
				}else{
					for(int i=1; i<15; i++){
						if(ssrs.GetText(2, i)!=null){
							sumcar[i-1] = ssrs.GetText(2, i).split("@")[1];
						}
					}
				}
			}
			if(ssrs.GetText(1, 15).equals(year)){
//				sumtax = ssrs.getRowData(1);
//				sumtaxLast = ssrs.getRowData(2);
				for(int i=1; i<15; i++){
					if(ssrs.GetText(2, i)!=null){
						sumtax[i-1] = ssrs.GetText(1, i).split("@")[0];
						sumtaxLast[i-1] = ssrs.GetText(2, i).split("@")[0];
						if(sumtax[i-1].startsWith(".")){
							sumtax[i-1] = "0"+sumtax[i-1];
						}
						if(sumtaxLast[i-1].startsWith(".")){
							sumtaxLast[i-1] = "0"+sumtaxLast[i-1];
						}
					}
				}
			}else{
//				sumtaxLast = ssrs.getRowData(1);
//				sumtax = ssrs.getRowData(2);
				for(int i=1; i<15; i++){
					if(ssrs.GetText(2, i)!=null){
						sumtax[i-1] = ssrs.GetText(2, i).split("@")[0];
						sumtaxLast[i-1] = ssrs.GetText(1, i).split("@")[0];
						if(sumtax[i-1].startsWith(".")){
							sumtax[i-1] = "0"+sumtax[i-1];
						}
						if(sumtaxLast[i-1].startsWith(".")){
							sumtaxLast[i-1] = "0"+sumtaxLast[i-1];
						}
					}
				}
			}
			//同比增长率=（本期数－同期数）÷同期数×100%
			for(int r=0;r<=ssrs.MaxRow-1;r++){
				if(Double.parseDouble(sumtaxLast[r])==0){
					increase[r] = null;
				}else{
					increase[r] = String.valueOf(new BigDecimal((Double.parseDouble(sumtax[r])-Double.parseDouble(sumtaxLast[r]))/Double.parseDouble(sumtaxLast[r])).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
				}
			}
		}
		for(int c=0;c<=ssrs.MaxCol-2;c++){
			sumtaxLast2[c] = sumtaxLast[c]; 
			sumtax2[c] = sumtax[c]; 
		}
		sumtaxLast[14]=null;
		sumtax[14]=null;
		
		return Arrays.toString(sumtaxLast2)+"@"+Arrays.toString(sumtax2)+"@"+Arrays.toString(increase)+"@"+Arrays.toString(sumcar);
		
	}
	
	public String v2hzcx(String datefrom, String dateto){
		StringBuffer data = new StringBuffer("[");
		StringBuffer sb = new StringBuffer("select paycompanycode bxgs, sum(sumtax) sumtax, count(taxconfirmno) bds,"
				+ " SUM( CASE WHEN citycode = '610100' THEN sumtax ELSE 0 END) xa, "
				+ " SUM( CASE WHEN citycode = '610200' THEN sumtax ELSE 0 END) tc,  "
				+ " SUM( CASE WHEN citycode = '610300' THEN sumtax ELSE 0 END) bj,  "
				+ " SUM( CASE WHEN citycode = '610400' THEN sumtax ELSE 0 END) xy,  "
				+ " SUM( CASE WHEN citycode = '610500' THEN sumtax ELSE 0 END) wn,  "
				+ " SUM( CASE WHEN citycode = '610600' THEN sumtax ELSE 0 END) ya,  "
				+ " SUM( CASE WHEN citycode = '610700' THEN sumtax ELSE 0 END) hz,  "
				+ " SUM( CASE WHEN citycode = '610800' THEN sumtax ELSE 0 END) yl,  "
				+ " SUM( CASE WHEN citycode = '610900' THEN sumtax ELSE 0 END) ak,  "
				+ " SUM( CASE WHEN citycode = '611000' THEN sumtax ELSE 0 END) sl "
				+ "from syjk_ccs_rkmx_temp where 1=1"
				+ " and loggedout='0' and TAXCONFIRMNO NOT LIKE '3%' and changetype = '0' "//and TAXCONDITIONCODE NOT IN ('E','P') 
				+ " and SJCJRQ >= "+"to_date('"+ datefrom +"','yyyy-mm-dd')"
				+ " and SJCJRQ <= "+"to_date('"+ dateto +"','yyyy-mm-dd') group by paycompanycode ");
		SSRS ssrs = new ExeSQL().execSQL(sb.toString());
		
		double sumCol2 = 0,sumCol3 = 0,sumCol4 = 0,sumCol5 = 0,sumCol6 = 0,sumCol7 = 0,sumCol8 = 0,sumCol9 = 0,sumCol10 = 0,sumCol11 = 0,sumCol12 = 0,sumCol13 = 0;
		if(ssrs.MaxRow>0){
			for(int r=1;r<=ssrs.MaxRow;r++){
				String bxgsname = this.getBxgsName(ssrs.GetText(r, 1));
				if(!"".equals(bxgsname)){
					data.append("{");
					data.append("\"bxgsmc\":\""+bxgsname+"\",");
					data.append("\"sk\":\""+df2(Double.parseDouble(ssrs.GetText(r, 2))/10000.00)+"\",");
					data.append("\"bds\":\""+df2(Double.parseDouble(ssrs.GetText(r, 3))/10000.00)+"\",");
					data.append("\"xa\":\""+df2(Double.parseDouble(ssrs.GetText(r, 4))/10000.00)+"\",");
					data.append("\"tc\":\""+df2(Double.parseDouble(ssrs.GetText(r, 5))/10000.00)+"\",");
					data.append("\"bj\":\""+df2(Double.parseDouble(ssrs.GetText(r, 6))/10000.00)+"\",");
					data.append("\"xy\":\""+df2(Double.parseDouble(ssrs.GetText(r, 7))/10000.00)+"\",");
					data.append("\"wn\":\""+df2(Double.parseDouble(ssrs.GetText(r, 8))/10000.00)+"\",");
					data.append("\"ya\":\""+df2(Double.parseDouble(ssrs.GetText(r, 9))/10000.00)+"\",");
					data.append("\"hz\":\""+df2(Double.parseDouble(ssrs.GetText(r, 10))/10000.00)+"\",");
					data.append("\"yl\":\""+df2(Double.parseDouble(ssrs.GetText(r, 11))/10000.00)+"\",");
					data.append("\"ak\":\""+df2(Double.parseDouble(ssrs.GetText(r, 12))/10000.00)+"\",");
					data.append("\"sl\":\""+df2(Double.parseDouble(ssrs.GetText(r, 13))/10000.00)+"\",");
					data = new StringBuffer(data.substring(0, data.length()-1));
					data.append("},");
					sumCol2+=df2(Double.parseDouble(ssrs.GetText(r, 2))/10000.00);
					sumCol3+=df2(Double.parseDouble(ssrs.GetText(r, 3))/10000.00);
					sumCol4+=df2(Double.parseDouble(ssrs.GetText(r, 4))/10000.00);
					sumCol5+=df2(Double.parseDouble(ssrs.GetText(r, 5))/10000.00);
					sumCol6+=df2(Double.parseDouble(ssrs.GetText(r, 6))/10000.00);
					sumCol7+=df2(Double.parseDouble(ssrs.GetText(r, 7))/10000.00);
					sumCol8+=df2(Double.parseDouble(ssrs.GetText(r, 8))/10000.00);
					sumCol9+=df2(Double.parseDouble(ssrs.GetText(r, 9))/10000.00);
					sumCol10+=df2(Double.parseDouble(ssrs.GetText(r, 10))/10000.00);
					sumCol11+=df2(Double.parseDouble(ssrs.GetText(r, 11))/10000.00);
					sumCol12+=df2(Double.parseDouble(ssrs.GetText(r, 12))/10000.00);
					sumCol13+=df2(Double.parseDouble(ssrs.GetText(r, 13))/10000.00);
				}
			}
			data.append("{\"bxgsmc\":\"合计\",");
			data.append("\"sk\":\""+df2(sumCol2)+"\",");
			data.append("\"bds\":\""+df2(sumCol3)+"\",");
			data.append("\"xa\":\""+df2(sumCol4)+"\",");
			data.append("\"tc\":\""+df2(sumCol5)+"\",");
			data.append("\"bj\":\""+df2(sumCol6)+"\",");
			data.append("\"xy\":\""+df2(sumCol7)+"\",");
			data.append("\"wn\":\""+df2(sumCol8)+"\",");
			data.append("\"ya\":\""+df2(sumCol9)+"\",");
			data.append("\"hz\":\""+df2(sumCol10)+"\",");
			data.append("\"yl\":\""+df2(sumCol11)+"\",");
			data.append("\"ak\":\""+df2(sumCol12)+"\",");
			data.append("\"sl\":\""+df2(sumCol13)+"\"");
			data.append("}");
			//data = new StringBuffer(data.substring(0, data.length()-1));
		}
		data.append("]");
		return data.toString();
	}
	
	public String v2mxcx(String datefrom, String dateto, String citycode){
		StringBuffer data = new StringBuffer("[");
		StringBuffer sql = new StringBuffer("select paycompanycode bxgs, "
				+ "round(sum(sumtax)/10000,2) sk, "
				+ "round(count(taxconfirmno)/10000,2) bds, "
				+ "round(SUM(CASE WHEN taxconditioncode = 'C' THEN annualtaxamount-sumtax  ELSE 0  END)/10000,2) jsje, "
				+ "round(count(CASE WHEN taxconditioncode = 'C' THEN taxconfirmno  ELSE null END)/10000,2) jsbd, "
				+ "round(SUM(CASE WHEN taxconditioncode = 'C' THEN annualtaxamount-sumtax ELSE 0 END)/sum(sumtax),2) jszb, "
				+ "round(SUM(CASE WHEN taxconditioncode = 'E' THEN annualtaxamount-sumtax ELSE 0 END)/10000,2) msje, "
				+ "round(count(CASE WHEN taxconditioncode = 'E' THEN taxconfirmno  ELSE null END)/10000,2) msbd, "
				+ "round(SUM(CASE WHEN taxconditioncode = 'E' THEN annualtaxamount-sumtax ELSE 0 END)/sum(sumtax),2) mszb, "
				
				+ "count(case when taxconditioncode in ('C','E') and deductiondocumentnumber not in ('261000','261111','261222','261333','261444','261555','261666','261777','261888','261999') then vin else null end) pzjm, "
				+ "count(case when taxconditioncode ='P' and taxdocumentnumber is not null then vin else null end) pzws "
				
				+ "from syjk_ccs_rkmx_temp where 1 = 1 and loggedout = '0' and TAXCONFIRMNO NOT LIKE '3%' and changetype = '0' "
				+ "and SJCJRQ >= "+"to_date('"+ datefrom +"','yyyy-mm-dd') "
				+ "and SJCJRQ <= "+"to_date('"+ dateto +"','yyyy-mm-dd') ");
		if(citycode!=null && !"".equals(citycode)){
			sql.append(" and CITYCODE = '"+citycode+"' ");
		}
		sql.append(" group by paycompanycode ");
		
		SSRS ssrs = new ExeSQL().execSQL(sql.toString());
		double sumCol2 = 0,sumCol3 = 0,sumCol4 = 0,sumCol5 = 0,sumCol6 = 0,sumCol7 = 0,sumCol8 = 0,sumCol9 = 0,sumCol10 = 0,sumCol11 = 0;
		if(ssrs.MaxRow>0){
			for(int r=1;r<=ssrs.MaxRow;r++){
				String bxgsname = this.getBxgsName(ssrs.GetText(r, 1));
				if(!"".equals(bxgsname)){
					data.append("{");
					data.append("\"bxgs\":\""+bxgsname+"\",");
					data.append("\"sk\":\""+ssrs.GetText(r, 2)+"\",");
					data.append("\"bds\":\""+ssrs.GetText(r, 3)+"\",");
					data.append("\"jsje\":\""+ssrs.GetText(r, 4)+"\",");
					data.append("\"jsbd\":\""+ssrs.GetText(r, 5)+"\",");
					data.append("\"jszb\":\""+ssrs.GetText(r, 6)+"\",");
					data.append("\"msje\":\""+ssrs.GetText(r, 7)+"\",");
					data.append("\"msbd\":\""+ssrs.GetText(r, 8)+"\",");
					data.append("\"mszb\":\""+ssrs.GetText(r, 9)+"\",");
					data.append("\"pzjm\":\""+ssrs.GetText(r, 10)+"\",");
					data.append("\"pzws\":\""+ssrs.GetText(r, 11)+"\",");
					data = new StringBuffer(data.substring(0, data.length()-1));
					data.append("},");
					sumCol2+=df2(Double.parseDouble(ssrs.GetText(r, 2)));
					sumCol3+=df2(Double.parseDouble(ssrs.GetText(r, 3)));
					sumCol4+=df2(Double.parseDouble(ssrs.GetText(r, 4)));
					sumCol5+=df2(Double.parseDouble(ssrs.GetText(r, 5)));
					sumCol6+=df2(Double.parseDouble(ssrs.GetText(r, 6)));
					sumCol7+=df2(Double.parseDouble(ssrs.GetText(r, 7)));
					sumCol8+=df2(Double.parseDouble(ssrs.GetText(r, 8)));
					sumCol9+=df2(Double.parseDouble(ssrs.GetText(r, 9)));
					sumCol10+=df2(Double.parseDouble(ssrs.GetText(r, 10)));
					sumCol11+=df2(Double.parseDouble(ssrs.GetText(r, 11)));
				}
			}
			data.append("{\"bxgs\":\"合计\",");
			data.append("\"sk\":\""+df2(sumCol2)+"\",");
			data.append("\"bds\":\""+df2(sumCol3)+"\",");
			data.append("\"jsje\":\""+df2(sumCol4)+"\",");
			data.append("\"jsbd\":\""+df2(sumCol5)+"\",");
			data.append("\"jszb\":\""+df2(sumCol6)+"\",");
			data.append("\"msje\":\""+df2(sumCol7)+"\",");
			data.append("\"msbd\":\""+df2(sumCol8)+"\",");
			data.append("\"mszb\":\""+df2(sumCol9)+"\",");
			data.append("\"pzjm\":\""+df2(sumCol10)+"\",");
			data.append("\"pzws\":\""+df2(sumCol11)+"\"");
			data.append("}");
			//data = new StringBuffer(data.substring(0, data.length()-1));
		}
		data.append("]");
		
		return data.toString();
	}
	
	public String v2bdcx(String hphm, String vin){
		//StringBuffer sb = new StringBuffer("{\"rkmx\":");
		StringBuffer sb = new StringBuffer("");
		String whereStr = "";
		if(hphm!=null&&!"".equals(hphm)){
			whereStr += " and hphm='"+hphm+"' ";
		}
		if(vin!=null&&!"".equals(vin)){
			whereStr += " and vin='"+vin+"' ";
		}
		SSRS ssrs = new ExeSQL().execSQL("select * from syjk_ccs_rkmx_temp where 1=1 "+whereStr);
		if(ssrs.MaxRow>0){
			String[] rkmxstr = ssrs.getRowData(1);
			for(int i=0;i<rkmxstr.length;i++){
				
				if(i==7 && rkmxstr[i]!=null){
					if("T".equals(rkmxstr[i].toUpperCase())){//纳税类型
						rkmxstr[i] = "正常纳税";
					}else if("P".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "已完税";
					}else if("C".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "减税";
					}else if("E".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "免税";
					}else if("R".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "拒缴";
					}
				}else if(i==35 && rkmxstr[i]!=null && rkmxstr[i].length()==4){//保险公司35
					rkmxstr[i] = getBxgsName(rkmxstr[i]);
				}else if(i==43 && rkmxstr[i]!=null){//代收状态(平台状态)43
					if("0".equals(rkmxstr[i])){
						rkmxstr[i] = "代收";
					}else if("1".equals(rkmxstr[i])){
						rkmxstr[i] = "已申报";
					}else if("4".equals(rkmxstr[i])){
						rkmxstr[i] = "拒缴";
					}
				}else if(i==22 && rkmxstr[i]!=null){//减免原因22
					if("C".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "具备减免税证明";
					}else if("F".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "拖拉机";
					}else if("A".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "军队、武警专用车";
					}else if("P".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "警车";
					}else if("D".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "外国使领馆、国际组织及其人员";
					}else if("E".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "能源减免";
					}else if("O".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "其他";
					}
				}else if(i==23 && rkmxstr[i]!=null){//减免方案23
					if("E".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "免税";
					}else if("P".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "比例减免";
					}else if("A".equals(rkmxstr[i].toUpperCase())){
						rkmxstr[i] = "金额减免";
					}
				}else if((i==72||i==73) && rkmxstr[i]!=null){//地市区县
					if(!"999999".equals(rkmxstr[i])){
						rkmxstr[i] = CfgLoader.areaMap.get(rkmxstr[i]);
					}
				}
				sb.append(rkmxstr[i]+"@#");
			}
			return sb.substring(0, sb.length()-2);
		}else{
			return "";
		}
		
	}
	
	public String v2jdcx(String citycode, String year){
		//15、16年的两个sql查出来后，合计
		String[] sumtax = new String[13];
		String[] sumtaxLast = new String[13];
		String[] increase = new String[13];
		double sumlast12=0.00;//上期合计
		double sum12=0.00;//本期合计
		if(citycode!=null&&!"".equals(citycode)){
			citycode = "2"+citycode;
		}
		
		String startTime = year+"-01-01 00:00:00";
		String endTime = String.valueOf(Integer.parseInt(year)+1)+"-01-01 23:59:59";
		String sql = "select sum(sumtax)/1000000, to_char(sjcjrq,'MM') from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
						null, null, null, null, null, true, false, citycode)
				+ " group by to_char(sjcjrq,'MM') order by to_char(sjcjrq,'MM')";
		SSRS ssrs = exesql.execSQL(sql);
		
		String startTimeLast = String.valueOf(Integer.parseInt(year)-1)+"-01-01 00:00:00";
		String endTimeLast = year+"-01-01 23:59:59";
		String sqlLast = "select sum(sumtax)/1000000,to_char(sjcjrq,'MM') from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTimeLast, endTimeLast, null, null,
						null, null, null, null, null, true, false, citycode)
				+ " group by to_char(sjcjrq,'MM') order by to_char(sjcjrq,'MM')";
		SSRS ssrsLast = exesql.execSQL(sqlLast);
		
		for(int m=1;m<=12;m++){
			if(ssrsLast.GetText(m, 2)!=null && !"".equals(ssrsLast.GetText(m, 2))){
				int month = Integer.parseInt(ssrsLast.GetText(m, 2));
				sumtaxLast[month-1] = ssrsLast.GetText(m, 1);
//				sumtax[month-1] = ssrs.GetText(m, 1);
				if(month!=m){
					sumtaxLast[m-1] = "0.00";
//					sumtax[m-1] = "0.00";
				}
			}else{
//				if(sumtax[m-1]==null){
//					sumtax[m-1] = "0.00";
//				}
				if(sumtaxLast[m-1]==null){
					sumtaxLast[m-1] = "0.00";
				}
			}
			if(ssrs.GetText(m, 2)!=null && !"".equals(ssrs.GetText(m, 2))){
				int month = Integer.parseInt(ssrs.GetText(m, 2));
//				sumtaxLast[month-1] = ssrsLast.GetText(m, 1);
				sumtax[month-1] = ssrs.GetText(m, 1);
				if(month!=m){
//					sumtaxLast[m-1] = "0.00";
					sumtax[m-1] = "0.00";
				}
			}else{
				if(sumtax[m-1]==null){
					sumtax[m-1] = "0.00";
				}
//				if(sumtaxLast[m-1]==null){
//					sumtaxLast[m-1] = "0.00";
//				}
			}
			sumlast12+=Double.parseDouble(sumtaxLast[m-1]);
			sum12+=Double.parseDouble(sumtax[m-1]);
			if(Double.parseDouble(sumtaxLast[m-1])==0 || Double.parseDouble(sumtax[m-1])==0){//分母为0 = NaN
				increase[m-1] = null;
			}else{
				increase[m-1] = String.valueOf(new BigDecimal((Double.parseDouble(sumtax[m-1])-Double.parseDouble(sumtaxLast[m-1]))/Double.parseDouble(sumtaxLast[m-1])).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
			}
		}
		sumtaxLast[12] = String.valueOf(sumlast12);
		sumtax[12] = String.valueOf(sum12);
		//同比增长率=（本期数－同期数）÷同期数×100%
		if(Double.parseDouble(sumtaxLast[12])==0 || Double.parseDouble(sumtax[12])==0){
			increase[12] = null;
		}else{
			increase[12] = String.valueOf(new BigDecimal((Double.parseDouble(sumtax[12])-Double.parseDouble(sumtaxLast[12]))/Double.parseDouble(sumtaxLast[12])).setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
		}
		
		return Arrays.toString(sumtaxLast)+"@"+Arrays.toString(sumtax)+"@"+Arrays.toString(increase);
		
	}
	
	private String getNddsData(String uid, String year){
		
		String[] sumtax2 = new String[12];
		String[] sumcar2 = new String[12];
		
		String startTime = year+"-01-01 00:00:00";
		String endTime = String.valueOf(Integer.parseInt(year)+1)+"-01-01 23:59:59";
		String sql = "select sum(sumtax)/1000000,count(1)/10000,to_char(sjcjrq,'MM') from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
						null, null, null, null, null, true, false, uid)
				+ " group by to_char(sjcjrq,'MM') order by to_char(sjcjrq,'MM')";
		SSRS ssrs = exesql.execSQL(sql);
		for(int m=1;m<=12;m++){
			if(ssrs.GetText(m, 3)!=null && !"".equals(ssrs.GetText(m, 3))){
				int month = Integer.parseInt(ssrs.GetText(m, 3));
				sumtax2[month-1] = ssrs.GetText(m, 1);
				sumcar2[month-1] = ssrs.GetText(m, 2);
				if(month!=m){
					sumtax2[m-1] = "0.00";
					sumcar2[m-1] = "0";
				}
			}else if(sumtax2[m-1]==null){
				sumtax2[m-1] = "0.00";
				sumcar2[m-1] = "0";
			}
		}
		
		return Arrays.toString(sumtax2)+"@"+Arrays.toString(sumcar2);
		
	}
	
	private String getDqData(String uid, String month){
		
		String startTime = month.substring(0, 4)+"-"+month.substring(4)+"-01 00:00:00";
		String nextYear="";
		String nextMonthStr = "";
		if(month.substring(4).equals("12")){
			nextYear = String.valueOf(Integer.parseInt(month.substring(0, 4))+1);
			nextMonthStr = "01";
		}else{
			nextYear = month.substring(0, 4);
			int nextMonth = Integer.parseInt(month.substring(4))+1;
			if(nextMonth<10){
				nextMonthStr = "0"+String.valueOf(nextMonth);
			}else{
				nextMonthStr = String.valueOf(nextMonth);
			}
		}
		String endTime = nextYear+"-"+nextMonthStr+"-01 00:00:00";
		
		String sql = "";
		if(uid.equals("2000000")){
			//省局（各地市）
			sql = "select sum(a.sumtax)/10000,count(a.rowid)/1000,a.citycode,b.name from syjk_ccs_rkmx_temp a,ccsuser b where 1=1 "
					+ "and a.citycode = substr(b.id,2) "
					+ BusiQueryDao.getDefaultWhere()
					+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
							null, null, null, null, null, true, false, uid)
							+ " group by a.citycode,b.name order by a.citycode ";
		}else if(uid.equals("2000001")){
			//大企业局（西安城六区）
			sql = "select sum(a.sumtax)/10000,count(a.rowid)/1000,a.countrycode,b.name from syjk_ccs_rkmx_temp a,ccsuser b where 1=1 "
					+ "and a.countrycode = substr(b.id,2) "
					//+ "and a.countrycode in ('610102','610103','610104','610111','610112','610113') "//已有条件
					+ BusiQueryDao.getDefaultWhere()
					+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
							null, null, null, null, null, true, false, uid)
							+ " group by a.countrycode,b.name order by a.countrycode ";
		}else{
			//地市（各区县）
			sql = "select sum(a.sumtax)/10000,count(a.rowid)/1000,a.countrycode,b.name from syjk_ccs_rkmx_temp a,ccsuser b where 1=1 "
					+ "and a.countrycode = substr(b.id,2) "
					+ "and a.citycode = '"+uid.substring(1)+"' "
					+ BusiQueryDao.getDefaultWhere()
					+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
							null, null, null, null, null, true, false, uid)
							+ " group by a.countrycode,b.name order by a.countrycode ";
		}
		
		SSRS ssrs = exesql.execSQL(sql);
		String[] sumtax = new String[ssrs.MaxRow];
		String[] sumcar = new String[ssrs.MaxRow];
		String[] dqname = new String[ssrs.MaxRow];
		for(int b=1;b<=ssrs.MaxRow;b++){
			sumtax[b-1] = ssrs.GetText(b, 1);
			sumcar[b-1] = ssrs.GetText(b, 2);
			dqname[b-1] = "'"+ssrs.GetText(b, 4)+"'";
		}
		
		return Arrays.toString(sumtax)+"@"+Arrays.toString(sumcar)+"@"+Arrays.toString(dqname);
		
	}
	
	private String getPlData(String uid, String month){
		
		String[] sumtax2 = new String[7];
		
		String startTime = month.substring(0, 4)+"-"+month.substring(4)+"-01 00:00:00";
		String nextYear="";
		String nextMonthStr = "";
		if(month.substring(4).equals("12")){
			nextYear = String.valueOf(Integer.parseInt(month.substring(0, 4))+1);
			nextMonthStr = "01";
		}else{
			nextYear = month.substring(0, 4);
			int nextMonth = Integer.parseInt(month.substring(4))+1;
			if(nextMonth<10){
				nextMonthStr = "0"+String.valueOf(nextMonth);
			}else{
				nextMonthStr = String.valueOf(nextMonth);
			}
		}
		String endTime = nextYear+"-"+nextMonthStr+"-01 00:00:00";
		String sql = "select"
				+ " count(case when displacement/1000>=0 and displacement/1000 <=1.0 then rowid end),"
				+ " count(case when displacement/1000>1.0 and displacement/1000 <=1.6 then rowid end),"
				+ " count(case when displacement/1000>1.6 and displacement/1000 <=2.0 then rowid end),"
				+ " count(case when displacement/1000>2.0 and displacement/1000 <=2.5 then rowid end),"
				+ " count(case when displacement/1000>2.5 and displacement/1000 <=3.0 then rowid end),"
				+ " count(case when displacement/1000>3.0 and displacement/1000 <=4.0 then rowid end),"
				+ " count(case when displacement/1000>4.0  then rowid end)"
				+ " from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
						null, "A", null, null, null, true, false, uid)
				+ " ";
		SSRS ssrs = exesql.execSQL(sql);
		if(ssrs.GetText(1, 1)!=null && !"".equals(ssrs.GetText(1, 1))){
			sumtax2[0]="['1.0L以下',   "+ssrs.GetText(1, 1)+"]";
		}else{
			sumtax2[0]="['1.0L以下',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 2)!=null && !"".equals(ssrs.GetText(1, 2))){
			sumtax2[1]="['1.0L-1.6L',   "+ssrs.GetText(1, 2)+"]";
		}else{
			sumtax2[0]="['1.0L-1.6L',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 3)!=null && !"".equals(ssrs.GetText(1, 3))){
			sumtax2[2]="['1.6L-2.0L',   "+ssrs.GetText(1, 3)+"]";
		}else{
			sumtax2[0]="['1.6L-2.0L',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 4)!=null && !"".equals(ssrs.GetText(1, 4))){
			sumtax2[3]="['2.0L-2.5L',   "+ssrs.GetText(1, 4)+"]";
		}else{
			sumtax2[0]="['2.0L-2.5L',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 5)!=null && !"".equals(ssrs.GetText(1, 5))){
			sumtax2[4]="['2.5L-3.0L',   "+ssrs.GetText(1, 5)+"]";
		}else{
			sumtax2[0]="['2.5L-3.0L',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 6)!=null && !"".equals(ssrs.GetText(1, 6))){
			sumtax2[5]="['3.0L-4.0L',   "+ssrs.GetText(1, 6)+"]";
		}else{
			sumtax2[0]="['3.0L-4.0L',   "+0.0+"]";
		}
		if(ssrs.GetText(1, 7)!=null && !"".equals(ssrs.GetText(1, 7))){
			sumtax2[6]="['4.0L以上',   "+ssrs.GetText(1, 7)+"]";
		}else{
			sumtax2[0]="['4.0L以上',   "+0.0+"]";
		}
		return  Arrays.toString(sumtax2);
		
	}
	
	private String getNslxData(String uid, String month){
		
		StringBuffer sumtax = new StringBuffer("[");
		
		String startTime = month.substring(0, 4)+"-"+month.substring(4)+"-01 00:00:00";
		String nextYear="";
		String nextMonthStr = "";
		if(month.substring(4).equals("12")){
			nextYear = String.valueOf(Integer.parseInt(month.substring(0, 4))+1);
			nextMonthStr = "01";
		}else{
			nextYear = month.substring(0, 4);
			int nextMonth = Integer.parseInt(month.substring(4))+1;
			if(nextMonth<10){
				nextMonthStr = "0"+String.valueOf(nextMonth);
			}else{
				nextMonthStr = String.valueOf(nextMonth);
			}
		}
		String endTime = nextYear+"-"+nextMonthStr+"-01 00:00:00";
		String sql = "select count(1),taxconditioncode from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
						null, "A", null, null, null, true, false, uid)
				+ " group by taxconditioncode ";
		SSRS ssrs = exesql.execSQL(sql);
		int sum = 0;
		for(int m=1;m<=ssrs.MaxRow;m++){
			if(ssrs.GetText(m, 1)!=null&&!"".equals(ssrs.GetText(m, 1))){
				sum+=Integer.parseInt(ssrs.GetText(m, 1));
			}
		}
		for(int n=1;n<=ssrs.MaxRow;n++){
			if(ssrs.GetText(n, 2)!=null&&"T".equals(ssrs.GetText(n, 2))){
				sumtax.append("{name: '正常纳税（T）',y: "+Double.parseDouble(ssrs.GetText(n, 1))/sum+",sliced: true,selected: true },");
			}else if(ssrs.GetText(n, 2)!=null&&"P".equals(ssrs.GetText(n, 2))){
				sumtax.append("['已完税（P）',   "+Double.parseDouble(ssrs.GetText(n, 1))/sum+"],");
			}else if(ssrs.GetText(n, 2)!=null&&"C".equals(ssrs.GetText(n, 2))){
				sumtax.append("['减税（C）',   "+Double.parseDouble(ssrs.GetText(n, 1))/sum+"],");
			}else if(ssrs.GetText(n, 2)!=null&&"E".equals(ssrs.GetText(n, 2))){
				sumtax.append("['免税（E）',   "+Double.parseDouble(ssrs.GetText(n, 1))/sum+"],");
			}else if(ssrs.GetText(n, 2)!=null&&"R".equals(ssrs.GetText(n, 2))){
				sumtax.append("['拒缴（R）',   "+Double.parseDouble(ssrs.GetText(n, 1))/sum+"],");
			}
		}
		String sumtaxStr = sumtax.substring(0, sumtax.length()-1)+"]";
		if("".equals("]")){
			sumtaxStr = "[]";
		}
		
		return sumtaxStr;
		
	}
	
	private String getBxgsData(String uid, String month){
		
		String[] sumtax2 = new String[23];
		String[] sumcar2 = new String[23];
		
		String startTime = month.substring(0, 4)+"-"+month.substring(4)+"-01 00:00:00";
		String nextYear="";
		String nextMonthStr = "";
		if(month.substring(4).equals("12")){
			nextYear = String.valueOf(Integer.parseInt(month.substring(0, 4))+1);
			nextMonthStr = "01";
		}else{
			nextYear = month.substring(0, 4);
			int nextMonth = Integer.parseInt(month.substring(4))+1;
			if(nextMonth<10){
				nextMonthStr = "0"+String.valueOf(nextMonth);
			}else{
				nextMonthStr = String.valueOf(nextMonth);
			}
		}
		String endTime = nextYear+"-"+nextMonthStr+"-01 00:00:00";
		String sql = "select sum(sumtax)/10000,count(1)/1000,paycompanycode from syjk_ccs_rkmx_temp where 1=1 "
				+ BusiQueryDao.getDefaultWhere()
				+ BusiQueryDao.getUserWhere(startTime, endTime, null, null,
						null, null, null, null, null, true, false, uid)
				+ " group by paycompanycode order by paycompanycode";
		SSRS ssrs = exesql.execSQL(sql);
		for(int b=1;b<=23;b++){
			if(ssrs.GetText(b, 3)!=null && !"".equals(ssrs.GetText(b, 3))){
				sumtax2[b-1] = ssrs.GetText(b, 1);
				sumcar2[b-1] = ssrs.GetText(b, 2);
			}else{
				sumtax2[b-1] = "0.00";
				sumcar2[b-1] = "0";
			}
		}
		
		return Arrays.toString(sumtax2)+"@"+Arrays.toString(sumcar2);
		
	}
	
	private String getBxgsName(String bxgsCode){

		String name="";
		String bigCode = bxgsCode.toUpperCase();
		if(bigCode.equals("ABIC")){
			name = "安邦财险";
		}else if(bigCode.equals("ACIC")){
			name = "安诚财险";
		}else if(bigCode.equals("AICS")){
			name = "永诚财险";
		}else if(bigCode.equals("AMIC")){
			name = "安盟保险";
		}else if(bigCode.equals("BOCI")){
			name = "中银保险";
		}else if(bigCode.equals("BPIC")){
			name = "渤海财险";
		}else if(bigCode.equals("CCIC")){
			name = "大地财险";
		}else if(bigCode.equals("CICP")){
			name = "中华联合";
		}else if(bigCode.equals("CPIC")){
			name = "太平洋财险";
		}else if(bigCode.equals("DBIC")){
			name = "都邦财险";
		}else if(bigCode.equals("GPIC")){
			name = "国寿财险";
		}else if(bigCode.equals("HAIC")){
			name = "华安财险";
		}else if(bigCode.equals("HTIC")){
			name = "华泰财险";
		}else if(bigCode.equals("JTIC")){
			name = "锦泰财险";
		}else if(bigCode.equals("PAIC")){
			name = "平安财险";
		}else if(bigCode.equals("PICC")){
			name = "人保财险";
		}else if(bigCode.equals("TAIC")){
			name = "天安财险";
		}else if(bigCode.equals("TPBX")){
			name = "安盛天平";
		}else if(bigCode.equals("TPIC")){
			name = "太平保险";
		}else if(bigCode.equals("XDCX")){
			name = "信达财险";
		}else if(bigCode.equals("YAIC")){
			name = "永安财险";
		}else if(bigCode.equals("YDCX")){
			name = "英大泰和";
		}else if(bigCode.equals("YGBX")){
			name = "阳光财险";
		}
		return name;

	}
	public double df2(double d) {  
        BigDecimal bg = new BigDecimal(d);  
        double f2 = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();  
        return f2; 
    } 
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("01")==1);
	}
		  
  
}
