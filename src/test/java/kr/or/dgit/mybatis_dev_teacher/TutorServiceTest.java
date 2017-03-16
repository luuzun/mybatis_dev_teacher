package kr.or.dgit.mybatis_dev_teacher;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_teacher.dto.Gender;
import kr.or.dgit.mybatis_dev_teacher.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.services.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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

	///////////////////////////////////////////////////
	
	/*@Test 
	public void aTestFindTutorById(){
		Tutor tutor = new Tutor();
		tutor.setTutorId(1);
		
		Tutor selectTutor = tutorService.findTutorById(tutor);
		Assert.assertNotNull(selectTutor);
	}*/
	
/*	@Test 
	public void aTestInsertTutor(){
		Tutor tutor = new Tutor(5, "teacher", "teacher@test.co.kr", new PhoneNumber("111-1111-1111"), Gender.MALE);
		
		int res = tutorService.insertTutor(tutor);
		Assert.assertEquals(1, res);
	}*/
	
}

















