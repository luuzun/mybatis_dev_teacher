package kr.or.dgit.mybatis_dev_teacher.dao;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public class TutorMapperImpl implements TutorMapper {
	private String namespace = "kr.or.dgit.mybatis_dev_teacher.dao.TutorMapper.";
	private static final Log log = LogFactory.getLog(TutorMapperImpl.class);

	private SqlSession sqlSession;

	public TutorMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Tutor findTutorById(Tutor tutor) {
		log.debug("findTutorById()");
		return sqlSession.selectOne(namespace + "findTutorById", tutor);
	}

	@Override
	public int insertTutor(Tutor tutor) {
		log.debug("insertTutor()");
		return sqlSession.insert(namespace + "insertTutor", tutor);
	}

}
