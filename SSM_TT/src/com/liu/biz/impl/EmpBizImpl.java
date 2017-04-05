package com.liu.biz.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liu.DAO.IEmpDAO;
import com.liu.biz.IEmpBiz;
import com.liu.pojo.Emp;


@Service
public class EmpBizImpl implements IEmpBiz {

	private IEmpDAO empDAOImpl;
	
	public List<Emp> findall() {
		return empDAOImpl.findall();
	}

	public int countEname(String ename) {
		if(ename==null||ename.equals("")){
			return 0;
		}
		return empDAOImpl.countEname(ename);
	}
	

	public IEmpDAO getEmpDAOImpl() {
		return empDAOImpl;
	}

	public void setEmpDAOImpl(IEmpDAO empDAOImpl) {
		this.empDAOImpl = empDAOImpl;
	}

	



}
