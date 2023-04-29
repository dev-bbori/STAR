package com.star.use.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.use.domain.UseDTO;

public class UseDAO {
public SqlSession sqlSession;

	public UseDAO() {
		sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
	}
	//돌봄내역 불러오기
	public List<UseDTO> mycarelist(Long userNumber) {
		return sqlSession.selectList("use.selectcarelist",userNumber);
	}
}