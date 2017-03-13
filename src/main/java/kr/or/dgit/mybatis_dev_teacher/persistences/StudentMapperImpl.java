package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public class StudentMapperImpl implements StudentMapper{
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(StudentMapperImpl.class);
	
	public StudentMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public int insertStudent(Student student){
		log.debug("insertStudent()");
		return sqlSession.getMapper(StudentMapper.class).insertStudent(student);
    }

	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()");
		return sqlSession.getMapper(StudentMapper.class).insertStudentAutoInc(student);
	}
	
	@Override
	public Student selectStudent(Student student) {
		log.debug("selectStudent()");
		return sqlSession.getMapper(StudentMapper.class).selectStudent(student);
	}


	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudents()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
	}

	@Override
	public List<Student> selectStudentByAllForResutlMap() {
		log.debug("selectStudentByAllForResutlMap()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResutlMap();
	}
	
	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.getMapper(StudentMapper.class).updateStudent(student);
	}

	@Override
	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForHashMap() {
		log.debug("selectStudentByAllForHashMap()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForHashMap();
	}

	@Override
	public Student selectStudentByNoForResultMapExtends(int studId) {
		log.debug("selectStudentByNoForResultMapExtends()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByNoForResultMapExtends(studId);
	}



}
