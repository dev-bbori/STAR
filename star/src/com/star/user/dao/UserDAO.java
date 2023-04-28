package com.star.user.dao;


import java.util.HashMap;


import java.util.List;


import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;

import com.star.user.domain.*;

import com.star.user.domain.UserVO;

public class UserDAO {
	public SqlSession sqlSession;

	public UserDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	
	
	//회원가입

	public void insert(UserVO userVO) {
		sqlSession.insert("user.insert" , userVO);
	}
	
	//로그인
	
	public void select(Long usernumber) {
		sqlSession.selectOne("user.select",usernumber);
	}
	
	public void findPW(String userId) {
		sqlSession.selectOne("user.findPW",userId);
	}
	
	//아이디 중복 검사
	
	public boolean getcountid(String userId) {
		return (Integer)sqlSession.selectOne("user.getcountid", userId)==0;
	}
	
	public Long login(String userId, String userPassword) {
		HashMap<String, Object> loginmap = new HashMap<String, Object>();
		loginmap.put("userId",userId);
		loginmap.put("userPassword",userPassword);
		
		return sqlSession.selectOne("user.login",loginmap);
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

	public List<UserVO> selectCurrentSitters(){
		return sqlSession.selectList("user.selectCurrentSitters");
	}
	


}
