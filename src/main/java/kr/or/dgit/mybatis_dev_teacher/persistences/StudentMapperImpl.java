package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public class StudentMapperImpl implements StudentMapper{
	private String nameSpace = "kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper"; //StudentMapper.xml의 namespace
	
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

	public int insertStudentApi(Student student){
		log.debug("insertStudentApi()");
		return sqlSession.insert(nameSpace+".insert", student);
	}

	@Override
	public int insertStsudentAnnotation(Student student) {
		log.debug("insertStsudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).insertStsudentAnnotation(student);
	}
	
	@Override
	public Student selectStudent(Student student) {
		log.debug("selectStudent()");
		return sqlSession.getMapper(StudentMapper.class).selectStudent(student);
	}

	@Override
	public Student selectStudentApi(Student student) {
		log.debug("selectStudentApi()");
		return sqlSession.selectOne(nameSpace+".select", student);
	}

	@Override
	public Student selectStudentAnnotation(Student student) {
		log.debug("selectStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentAnnotation(student);
	}
	
	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudents()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
	}

	@Override
	public List<Student> selectStudentByAllApi() {
		log.debug("selectStudentsApi()");		
		return sqlSession.selectList(nameSpace+".list");
	}

	@Override
	public List<Student> selectStudentByAllAnnotation() {
		log.debug("selectStudentByAllAnnotation()");		
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllAnnotation();
	}

	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.getMapper(StudentMapper.class).updateStudent(student);
	}

	@Override
	public int updateStudentApi(Student student) {
		log.debug("updateStudentApi()");
		return sqlSession.update(nameSpace+".update", student);
	}

	@Override
	public int updateStudentAnnotation(Student student) {
		log.debug("updateStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).updateStudentAnnotation(student);
	}

	@Override
	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
	}

	@Override
	public int deleteStudentApi(Student student) {
		log.debug("deleteStudentApi()");
		return sqlSession.delete(nameSpace+".delete", student);
	}

	@Override
	public int deleteStudentAnnotation(Student student) {
		log.debug("deleteStudentAnnotation()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudentAnnotation(student);
	}
}
