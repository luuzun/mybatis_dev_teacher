package kr.or.dgit.mybatis_dev_teacher.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.TutorMapper;
import kr.or.dgit.mybatis_dev_teacher.dao.TutorMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class TutorService {
	
	public Tutor findTutorById(Tutor tutor) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.findTutorById(tutor);
		}
	}

	public int insertTutor(Tutor tutor) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			int res = tutorMapper.insertTutor(tutor);
			sqlSession.commit();
			return res;
		}
	}
}











