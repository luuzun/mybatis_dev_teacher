package kr.or.dgit.mybatis_dev_teacher.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	Student selectStudentByNo(Student student);
	Student selectStudentByNoApi(Student student);
	
	@Select("select stud_id, name, email, phone, dob from students where stud_id = #{studId}")
	Student selectStudentByNoAnnotation(Student student);
	
	List<Student> selectStudentByAll();
	List<Student> selectStudentByAllApi();
	@Select("select stud_id, name, email, phone, dob from students")
	List<Student> selectStudentByAllAnnotation();
	
	int insertStudent(Student student);
	int insertStudentApi(Student student);
	@Insert("insert into students(stud_id, name, email, phone, dob) values (#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	int insertStudentAnnotation(Student student);
	
	int updateStudent(Student student);
	int updateStudentApi(Student student);
	@Update("update students set name=#{name}, email=#{email}, phone=#{phone}, dob=#{dob} where stud_id = #{studId}")
	int updateStudentAnnotation(Student student);
	
	int deleteStudent(Student student);
	int deleteStudentApi(Student student);
	@Update("delete from students where stud_id=#{studId}")
	int deleteStudentAnnotation(Student student);
}
