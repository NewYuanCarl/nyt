package com.liu.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Dept implements Serializable {
	private Integer deptno;
	private String dname;
	private String loc;
	private List<Emp> emps;
	
	
	
	
	public Integer getDeptno() {
		return deptno;
	}


	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public List<Emp> getEmps() {
		return emps;
	}


	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}


	public Dept() {
		// TODO Auto-generated constructor stub
	}


	public Dept(String dname, String loc, List<Emp> emps) {
		this.dname = dname;
		this.loc = loc;
		this.emps = emps;
	}
	
	
}
