package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public class StudentMapperImpl implements StudentMapper{
	private SqlSession sqlSession;
	
	private String namespace="kr.or.dgit.mybatis_dev_teacher.persistences.StudentMapper";
	
	private static final Log log = LogFactory.getLog(StudentMapperImpl.class);
	
	public StudentMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	//////////////// select ////////////////////
	@Override
	public Student selectStudentByNo(Student student) {
		log.debug("selectStudentByNo()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByNo(student);
	}


	@Override
	public List<Student> selectStudentByAll() {
		log.debug("selectStudentByAll()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAll();
	}
	
	@Override
	public Student selectStudentByNoAPI(Student student) {
		log.debug("selectStudentByNoAPI()");
		return sqlSession.selectOne(namespace + ".selectOne", student);
	}

	@Override
	public List<Student> selectStudentByAllAPI() {
		log.debug("selectStudentByAllAPI()");
		return sqlSession.selectList(namespace + ".selectList");
	}
	

	@Override
	public Student selectStudentByNoANNOTATION(Student student) {
		log.debug("selectStudentByNoANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByNoANNOTATION(student);
	}

	@Override
	public List<Student> selectStudentByAllANNOTATION() {
		log.debug("selectStudentByAllANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).selectStudentByAllANNOTATION();
	}
	
	//////////////// insert ////////////////////
	
	@Override
	public int insertStudent(Student student){
		log.debug("insertStudent()");
		return sqlSession.getMapper(StudentMapper.class).insertStudent(student);
    }
	
	@Override
	public int insertStudentAPI(Student student) {
		log.debug("insertStudentAPI()");
		return sqlSession.insert(namespace+".insert", student);
	}

	@Override
	public int insertStudentANNOTATION(Student student) {
		log.debug("insertStudentANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).insertStudentANNOTATION(student);
	}
	
	@Override
	public int insertStudentAutoIncANNOTATION(Student student) {
		log.debug("insertStudentAutoIncANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).insertStudentAutoIncANNOTATION(student);
	}
	
	@Override
	public int insertStudentAutoInc(Student student) {
		log.debug("insertStudentAutoInc()");
		return sqlSession.getMapper(StudentMapper.class).insertStudentAutoInc(student);
	}
	

	
	//////////////// update ////////////////////
	
	@Override
	public int updateStudent(Student student) {
		log.debug("updateStudent()");
		return sqlSession.getMapper(StudentMapper.class).updateStudent(student);
	}

	@Override
	public int updateStudentAPI(Student student) {
		log.debug("updateStudentAPI()");
		return sqlSession.update(namespace+".update", student);
	}

	@Override
	public int updateStudentANNOTATION(Student student) {
		log.debug("updateStudentANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).updateStudentANNOTATION(student);
	}
	
	
	//////////////// delete ////////////////////
	@Override
	public int deleteStudent(Student student) {
		log.debug("deleteStudent()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudent(student);
	}

	@Override
	public int deleteStudentAPI(Student student) {
		log.debug("deleteStudentAPI()");
		return sqlSession.delete(namespace+".delete", student);
	}

	@Override
	public int deleteStudentANNOTATION(Student student) {
		log.debug("deleteStudentANNOTATION()");
		return sqlSession.getMapper(StudentMapper.class).deleteStudentANNOTATION(student);
	}












}
