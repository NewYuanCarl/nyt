package com.liu.DAO.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.liu.DAO.IEmpDAO;
import com.liu.pojo.Emp;


@Repository
public class EmpDAOImpl extends SqlSessionDaoSupport implements IEmpDAO {

	public List<Emp> findall() {
		// TODO Auto-generated method stub
		return  super.getSqlSession().selectList("com.liu.pojo.Emp.findallemp");
	}

	public int countEname(String ename) {
		// TODO Auto-generated method stub
		return super.getSqlSession().selectOne("com.liu.pojo.Emp.countEname", ename);
	}

	
}
