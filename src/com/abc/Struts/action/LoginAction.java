package com.abc.Struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
//import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
//public class LoginAction implements Action{
public class LoginAction extends ActionSupport implements ServletRequestAware{
	private String userName;
	private String password;

	public String getUserName(){
		return userName;
	}
	
	public void setUserName(String userName){
		this.userName = userName;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	//申明request对象
	private HttpServletRequest request;
	//重写ServletRequestAware中的方法
	public void setServletRequest(HttpServletRequest request){
		this.request = request;
	}
	
	public String execute() {
		System.out.println("-- --登陆的用户信息-- -- -");
		System.out.println("用户名："+userName);
		System.out.println("密码："+password);
		if (userName.startsWith("qst") && password.length()>=6) {
			//获得session对象
			HttpSession session = request.getSession();
			//将用户名存放到session中
			session.setAttribute("CurUser", userName);
			return SUCCESS;
		} else {
			return ERROR;
		}
	}
	
	//重写validate()方法
	public void validate() {
		//简单验证用户输入
		if (this.userName == null || this.userName.equals("")) {
			//将错误信息写入到Action类的FieldErrors中
			//此时Struts框架自动返回INPUT视图
			this.addFieldError("userName", "用户名不能为空！");
			System.out.println("用户名为空！");
		}
		if (this.password == null || this.password.length()<6) {
			this.addFieldError("password", "密码不能为空且密码长度不能小于6");
			System.out.println("密码不能为空且密码长度不能小于6");
		}
	}
}
