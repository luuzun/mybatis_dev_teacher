package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {

	public int insertStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudent(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int insertStudentApi(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentApi(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	public int insertStsudentAnnotation(Student student){
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStsudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}

	public Student selectStudent(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudent(student);
		}
	}

	public Student selectStudentApi(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentApi(student);
		} 
	}
	
	public Student selectStudentAnnotation(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentAnnotation(student);
		}
	}
	
	public List<Student> selectStudentByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAll();
		}
	}

	public List<Student> selectStudentByAllApi() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllApi();
		} 
	}
	
	public List<Student> selectStudentByAllAnnotation(){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllAnnotation();
		}
	}
	
	public int updateStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudent(student);
			sqlSession.commit();
		} 
		return res;
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

	public int updateStudentAnnotation(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int deleteStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudent(student);
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

	public int deleteStudentAnnotation(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudentAnnotation(student);
			sqlSession.commit();
		} 
		return res;
	}
}
