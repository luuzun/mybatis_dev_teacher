package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	int insertStudent(Student student);
	int insertStudentApi(Student student);
	@Insert("INSERT INTO STUDENTS(STUD_ID, NAME, EMAIL, PHONE, DOB) VALUES(#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	int insertStsudentAnnotation(Student student);
	
	Student selectStudent(Student student);
	Student selectStudentApi(Student student);
	@Select("SELECT STUD_ID AS STUDID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
	Student selectStudentAnnotation(Student student);

	List<Student> selectStudentByAll();
	List<Student> selectStudentByAllApi();
	@Select("SELECT * FROM STUDENTS")
	List<Student> selectStudentByAllAnnotation();
	
	int updateStudent(Student student);
	int updateStudentApi(Student student);
	@Update("UPDATE STUDENTS SET NAME=#{name}, EMAIL=#{email}, PHONE=#{phone} WHERE STUD_ID=#{studId}")
	int updateStudentAnnotation(Student student);
	
	int deleteStudent(Student student);
	int deleteStudentApi(Student student);
	@Delete("Delete From Students where  STUD_ID=#{studId}")
	int deleteStudentAnnotation(Student student);
	
	// join
	
	
	// Dynamic
}
