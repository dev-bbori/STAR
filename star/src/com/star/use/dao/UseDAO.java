package com.star.use.dao;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;

public class UseDAO {
public SqlSession sqlSession;

	public UseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
}