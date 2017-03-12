package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;

import javax.swing.JOptionPane;

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
			try {
				res = studentMapper.insertStudent(student);
				sqlSession.commit();
				if (res < 1) {
					JOptionPane.showMessageDialog(null, "추가 실패");
				}
			} catch (Exception e) {
				e.printStackTrace();
				sqlSession.rollback();
			}
		} 
		return res;
	}

	public int insertStudentApi(Student student) {
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			try {
				res = studentMapper.insertStudentApi(student);
				sqlSession.commit();
				if (res < 1) {
					JOptionPane.showMessageDialog(null, "추가 실패");
				}
			} catch (Exception e) {
				e.printStackTrace();
				sqlSession.rollback();
			}
		} 
		return res;
	}
	
	public int insertStsudentAnnotation(Student student){
		int res = -1;
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			StudentMapper studentMapper = new StudentMapperImpl(sqlSession);
			try {
				res = studentMapper.insertStsudentAnnotation(student);
				sqlSession.commit();
				if (res < 1) {
					JOptionPane.showMessageDialog(null, "추가 실패");
				}
			} catch (Exception e) {
				e.printStackTrace();
				sqlSession.rollback();
			}
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
}
