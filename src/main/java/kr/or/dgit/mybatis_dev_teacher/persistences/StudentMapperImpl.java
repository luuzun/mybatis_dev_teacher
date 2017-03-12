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

	public int insertStudentApi(Student student){
		log.debug("insertStudentApi()");
		return sqlSession.insert(nameSpace+".insert", student);
	}

	@Override
	public Student selectStudentApi(Student student) {
		log.debug("selectStudentApi()");
		return sqlSession.selectOne(nameSpace+".select", student);
	}

	@Override
	public List<Student> selectStudentByAllApi() {
		log.debug("selectStudentsApi()");		
		return sqlSession.selectList(nameSpace+".list");
	}

	@Override
	public int updateStudentApi(Student student) {
		log.debug("updateStudentApi()");
		return sqlSession.update(nameSpace+".update", student);
	}

	@Override
	public int deleteStudentApi(Student student) {
		log.debug("deleteStudentApi()");
		return sqlSession.delete(nameSpace+".delete", student);
	}

}
