package kr.or.dgit.mybatis_dev_teacher.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public class TutorProvider {

	public String selectAllTutorsProv() {
		return new SQL() {
			{
				SELECT("tutor_id, name, email, phone, dob");
				FROM("tutors");
			}
		}.toString();
	}

	public String selectTutorProv(Map<String, Object> param) {
		return new SQL() {
			{
				SELECT("tutor_id, name, email, phone, dob");
				FROM("tutors");
				if (param != null) {
					WHERE("tutor_Id=#{tutorId}");
				}
			}
		}.toString();
	}

	public String selectTutorByJoinProv(Map<String, Object> param) {
		return new SQL() {
			{
				SELECT("t.tutor_id, t.name as tutor_name, email");
				SELECT("a.addr_id, street, city, state, zip, country");
				SELECT("course_id, c.name as course_name, description, start_date, end_date");
				FROM("TUTORS t");
				LEFT_OUTER_JOIN("addresses a on t.addr_id=a.addr_id");
				LEFT_OUTER_JOIN("courses c on t.tutor_id=c.tutor_id");
				if (param != null) {
					if (param.get("tutorId") != null) {
						WHERE("t.tutor_id=#{tutorId}");
					}
					if (param.get("addrId") != null) {
						WHERE("t.addr_id=#{addrId}");
					}
				}
			}
		}.toString();
	}

	public String insertTutor(Tutor tutor) {
		return new SQL() {
			{
				INSERT_INTO("TUTORS");
				if (tutor.getName() != null) {
					VALUES("NAME", "#{name}");
				}
				if (tutor.getEmail() != null) {
					VALUES("EMAIL", "#{email}");
				}
			}
		}.toString();
	}

	public String updateTutor(Tutor tutor) {
		return new SQL() {
			{
				UPDATE("TUTORS");
				if (tutor.getName() != null) {
					SET("NAME=#{name}");
				}
				if (tutor.getEmail() != null) {
					SET("EMAIL=#{email}");
				}
				WHERE("TUTOR_ID=#{tutorId}");
			}
		}.toString();
	}

    public String deleteTutor(Tutor tutor) {
        return new SQL() {
            {
                DELETE_FROM("TUTORS");
                WHERE("TUTOR_ID=#{tutorId}");
            }
        }.toString();
    }

}
