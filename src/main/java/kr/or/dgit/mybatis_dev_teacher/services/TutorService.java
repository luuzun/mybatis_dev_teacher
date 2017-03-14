package kr.or.dgit.mybatis_dev_teacher.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.persistences.TutorMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.TutorMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final TutorService instance = new TutorService();
	
	private TutorService() {}

	public static TutorService getInstance() {
		return instance;
	}

	public Tutor selectTutorForTutorId(int tutorId) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			TutorMapper tutorMapper = new TutorMapperImpl(sqlSession);
			return tutorMapper.findTutorById(tutorId);
		}
	}
}
