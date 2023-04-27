package com.star.user.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.user.domain.*;

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
	
	//아이디 중복 검사
	
	public boolean getcountid(String userId) {
		return (Integer)sqlSession.selectOne("user.getcountid", userId)==0;
	}
	
	public void login(String userId, String userPassword) {
		HashMap<String, Object> loginmap = new HashMap<String, Object>();
		loginmap.put("userId",userId);
		loginmap.put("userPassword",userPassword);
		sqlSession.selectOne("user.login",loginmap);
	}
	
}
