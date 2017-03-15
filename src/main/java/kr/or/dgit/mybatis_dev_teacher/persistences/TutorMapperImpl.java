package kr.or.dgit.mybatis_dev_teacher.persistences;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<Tutor> selectAllTutorsProv() {
		log.debug("selectAllTutorsProv()");
		return sqlSession.getMapper(TutorMapper.class).selectAllTutorsProv();
	}

	@Override
	public List<Tutor> selectTutorProv(Map<String, Object> param) {
		log.debug("selectTutorProv()");
		return sqlSession.getMapper(TutorMapper.class).selectTutorProv(param);
	}

	@Override
	public List<Tutor> selectTutorByJoinProv(Map<String, Object> param) {
		log.debug("selectTutorByJoinProv()");
		return sqlSession.getMapper(TutorMapper.class).selectTutorByJoinProv(param);
	}

	@Override
	public int insertTutor(Tutor tutor) {
		log.debug("insertTutor()");
		return sqlSession.getMapper(TutorMapper.class).insertTutor(tutor);
	}

	@Override
	public int updateTutor(Tutor tutor) {
		log.debug("updateTutor()");
		return sqlSession.getMapper(TutorMapper.class).updateTutor(tutor);
	}

	@Override
	public int deleteTutor(Tutor tutor) {
		log.debug("deleteTutor()");
		return sqlSession.getMapper(TutorMapper.class).deleteTutor(tutor);
	}

}
