package com.star.use;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Result;
import com.star.use.controller.CareListController;

public class UseFrontController {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		String target = req.getRequestURI().replace("/", "").split("\\.")[0];
		Result result = new Result();
		if(target.equals("careList")) {
			result = new CareListController().execute(req,resp);
		}
		
		
		
		
		
		
		
		
		
		
		
		
				
						
					
						
						

		
		
		
		
		
		
		
		
		
		//여기까지 작업공간
		if(result != null) {
			if(result.isRedirect()) {
				resp.sendRedirect(result.getPath());
			}else {
				req.getRequestDispatcher(result.getPath()).forward(req, resp);
			}
		}
	}
	}