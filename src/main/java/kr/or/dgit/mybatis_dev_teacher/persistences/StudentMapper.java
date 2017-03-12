package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {

	int insertStudentApi(Student student);

	Student selectStudentApi(Student student);

	List<Student> selectStudentByAllApi();

	int updateStudentApi(Student student);

	int deleteStudentApi(Student student);

}
