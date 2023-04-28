package com.star.main.controller;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Action;
import com.star.Result;
import com.star.user.dao.UserDAO;


public class SelectCurrentSitterController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		System.out.println("들어옴");
		UserDAO userDAO = new UserDAO();
		Result result = new Result();
		
//		돌봄이 이름넣기
		req.setAttribute("dolbomname1", userDAO.selectCurrentSitters().get(0));
		req.setAttribute("dolbomname2", userDAO.selectCurrentSitters().get(1));
		req.setAttribute("dolbomname3", userDAO.selectCurrentSitters().get(2));
		
		req.setAttribute("dolbomsoge1", userDAO.selectCurrentSitters().get(0));
		req.setAttribute("dolbomsoge2", userDAO.selectCurrentSitters().get(1));
		req.setAttribute("dolbomsoge3", userDAO.selectCurrentSitters().get(2));
		
		System.out.println("DAO지나서 들어옴");
		
		
		
		result.setPath("/templates/mainpage.jsp");
		return result;
	}
}
