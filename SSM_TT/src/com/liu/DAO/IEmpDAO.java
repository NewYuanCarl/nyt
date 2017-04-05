package com.liu.DAO;

import java.util.List;

import com.liu.pojo.Emp;

public interface IEmpDAO {

	public List<Emp> findall();
	
	public int countEname(String ename);
}
