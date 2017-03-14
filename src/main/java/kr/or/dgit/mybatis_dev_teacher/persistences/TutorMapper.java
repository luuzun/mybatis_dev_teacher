package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public interface TutorMapper {
	
	@Select("SELECT TUTOR_ID, NAME AS TUTOR_NAME, EMAIL, ADDR_ID FROM TUTORS WHERE TUTOR_ID=#{tutorId}")
    @Results({
        @Result(id=true, column="tutor_id", property="tutorId"),
        @Result(column="tutor_name", property="name"),
        @Result(column="email", property="email"),
        @Result(property="address", column="addr_id", 
        one=@One(select="kr.or.dgit.mybatis_dev_teacher.persistences.AddressMapper.selectAddressById")),
        @Result(property="courses", column="tutor_id",
        many=@Many(select="kr.or.dgit.mybatis_dev_teacher.persistences.CourseMapper.selectCoursesByTutorId"))
    })
    Tutor selectTutorById(int tutorId);

    @Select("SELECT T.TUTOR_ID, T.NAME AS TUTOR_NAME, EMAIL, A.ADDR_ID, STREET, CITY, STATE, ZIP, "
            +      "COUNTRY, COURSE_ID, C.NAME, DESCRIPTION, START_DATE, END_DATE "
            + "FROM TUTORS T LEFT JOIN ADDRESSES A ON T.ADDR_ID=A.ADDR_ID "
            +      "LEFT JOIN COURSES C ON T.TUTOR_ID=C.TUTOR_ID "
            + "WHERE T.TUTOR_ID=#{tutorId}")
    @ResultMap("kr.or.dgit.mybatis_dev_teacher.mappers.TutorMapper.TutorWithAddressAndCourseResult")
    Tutor selectTutorByIdForResultMap(int tutorId);

}
