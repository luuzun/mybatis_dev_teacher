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
	public int insertStsudentAnnotation(Student student) {
		log.debug("insertStsudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).insertStsudentAnnotation(student);
	}
	
	@Override
	public Student selectStudentAnnotation(Student student) {
		log.debug("selectStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentAnnotation(student);
	}
	
	@Override
	public List<Student> selectStudentByAllAnnotation() {
		log.debug("selectStudentByAllAnnotation()");		
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllAnnotation();
	}

	@Override
	public int updateStudentAnnotation(Student student) {
		log.debug("updateStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).updateStudentAnnotation(student);
	}

	@Override
	public int deleteStudentAnnotation(Student student) {
		log.debug("deleteStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudentAnnotation(student);
	}

	@Override
	public List<Student> selectStudentByAllForResults() {
		log.debug("selectStudentByAllForResults()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResults();
	}

	@Override
	public List<Map<String, Object>> selectStudentByAllForResultsMap() {
		log.debug("selectStudentByAllForResultsMap()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForResultsMap();
	}

	@Override
	public List<Student> selectStudentByAllForMapper() {
		log.debug("selectStudentByAllForMapper()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllForMapper();
	}
}
