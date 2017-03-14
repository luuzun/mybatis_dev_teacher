package kr.or.dgit.mybatis_dev_teacher.persistences;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public interface TutorMapper {
	Tutor findTutorById(int id);
}
