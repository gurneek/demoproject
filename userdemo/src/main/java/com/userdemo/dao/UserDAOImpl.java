package com.userdemo.dao;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

import com.userdemo.domain.User;

@Component
public abstract class UserDAOImpl implements UserDAO
{
	@SuppressWarnings({ "unused", "deprecation" })
	private SimpleJdbcTemplate simpleJdbcTemplate;
	
	@Autowired
    public void setDataSource(DataSource dataSource){
        this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
    }
	
	public boolean authenticateUser(User user)
	{
        boolean userExists = false;
        int rowcount = simpleJdbcTemplate.queryForInt("select * from users" +
                " where username = ? and password = ?",
                user.getUsername(),user.getPassword());
        if(rowcount==1)
        {
            userExists = true;
        }
        return userExists;
    }
 
	
	
}
