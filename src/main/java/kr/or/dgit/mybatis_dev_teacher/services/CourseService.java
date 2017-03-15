package kr.or.dgit.mybatis_dev_teacher.services;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.mybatis_dev_teacher.dao.CourseMapper;
import kr.or.dgit.mybatis_dev_teacher.dao.CourseMapperImpl;
import kr.or.dgit.mybatis_dev_teacher.dto.Course;
import kr.or.dgit.mybatis_dev_teacher.util.MybatisSqlSessionFactory;

public class CourseService {
	
	public List<Course> searchCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchCourse(param);
		}
	}
	
	public List<Course> searchChooseCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchChooseCourse(param);
		}
	}
	
	public List<Course> searchWhereCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchWhereCourse(param);
		}
	}
	
	public List<Course> searchTrimCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchTrimCourse(param);
		}
	}
	
	public List<Course> searchForeachCourse(Map<String, Object> param){
		try(SqlSession sqlSession = MybatisSqlSessionFactory.openSession();){
			CourseMapper courseMapper = new CourseMapperImpl(sqlSession);
			return courseMapper.searchForeachCourse(param);
		}
	}
}











