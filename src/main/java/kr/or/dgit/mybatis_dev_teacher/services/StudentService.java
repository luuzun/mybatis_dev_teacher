package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {

	public int insertStsudentAnnotation(Student student){
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStsudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}

	public Student selectStudentAnnotation(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentAnnotation(student);
		}
	}
	
	public List<Student> selectStudentByAllAnnotation(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllAnnotation();
		}
	}
	
	public int updateStudentAnnotation(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int deleteStudentAnnotation(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	public List<Student> selectStudentByAllForResults(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForResults();
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForResultsMap(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForResultsMap();
		}
	}
	
	public List<Student> selectStudentByAllForMapper(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForMapper();
		}
	}
	
	public Student selectStudentWithAddressNestedMapper(int studId) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentWithAddressNestedMapper(studId);
		}
	}
}
