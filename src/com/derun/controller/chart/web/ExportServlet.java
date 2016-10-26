package com.derun.controller.chart.web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.derun.controller.busiQuery.util.ResponseUtil;

public class ExportServlet extends HttpServlet {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String FILE_SEPARATOR = System.getProperties()
			.getProperty("file.separator");

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {

		String showType = request.getParameter("showType");// 统计类型
		String datefrom = request.getParameter("datefrom");
		String dateto = request.getParameter("dateto");
		String city = request.getParameter("city");
		String country = request.getParameter("country");
		String bxgs = request.getParameter("bxgs");
		String pzlx = request.getParameter("pzlx");
		
		if(showType!=null && showType.toUpperCase().equals("EXPORTEXCEL")){//导出数据到Excel
			JSONObject json = JSONObject.fromObject(request.getParameter("datatable"));
			JSONArray array = JSONArray.fromObject(json.get("rows"));
			String filename = city+"-"+country+"-"+bxgs+"-"+pzlx+"-"+datefrom+"-"+dateto+".xls";
			String filepath = request.getSession().getServletContext().getRealPath("docs");
			String fileAllPath = filepath + FILE_SEPARATOR + filename;
			try {
				// 输出流
				OutputStream os = new FileOutputStream(fileAllPath);
				// 工作区
				XSSFWorkbook wb = new XSSFWorkbook();
				XSSFSheet sheet = wb.createSheet("test");
				for (int i = 0; i < 2; i++) {//文件内容
					// 创建第一个sheet
					// 生成第一行
					XSSFRow row = sheet.createRow(i);
					// 给这一行的第一列赋值
					row.createCell(0).setCellValue("xxx");
					// 给这一行的第一列赋值
					row.createCell(1).setCellValue("ooo");
					System.out.println(i);
				}
				// 写文件
				wb.write(os);
				// 关闭输出流
				os.close();
				
				ResponseUtil.write(response, fileAllPath);
				
			} catch (Exception e) {
				ResponseUtil.write(response, e.getMessage());
				e.printStackTrace();
			}
//			download(fileAllPath, response);
		}else{
			System.out.println("不支持的统计类型");
		}
		

	}
	private void download(String path, HttpServletResponse response) {
		try {
			// path是指欲下载的文件的路径。
			File file = new File(path);
			// 取得文件名。
			String filename = file.getName();
			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();
			// 设置response的Header
			response.addHeader("Content-Disposition", "attachment;filename="
					+ new String(filename.getBytes()));
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(
					response.getOutputStream());
			response.setContentType("application/vnd.ms-excel;charset=gb2312");
			toClient.write("true".getBytes());
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	public static void main(String[] args) {
		System.out.println(Integer.parseInt("01")==1);
	}
		  
  
}
