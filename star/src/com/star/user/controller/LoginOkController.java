package com.star.user.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.star.Result;
import com.star.user.dao.UserDAO;

public class LoginOkController {
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		UserDAO userDAO = new UserDAO();
		Result result = new Result();
		HttpSession session = req.getSession();
		Long userNumber = userDAO.login(req.getParameter("userId"),req.getParameter("userPassword"));
		result.setRedirect(true);
		if(userNumber == null) {
			result.setPath("/templates/loginpage/login.jsp");
		}else {
			session.setAttribute("userNumber",userNumber);
			result.setPath(req.getContextPath()+"/myInfo.user");
		}
		return result;
	}

}
