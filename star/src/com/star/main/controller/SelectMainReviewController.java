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
		
//		이용후기 가져오기
		req.setAttribute("main_hugi1", reviewDAO.selectMainReviews().get(0));
		req.setAttribute("main_hugi2", reviewDAO.selectMainReviews().get(1));
		req.setAttribute("main_hugi3", reviewDAO.selectMainReviews().get(2));
		req.setAttribute("main_hugi4", reviewDAO.selectMainReviews().get(3));
		req.setAttribute("main_hugi5", reviewDAO.selectMainReviews().get(4));
		req.setAttribute("main_hugi6", reviewDAO.selectMainReviews().get(5));


		
		result.setPath("/templates/mainpage.jsp");
		return result;
	}

}
