package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.persistences.TutorMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.TutorMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class TutorService {

	public Tutor selectTutorById(int tutorId) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.selectTutorById(tutorId);
		}
	}
	
	public Tutor selectTutorByIdForResultMap(int tutorId) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.selectTutorByIdForResultMap(tutorId);
		}
	}
	
	public List<Tutor> selectAllTutorsProv(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.selectAllTutorsProv();
		}
	}
	
	public List<Tutor> selectTutorProv(Map<String, Object> param){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.selectTutorProv(param);
		}
	}
	
	public List<Tutor> selectTutorByJoinProv(Map<String, Object> param){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.selectTutorByJoinProv(param);
		}
	}
	
	public int insertTutor(Tutor tutor){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			int res = tutorMapper.insertTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
	
	public int updateTutor(Tutor tutor){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			int res = tutorMapper.updateTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
	
	public int deleteTutor(Tutor tutor){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			int res = tutorMapper.deleteTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
}
