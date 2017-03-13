package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final Log log = LogFactory.getLog(StudentService.class);
	private String namespace="kr.or.dgit.mybatis_dev_teacher.dao.StudentMapper";
	
	public Student findStudentByNo(Student student){
		log.debug("findStudentByNo()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
		}
	}
	
	public Student findStudentByNoApi(Student student){
		log.debug("findStudentByNoApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectOne(namespace+".selectOne", student);
		}
	}
	
	public Student findStudentByNoAnnotation(Student student){
		log.debug("findStudentByNoAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByNoAnnotation(student);
		}
	}
	
	public List<Student> findStudentByAll(){
		log.debug("findStudentByAll()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
		}
	}
	public List<Student> findStudentByAllApi(){
		log.debug("findStudentByAllApi()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.selectList(namespace+".list");
		}
	}
	public List<Student> findStudentByAllAnnotation(){
		log.debug("findStudentByAllAnnotation()");
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			return sqlSession.getMapper(StudentMapper.class).selectStudentByAllAnnotation();
		}
	}
}
