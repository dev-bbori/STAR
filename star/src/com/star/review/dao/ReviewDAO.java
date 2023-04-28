package com.star.review.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.review.domain.ReviewVO;

public class ReviewDAO {
public SqlSession sqlSession;

	public ReviewDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
//	메인화면으로 이용후기 가져오기
	public List<ReviewVO> selectMainReviews() {
		return sqlSession.selectList("review.selectMainReviews");
	}
}
