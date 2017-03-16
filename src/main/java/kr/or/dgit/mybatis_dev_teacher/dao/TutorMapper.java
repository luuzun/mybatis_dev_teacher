package kr.or.dgit.mybatis_dev_teacher.dao;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public interface TutorMapper {
	Tutor findTutorById(Tutor tutor);
	int insertTutor(Tutor tutor);
}
