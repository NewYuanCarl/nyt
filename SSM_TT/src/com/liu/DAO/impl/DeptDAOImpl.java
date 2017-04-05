package com.liu.DAO.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.liu.DAO.IDeptDAO;
import com.liu.pojo.Dept;


@Repository
public class DeptDAOImpl extends SqlSessionDaoSupport implements IDeptDAO {
	
	public List<Dept> findall() {
		return super.getSqlSession().selectList("com.liu.pojo.Dept.findalldept");
	}

	
}
