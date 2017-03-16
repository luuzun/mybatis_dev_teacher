package kr.or.dgit.mybatis_dev_teacher.services;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;
import kr.or.dgit.mybatis_dev_teacher.persistences.UserPicMapper;
import kr.or.dgit.mybatis_dev_teacher.persistences.UserPicMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class UserPicService {
	
	public int insertUserPic(UserPic userPic){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPic(userPic);
			sqlSession.commit();
			return res;
		}
	}
	
	public UserPic getUserPic(int id){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			return userPicMapper.getUserPic(id);
		}
	}
	
	public int insertUserPicAnnotation(UserPic userPic){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res =  userPicMapper.insertUserPicAnnotation(userPic);
			sqlSession.commit();
			return res;
		}
	}
	
	public UserPic getUserPicAnnotation(int id){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			return userPicMapper.getUserPicAnnotation(id);
		}
	}
    

    public int insertUserPicProv(UserPic userPic){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			int res = userPicMapper.insertUserPicProv(userPic);
			sqlSession.commit();
			return res;
		}
    }
    
    public UserPic getUserPicProv(UserPic userPic){
		try (SqlSession sqlSession = MybatisSqlSessionFactory.getSqlSessionFactory().openSession();) {
			UserPicMapper userPicMapper = new UserPicMapperImpl(sqlSession);
			return userPicMapper.getUserPicProv(userPic);
		}
    }
}
