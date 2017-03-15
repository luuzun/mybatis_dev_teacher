package kr.or.dgit.mybatis_dev_teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev_teacher.dto.Course;
import kr.or.dgit.mybatis_dev_teacher.services.CourseService;

public class CourseServiceTest {
	private static CourseService courseService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		courseService = new CourseService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		courseService = null;
	}

	///////////////////////////////////////////////////
	
/*	@Test 
	public void aTestSearchCourse(){
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("courseName", "%java%");
		param.put("startDate", "2013-01-01");
		param.put("endDate", "2013-05-01");
		
		List<Course> searchCourse = courseService.searchCourse(param);
		Assert.assertNotNull(searchCourse);
	}*/
	
/*	@Test 
	public void testSearchChooseCourse(){
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);
		param.put("searchBy", "Tutor");
		
		List<Course> searchCourse = courseService.searchChooseCourse(param);
		Assert.assertNotNull(searchCourse);
		
		param.replace("searchBy", "CourseName");
		param.remove("tutorId");
		param.put("courseName", "%java%");
		searchCourse = courseService.searchChooseCourse(param);

		param.remove("searchBy");
		param.remove("courseName");
		searchCourse = courseService.searchChooseCourse(param);
	}*/
	
/*	@Test 
	public void testSearchChooseCourse(){
		Map<String, Object> param = new HashMap<>();
		param.put("tutorId", 1);//1개 조건
		
		List<Course> searchCourse = courseService.searchWhereCourse(param);
		Assert.assertNotNull(searchCourse);
		
		param.put("courseName", "%java%"); //2 개 조건
		searchCourse = courseService.searchWhereCourse(param);
		
		param.remove("courseName");// 조건이 없는 경우
		param.remove("tutorId");
		searchCourse = courseService.searchWhereCourse(param);
		
		param.put("endDate", "2013-05-01");//조건 1개
		searchCourse = courseService.searchWhereCourse(param);
	}*/
	
/*	@Test 
	public void testSearchTrimCourse(){
		Map<String, Object> param = new HashMap<>();
		System.out.println("조건 없음");
		List<Course> searchCourse = courseService.searchTrimCourse(param);
		Assert.assertNotNull(searchCourse);
		
		param.put("tutorId", 1);//1개 조건
		System.out.println("1개 조건-tutorId");
		searchCourse = courseService.searchTrimCourse(param);
		Assert.assertNotNull(searchCourse);
		
		param.remove("tutorId");
		param.put("courseName", "%java%"); //1 개 조건
		System.out.println("1개 조건-courseName");
		searchCourse = courseService.searchWhereCourse(param);
		
		param.put("tutorId", 1);// 2조건
		System.out.println("2개 조건-tutorId, courseName");
		searchCourse = courseService.searchWhereCourse(param);
		
	}*/
	
/*	@Test 
	public void testSearchForeachCourse(){
		Map<String, Object> param = null;
		List<Course> searchCourse = courseService.searchForeachCourse(param);
		
        List<Integer> tutorIds = new ArrayList<Integer>();
        tutorIds.add(2);
        
        param = new HashMap<String, Object>();
        param.put("tutorIds", tutorIds);
        
  		searchCourse = courseService.searchForeachCourse(param);
			
  		tutorIds.add(1);
  		searchCourse = courseService.searchForeachCourse(param);
		Assert.assertNotNull(searchCourse);
	}*/
}

















