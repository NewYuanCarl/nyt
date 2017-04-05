package com.liu.DAO.impl;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;

import com.liu.DAO.IUserDAO;
import com.liu.pojo.Users;


@Repository
public class UserDAOImpl extends SqlSessionDaoSupport implements IUserDAO {

	public Users islogin(Users user) {
		
		return super.getSqlSession().selectOne("com.liu.pojo.Users.checklogin", user);
	}

	
}
