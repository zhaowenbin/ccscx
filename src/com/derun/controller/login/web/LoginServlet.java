package com.derun.controller.login.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import com.derun.common.db.ExeSQL;
import com.derun.controller.busiQuery.util.ResponseUtil;
import com.derun.controller.login.dao.LoginDao;
import com.derun.controller.login.util.User;

/**
 * 
 * @author 郑艳英
 * 用户登录
 *
 */
public class LoginServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ExeSQL es = new ExeSQL();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	 String returnStr = "";
	 String uid = java.net.URLDecoder.decode(request.getParameter("username"),"UTF-8");
	 String password = request.getParameter("password");
	 String uid_db = es.getOneValue("select 1 from ccsuser where id='"+uid+"'");
	 if(uid_db!=null&&!"".equals(uid_db)){
		 String uname = es.getOneValue("select name from ccsuser where id='"+uid+"' and password='"+password+"'");
		 if(uname!=null&&!"".equals(uname)){
			 returnStr = "ok";
			 HttpSession session = request.getSession();
			 session.removeAttribute("uid");
			 session.setAttribute("uid", uid);
			 session.removeAttribute("uname");
			 session.setAttribute("uname", uname);
		 }else{
			 returnStr = "密码错误";
		 }
	 }else{
		 returnStr = "用户名不存在";
	 }
	 
	 ResponseUtil.write(response, returnStr);
	}

	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	public boolean addUser(User user){
		
		boolean addFlag = false;
		LoginDao loginDao = new LoginDao();
		addFlag = loginDao.saveUser(user);
		return addFlag;
	}
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public boolean destroyUser(String userid){
		
		boolean delFlag = false;
		LoginDao loginDao = new LoginDao();
		delFlag = loginDao.destroyUser(userid);
		return delFlag;
	}
	  
	/**
	 * 查询用户列表
	 * @return
	 */
	public String getUserList(HttpServletRequest request, HttpServletResponse response){
		LoginDao loginDao = new LoginDao();
		List<User> userList = loginDao.getUserList();
		JSONObject json = new JSONObject();
		JSONArray ja = JSONArray.fromObject(userList);
		json.put("total", userList.size());
		json.put("rows", ja);
		return json.toString();
	}
	
	/**
	 * 验证用户名是否存在
	 * @param username
	 * @return
	 */
	public boolean isExist(String username){
		
		LoginDao loginDao = new LoginDao();
		return loginDao.isExist(username);
	}
}
