package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class TutorService {
	private static final Log log = LogFactory.getLog(TutorService.class);
	private String namespace="kr.or.dgit.mybatis_dev_teacher.dao.TutorMapper";
	
	
	public Tutor findTutorById(Tutor tutor){
		log.debug("findTutorById()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession()){
			return sqlSession.selectOne(namespace+".findTutorById", tutor);
		}
	}
}











