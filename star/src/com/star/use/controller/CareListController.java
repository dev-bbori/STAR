package com.star.use.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONArray;

import com.star.Action;
import com.star.Result;
import com.star.use.dao.UseDAO;

public class CareListController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		req.setCharacterEncoding("UTF-8");
		UseDAO useDAO = new UseDAO();
		Result result = new Result();
		JSONArray jsonArray=new JSONArray();
		HttpSession session = req.getSession();
		PrintWriter out = resp.getWriter();
		useDAO.mycarelist((Long)session.getAttribute("userNumber")).stream().map(jsonArray::put);  	
		result.setRedirect(true);
		result.setPath("/templates/mypage/carelist.jsp");
		out.print(jsonArray.toString());
		out.close();
		
		return result;
	}

}
