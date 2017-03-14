package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;
import java.util.Map;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	int insertStudentAutoInc(Student student);
	
	Student selectStudent(Student student);
	List<Student> selectStudentByAll();
	
	int updateStudent(Student student);
	int deleteStudent(Student student);
	
	//resultset
	List<Student> selectStudentByAllForResutlMap();
	
	List<Map<String, Object>> selectStudentByAllForHashMap();
	
	Student selectStudentByNoForResultMapExtends(Student student);
	
	Student selectStudentByNoWithAddressForAssociation(Student student);
}
