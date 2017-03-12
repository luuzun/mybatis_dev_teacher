package kr.or.dgit.mybatis_dev_teacher.persistences;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	int insertStudentApi(Student student);
}
