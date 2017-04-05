package com.liu.pojo;

import java.io.Serializable;

public class Users implements Serializable {
	private Integer userid;
	private String loginname;
	private String loginpwd;
	private String realname;
	
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users( String loginname, String loginpwd,
			String realname) {
		this.loginname = loginname;
		this.loginpwd = loginpwd;
		this.realname = realname;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpwd() {
		return loginpwd;
	}
	public void setLoginpwd(String loginpwd) {
		this.loginpwd = loginpwd;
	}
	public String getRealname() {
		return realname;
	}
	public void setRealname(String realname) {
		this.realname = realname;
	}
	
	
}
