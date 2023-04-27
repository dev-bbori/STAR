package com.star.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Action;
import com.star.Result;
import com.star.user.dao.UserDAO;
import com.star.user.domain.UserVO;

public class Joinokcontroller implements Action {
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	// TODO Auto-generated method stub
	
	String userId = req.getParameter("userId");
	String userPassword = req.getParameter("userPassword");
	String userName = req.getParameter("userName");
	String userAddress = req.getParameter("userAddress");
	String userPhonenumber = req.getParameter("userPhonenumber");
	String userAge = req.getParameter("userAge");
	String userGender = req.getParameter("userGender");
	
	
	Result result = new Result();
	UserDAO userdao = new UserDAO();
	UserVO uservo = new UserVO();
	
	uservo.setUserId(userId);
	uservo.setUserPassword(userPassword);
	uservo.setUserName(userName);
	uservo.setUserName(userAddress);
	uservo.setUserPhonenumber(userPhonenumber);
	uservo.setUserName(userAge);
	uservo.setUserName(userGender);
	
	userdao.insert(uservo);
	result.setRedirect(true);
	result.setPath("login.User");
	
	return result;
}
}
