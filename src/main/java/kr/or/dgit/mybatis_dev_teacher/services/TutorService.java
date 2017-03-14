package kr.or.dgit.mybatis_dev_teacher.services;

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
}
