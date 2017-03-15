package kr.or.dgit.mybatis_dev_teacher;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.services.TutorService;

public class TutorServiceTest {
	private static TutorService tutorService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		tutorService = new TutorService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}
	
/*	@Test
	public void testSelectTutorById(){
		Tutor tutor = tutorService.selectTutorById(1);
		Assert.assertNotNull(tutor);
	}*/
	
/*	@Test
	public void testSelectTutorByIdForResultMap(){
		Tutor tutor = tutorService.selectTutorByIdForResultMap(1);
		Assert.assertNotNull(tutor);
	}*/
	
/*	@Test
	public void testSelectAllTutorsProv(){
		List<Tutor> lists = tutorService.selectAllTutorsProv();
		Assert.assertNotEquals(Collections.emptyList(), lists);
	}
	
	@Test
	public void testSelectTutorProv(){
		Map<String, Object> param = null;
		List<Tutor> lists = tutorService.selectTutorProv(param);
		
		param = new HashMap<>();
		param.put("tutorId", 1);
		
		lists = tutorService.selectTutorProv(param);
		Assert.assertNotEquals(Collections.emptyList(), lists);
	}
	

	@Test
	public void testSelectTutorByJoinProv(){
		Map<String, Object> param = null;
		List<Tutor> lists = tutorService.selectTutorByJoinProv(param);
		
		param = new HashMap<>();
		param.put("tutorId", 1);
		
		lists = tutorService.selectTutorByJoinProv(param);
		
		param.put("addrId", 1);
		
		lists = tutorService.selectTutorByJoinProv(param);
		Assert.assertNotEquals(Collections.emptyList(), lists);
	}*/
	
/*	@Test
	public void testInsertTutor(){
		Tutor tutor = new Tutor(5, "홍", "hong@test.co.kr");
		int res = tutorService.insertTutor(tutor);
		Assert.assertEquals(1, res);
	}*/
	
/*	@Test
	public void testUpdateTutor(){
		Tutor tutor = new Tutor(7, "5홍5", "5hong5@test.co.kr");
		int res = tutorService.updateTutor(tutor);
		Assert.assertEquals(1, res);
	}*/
	
	@Test
	public void testDeleteTutor(){
		Tutor tutor = new Tutor();
		tutor.setTutorId(7);
		int res = tutorService.deleteTutor(tutor);
		Assert.assertEquals(1, res);
	}
}
