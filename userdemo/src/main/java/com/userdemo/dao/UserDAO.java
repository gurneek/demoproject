package com.userdemo.dao;

import javax.sql.DataSource;
import com.userdemo.domain.*;


public interface UserDAO 
{
	public abstract void setDataSource(DataSource dataSource);
    public abstract boolean authenticateUser(User user);
	
}
