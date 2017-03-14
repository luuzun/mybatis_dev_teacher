package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class StudentService {
	private static final StudentService instance = new StudentService();
	
	private StudentService() {}

	public static StudentService getInstance() {
		return instance;
	}

	public int insertStudent(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			res = studentMapper.insertStudent(student);
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
	
	public Student selectStudent(Student student) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudent(student);
		}
	}

	public List<Student> selectStudentByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAll();
		}
	}

	public List<Student> selectStudentByAllForResutlMap() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForResutlMap();
		}
	}
	
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByAllForHashMap();
		}
	}
	
	public Student selectStudentByNoWithAddressForAssociation(Student student){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoWithAddressForAssociation(student);
		}
	}
	
	public Student selectStudentByNoForResultMapExtends(Student student){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			return studentMapper.selectStudentByNoForResultMapExtends(student);
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
