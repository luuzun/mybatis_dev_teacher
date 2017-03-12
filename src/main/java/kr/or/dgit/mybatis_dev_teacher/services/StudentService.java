package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {

	public int insertStudentApi(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentApi(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	public Student selectStudentApi(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentApi(student);
		} 
	}
	
	public List<Student> selectStudentByAllApi() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllApi();
		} 
	}
	
	public int updateStudentApi(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudentApi(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int deleteStudentApi(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudentApi(student);
			sqlSession.commit();
		} 
		return res;
	}

}
