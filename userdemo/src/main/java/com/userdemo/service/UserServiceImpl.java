package com.userdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.userdemo.domain.*;
import com.userdemo.dao.*;


@Component
public class UserServiceImpl implements UserService 
{
	 @Autowired
	    private UserDAO userDAO;
	 
	    public void setUserDAOImpl(UserDAO userDAO) {
	        this.userDAO = userDAO;
	    }
	    public UserDAO getUserDAOImpl() 
	    {
	        return userDAO;
	    }
	 
	    public boolean authenticateUser(User user)
	    {
	        return userDAO.authenticateUser(user);
	    }
}