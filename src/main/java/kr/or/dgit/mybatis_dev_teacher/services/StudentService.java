package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {
	
	//////////////// select ////////////////////
	public Student findStudent(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNo(student);
		}
	}
	
	public List<Student> findStudentByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllAPI();
		}
	}
	
	public Student findStudentAPI(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoAPI(student);
		}
	}
	
	public List<Student> findStudentByAllAPI() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllAPI();
		}
	}
	
	public Student findStudentANNOTATION(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoANNOTATION(student);
		}
	}
	
	public List<Student> findStudentByAllANNOTATION() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllANNOTATION();
		}
	}
	
	//////////////// insert ////////////////////
	public int insertStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudent(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int insertStudentAPI(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentAPI(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	public int insertStudentANNOTATION(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentANNOTATION(student);
			sqlSession.commit();
		} 
		return res;
	}

	public int insertStudentAutoInc(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentAutoInc(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	public int insertStudentAutoIncANNOTATION(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudentAutoIncANNOTATION(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	//////////////// update ////////////////////
	public int updateStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.updateStudent(student);
			sqlSession.commit();
		} 
		return res;
	}
	
	//////////////// delete ////////////////////
	public int deleteStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.deleteStudent(student);
			sqlSession.commit();
		} 
		return res;
	}

}
