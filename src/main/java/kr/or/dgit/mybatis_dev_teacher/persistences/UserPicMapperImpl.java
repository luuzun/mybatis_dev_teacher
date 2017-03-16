package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;

public class UserPicMapperImpl implements UserPicMapper {
	private SqlSession sqlSession;
	
	private static final Log log = LogFactory.getLog(UserPicMapperImpl.class);
	private String namespace = "kr.or.dgit.mybatis_dev_teacher.mappers.UserPicMapper.";
	
	public UserPicMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public int insertUserPic(UserPic userPic) {
		log.debug("insertUserPic()");
		return sqlSession.insert(namespace+"insertUserPic", userPic);
	}

	@Override
	public UserPic getUserPic(int id) {
		log.debug("getUserPic()");
		return sqlSession.selectOne(namespace+"getUserPic", id);
	}

	@Override
	public int insertUserPicAnnotation(UserPic userPic) {
		log.debug("insertUserPicAnnotation()");
		return sqlSession.getMapper(UserPicMapper.class).insertUserPicAnnotation(userPic);
	}

	@Override
	public UserPic getUserPicAnnotation(int id) {
		log.debug("getUserPicAnnotation()");
		return sqlSession.getMapper(UserPicMapper.class).getUserPicAnnotation(id);
	}
	
	@Override
	public int insertUserPicProv(UserPic userPic) {
		log.debug("insertUserPicProv()");
		return sqlSession.getMapper(UserPicMapper.class).insertUserPicProv(userPic);
	}

	@Override
	public UserPic getUserPicProv(UserPic userPic) {
		log.debug("getUserPicProv()");
		return sqlSession.getMapper(UserPicMapper.class).getUserPicProv(userPic);
	}



}
