package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;

public class TutorMapperImpl implements TutorMapper {
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(TutorMapperImpl.class);
	
	public TutorMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public Tutor findTutorById(int id) {
		log.debug("findTutorById()");
		return sqlSession.getMapper(TutorMapper.class).findTutorById(id);
	}

}
