package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import kr.or.dgit.mybatis_dev_teacher.dto.Student;

public interface StudentMapper {
	@Insert("INSERT INTO STUDENTS(STUD_ID, NAME, EMAIL, PHONE, DOB) VALUES(#{studId}, #{name}, #{email}, #{phone}, #{dob})")
	int insertStsudentAnnotation(Student student);
	
	@Select("SELECT STUD_ID AS STUDID, NAME, EMAIL, PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
	Student selectStudentAnnotation(Student student);

	@Select("SELECT * FROM STUDENTS")
	List<Student> selectStudentByAllAnnotation();
	
	@Update("UPDATE STUDENTS SET NAME=#{name}, EMAIL=#{email}, PHONE=#{phone} WHERE STUD_ID=#{studId}")
	int updateStudentAnnotation(Student student);
	
	@Delete("Delete From Students where  STUD_ID=#{studId}")
	int deleteStudentAnnotation(Student student);
	
	@Select("SELECT * FROM STUDENTS")
    @Results({
        @Result (id=true, column="stud_id", property="studId"),
        @Result (column="name", property="name"),
        @Result (column="email", property="email"),
        @Result (column="phone", property="phone"),
        @Result (column="dob", property="dob"),
        @Result (column="gender", property="gender"),
        @Result (column="addr_id", property="address.addrId")        
    })
    List<Student> selectStudentByAllForResults();

	@Select("SELECT * FROM STUDENTS")
    @Results({
        @Result (id=true, column="stud_id", property="studId"),
        @Result (column="name", property="name"),
        @Result (column="email", property="email"),
        @Result (column="phone", property="phone"),
        @Result (column="dob", property="dob"),
        @Result (column="gender", property="gender"),
        @Result (column="addr_id", property="address.addrId")        
    })
    List<Map<String,Object>> selectStudentByAllForResultsMap();
	
	@Select("SELECT * FROM STUDENTS")
    @ResultMap("kr.or.dgit.mybatis_dev_teacher.mappers.StudentMapper.StudentResult")
    List<Student> selectStudentByAllForMapper();

}
