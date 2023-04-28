package com.star.main;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Result;
import com.star.main.controller.SelectCurrentSitterController;

public class MainFrontController extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
		Result result = null;
		
		if(target.equals("main")) {
			result = new SelectCurrentSitterController().execute(req, resp);
			System.out.println("호잇");
		}
		    
	
		
		
		
		
		
		if(result!=null) {
		   	if(result.isRedirect()) {
		   		resp.sendRedirect(result.getPath());
		
		   	}else {
		   		req.getRequestDispatcher(result.getPath()).forward(req, resp);
				
			}
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

/*
 * req.setCharacterEncoding("UTF-8"); String target =
 * req.getRequestURI().replace(req.getContextPath()+"/", "").split("\\.")[0];
 * Result result = new Result(); System.out.println(target);
 * System.out.println("들어옴"); if(target.equals("main")) {
 * result.setPath("templates/mainpage.jsp");
 * 
 * }
 * 
 * if(result!=null) { if(result.isRedirect()) {
 * resp.sendRedirect(req.getContextPath()+"/"+result.getPath()); }else {
 * req.getRequestDispatcher(result.getPath()).forward(req, resp);
 * 
 * } }
 */