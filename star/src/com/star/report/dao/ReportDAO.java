package com.star.report.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.star.mybatis.config.MyBatisConfig;
import com.star.report.domain.ReportDTO;

public class ReportDAO {
public SqlSession sqlSession;

   public ReportDAO() {
      sqlSession = MyBatisConfig.getSqlSessionFactory().openSession(true);
   }

   public List<ReportDTO> selectAll(HashMap<String, Object> pagable){
      return sqlSession.selectList("report.selectAll", pagable);
   }
   
   public int getTotal(){
      return sqlSession.selectOne("report.getTotal");
   }
   
   
//   삭제
   public void delete(Long reprotId) {
      sqlSession.delete("report.delete", reprotId);
   }
}