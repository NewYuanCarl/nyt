package com.liu.biz.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liu.biz.IDeptBiz;
import com.liu.DAO.IDeptDAO;
import com.liu.pojo.Dept;
@Service
public class DeptBizImpl implements IDeptBiz {

	private IDeptDAO deptDAOImpl;
	
	
	public IDeptDAO getDeptDAOImpl() {
		return deptDAOImpl;
	}

	public void setDeptDAOImpl(IDeptDAO deptDAOImpl) {
		this.deptDAOImpl = deptDAOImpl;
	}

	public List<Dept> findall() {
		return deptDAOImpl.findall();
	}

}
