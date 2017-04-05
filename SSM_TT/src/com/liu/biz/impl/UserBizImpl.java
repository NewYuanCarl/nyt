package com.liu.biz.impl;

import org.springframework.stereotype.Service;

import com.liu.DAO.IUserDAO;
import com.liu.biz.IUserBiz;
import com.liu.pojo.Users;


@Service
public class UserBizImpl implements IUserBiz {

	private IUserDAO userDAOImpl;
	
	public Users islogin(Users user) {
		if(user==null||user.getLoginname()==null||user.getLoginpwd()==null){
			return null;
		}
		return userDAOImpl.islogin(user);
	}


	public IUserDAO getUserDAOImpl() {
		return userDAOImpl;
	}

	public void setUserDAOImpl(IUserDAO userDAOImpl) {
		this.userDAOImpl = userDAOImpl;
	}

}
