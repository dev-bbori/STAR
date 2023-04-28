package com.star.main.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.star.Action;
import com.star.Result;
import com.star.review.dao.ReviewDAO;

public class SelectMainReviewController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		ReviewDAO reviewDAO = new ReviewDAO();
		Result result = new Result();
		
		
		
		result.setPath("/templates/mainpage.jsp");
		return result;
	}

}
