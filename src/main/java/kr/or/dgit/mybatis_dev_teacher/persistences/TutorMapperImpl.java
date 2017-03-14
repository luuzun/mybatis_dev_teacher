package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public class TutorMapperImpl implements TutorMapper{
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(TutorMapperImpl.class);
	
	public TutorMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public Tutor selectTutorById(int tutorId) {
		log.debug("selectTutorById()");
		return sqlSession.getMapper(TutorMapper.class).selectTutorById(tutorId);
	}

	@Override
	public Tutor selectTutorByIdForResultMap(int tutorId) {
		log.debug("selectTutorByIdForMap()");
		return sqlSession.getMapper(TutorMapper.class).selectTutorByIdForResultMap(tutorId);
	}
}
