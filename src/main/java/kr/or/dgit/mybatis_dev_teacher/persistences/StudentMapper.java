package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	
	Student selectStudent(Student student);

	List<Student> selectStudentByAll();
	
	int updateStudent(Student student);
	
	int deleteStudent(Student student);

}
