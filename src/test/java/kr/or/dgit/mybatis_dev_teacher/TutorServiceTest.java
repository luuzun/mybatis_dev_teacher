package kr.or.dgit.mybatis_dev_teacher;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_teacher.dto.Tutor;
import kr.or.dgit.mybatis_dev_teacher.services.TutorService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //이름순으로 실행
public class TutorServiceTest {
	private static TutorService tutorService;
	
	@BeforeClass	//StudentServiceTest가 실행되기 전 동작
	public static void setUpBeforeClass() throws Exception {
		tutorService = TutorService.getInstance();
	}

	@AfterClass		//StudentServiceTest가 실행된 후 동작
	public static void tearDownAfterClass() throws Exception {
		tutorService = null;
	}
	

	@Test
	public void cTestSelectStudent(){
		Tutor tutor = tutorService.selectTutorForTutorId(1);
		Assert.assertNotNull(tutor);
	}
	
}
