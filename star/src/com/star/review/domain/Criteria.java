package com.star.review.domain;

public class Criteria {
	private int offset;
	private int size;
	
	public Criteria(int page, int total) {
	// 한 페이지에 출력되는 게시글의 개수
		int rowCount = 10;
	// 한 페이지에서 나오는 페이지 버튼의 개수
		int pageCount = 10;
		int startRow = (page - 1) * rowCount;
		
		int endPage = (int)(Math.ceil(page / (double)pageCount) * pageCount);
		int startPage = endPage - (pageCount -1);
		int realEndPage = (int)Math.ceil(total / (double)rowCount);
		
		boolean prev = startPage > 1;
		boolean next = false;
		endPage = endPage > realEndPage ? realEndPage : endPage;
		next = endPage != realEndPage;
	}
}
