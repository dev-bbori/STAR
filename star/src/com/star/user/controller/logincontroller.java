package com.star.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Action;
import com.star.Result;
import com.star.user.dao.UserDAO;
import com.star.user.domain.UserVO;

public class logincontroller implements Action {
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	// TODO Auto-generated method stub
	
	String userId = req.getParameter("userId");
	String userPassword = req.getParameter("userPassword");
	
	Result result = new Result();
	UserDAO userdao = new UserDAO();

	userdao.login(userId,userPassword);
	result.setRedirect(true);
	result.setPath("login.User");
	
	return result;
}
}
