package com.star.user.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.user.domain.UserVO;

public class UserDAO {
	public SqlSession sqlSession;

	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	

//	public void insert(UserVO userVO) {
//		sqlSession.insert("user.insert", userVO);
//	}
//	
//	public UserVO selectSitter(Long userId) {
//		return sqlSession.selectOne("user.select", userId);
//	}
	
//	펫시터 상세보기
	public UserVO selectSitterdetail(Long userNumber) {
		return sqlSession.selectOne("user.selectSitterdetail", userNumber);
	}
//	펫시터 찾기
	public List<UserVO> selectAllSitter(){
		return sqlSession.selectList("user.selectAllSitter");
	}

//	메인페이지 돌봄이 신청자 가져오기
	public List<UserVO> selectCurrentSitters(){
		return sqlSession.selectList("user.selectCurrentSitters");
	}
	

}
