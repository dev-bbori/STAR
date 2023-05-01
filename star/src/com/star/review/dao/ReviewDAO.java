package com.star.review.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.review.domain.ReviewDTO;

public class ReviewDAO {
public SqlSession sqlSession;

   public ReviewDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }
   
   public List<ReviewDTO> selectAll(HashMap<String, Object> pagable){
      return sqlSession.selectList("review.selectAll", pagable);
   }
   
   public int getTotal(){
      return sqlSession.selectOne("review.getTotal");
   }
   
   public void delete(Long reviewNumber) {
      sqlSession.delete("review.delete",reviewNumber);
   }
   
}

