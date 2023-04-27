package com.star.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Result;
import com.star.user.controller.Joinokcontroller;

public class UserFrontController extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		System.out.println("들어옴");
		String target = req.getRequestURI().replace(req.getContextPath() + "/","" ).split("\\.")[0];
		System.out.println(target);
		
		Result result = null;
		
		if(target.equals("joinok")) {
			result = new Joinokcontroller().execute(req, resp);
		}
		
		else if(target.equals("login")) {
			result = new Result();
			result.setPath("templates/loginpage/login.jsp");
		}

		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
