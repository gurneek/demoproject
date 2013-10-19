package com.userdemo.controller;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.userdemo.dao.*;
import com.userdemo.domain.*;
import com.userdemo.service.*;

@Controller
public class UserController 
{
	@Autowired
    private UserService userService;
	
	public void setUserServiceImpl(UserService userService) 
	{
        this.userService = userService;
    }
	
	 public UserService getUserServiceImpl()
	 {
	        return userService;
	 }
	 @RequestMapping("login")
	    public String toLogin(Model model) {
	        //Make sure to add model of UserBean in which login 
	        //userName and password will be stored from the login form 
	        model.addAttribute("user", new User());
	        //"login" will be resolved to login.jsp
	        //where login-form is presented to user
	        return "login";
	    }
	
	 @RequestMapping("doLogin")
	    public ModelAndView doLogin(@ModelAttribute @Valid User user,BindingResult result) {
	        ModelAndView view = new ModelAndView("login");
	        //If input bean does not have validation error then proceed
	        if(!result.hasFieldErrors()) {
	            //If not a valid user then add error
	            //else proceed to user welcome page
	            if(!userService.authenticateUser(user)) {
	                result.addError(new ObjectError("err", "Invalid Credentials"));
	            }
	            else {
	                view.setViewName("welcome");
	            }
	        }
	        return view;
	    }
	
	
	
}
