package com.liu.biz;

import java.util.List;

import com.liu.pojo.Emp;

public interface IEmpBiz {

	public List<Emp> findall();
	
	public int countEname(String ename);
}
