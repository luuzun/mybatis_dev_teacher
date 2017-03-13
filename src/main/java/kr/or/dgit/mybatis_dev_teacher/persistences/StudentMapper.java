package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	
	Student selectStudentByNo(Student student);
	List<Student> selectStudentByAll();
	
	Student selectStudentByNoAPI(Student student);
	List<Student> selectStudentByAllAPI();
	
	@Select("select STUD_ID, NAME, EMAIL, PHONE, DOB from students where stud_id=#{studId}")
	Student selectStudentByNoANNOTATION(Student student);
	
	@Select("select STUD_ID, NAME, EMAIL, PHONE, DOB from students")
	List<Student> selectStudentByAllANNOTATION();
	
	
	int insertStudent(Student student);
	int insertStudentAPI(Student student);
	@Insert("INSERT INTO STUDENTS(STUD_ID, NAME, EMAIL, PHONE, DOB) "
			+ "VALUES(#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	int insertStudentANNOTATION(Student student);
	
	@Insert("INSERT INTO STUDENTS(STUD_ID, NAME, EMAIL, PHONE, DOB) "
			+ "VALUES(#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	@Options(useGeneratedKeys=true, keyProperty="studId")
	int insertStudentAutoIncANNOTATION(Student student);
	int insertStudentAutoInc(Student student);
	
	
	int updateStudent(Student student);
	
	int deleteStudent(Student student);

	
	// join
	
	
	// Dynamic
}
