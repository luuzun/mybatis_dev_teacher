package kr.or.dgit.mybatis_dev_teacher.persistences;

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
	public Student selectStudent(Student student) {
		log.debug("selectStudent()");
		return sqlSession.getMapper(StudentMapper.class).selectStudent(student);
	}

	@Override
	public Student selectStudentApi(Student student) {
		log.debug("selectStudentApi()");
		return sqlSession.selectOne(nameSpace+".select", student);
	}
}
