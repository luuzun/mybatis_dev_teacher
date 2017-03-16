package kr.or.dgit.mybatis_dev_teacher.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.UserPicMapper;
import kr.or.dgit.mybatis_dev_teacher.dao.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class UserPicService {
	
	public UserPic findUserPicById(int id) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			UserPic userPic =  userPicMapper.selectUserPicById(id);
			sqlSession.commit();
			return userPic;
		}
	}

	public int insertUserPic(UserPic userPic) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
}











