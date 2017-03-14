package kr.or.dgit.mybatis_dev_teacher;

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
	
	@Test
	public void testSelectTutorByIdForResultMap(){
		Tutor tutor = tutorService.selectTutorByIdForResultMap(1);
		Assert.assertNotNull(tutor);
	}
}
