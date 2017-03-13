package kr.or.dgit.mybatis_dev_teacher;

import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.mybatis_dev_teacher.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}

	@Before
	public void setUp(){
		System.out.println("setUp()");
	}
	
	@After
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
	@Test
	public void aTestFindStudentByNo() {
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNo(std);
		Assert.assertNotNull(findStd);
	}

	@Test
	public void bTestFindStudentByNoApi(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoApi(std);
		Assert.assertNotNull(findStd);
	}
	
	@Test
	public void cTestFindStudentByNoAnnotation(){
		Student std = new Student();
		std.setStudId(1);
		
		Student findStd = studentService.findStudentByNoAnnotation(std);
		Assert.assertNotNull(findStd);
	}
	@Test
	public void dTestFindStudentByAll(){
		List<Student> list = studentService.findStudentByAll();
		Assert.assertNotEquals(Collections.emptyList(), list);
	}
	@Test
	public void eTestFindStudentByAllApi(){
		List<Student> list = studentService.findStudentByAllApi();
		Assert.assertNotEquals(Collections.emptyList(), list);
	}
	@Test
	public void fTestFindStudentByAllAnnotation(){
		List<Student> list = studentService.findStudentByAllAnnotation();
		Assert.assertNotEquals(Collections.emptyList(), list);
	}
	
	
	@Test
	public void gTestRegisterStudentByAll(){
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(1990, 01, 01);
		
		Student student = new Student(3, "이교민", "lgm1@test.co.kr", cal.getTime(), new PhoneNumber("000-0000-0000"));
		
		int res = studentService.registerStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void hTestRegisterStudentByAllApi(){
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(1990, 01, 01);
		
		Student student = new Student(4, "조시은", "lgm1@test.co.kr", cal.getTime(), new PhoneNumber("111-1111-1111"));
		
		int res = studentService.registerStudentApi(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void iTestRegisterStudentByAllAnnotation(){
		Calendar cal = GregorianCalendar.getInstance();
		cal.set(1990, 01, 01);
		
		Student student = new Student(5, "황인영", "lgm1@test.co.kr", cal.getTime(), new PhoneNumber("222-2222-2222"));
		
		int res = studentService.registerStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	
	
	////////////////////////////////////////////////////
	@Test
	public void jTestUpdateStudent(){
		
		Student student = new Student(3, "이교민2", "lgm1@test.co.kr", new Date(), new PhoneNumber("444-4444-4444"));
		
		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void kTestUpdateStudentApi(){
		
		Student student = new Student(4, "조시은2", "lgm1@test.co.kr", new Date(), new PhoneNumber("555-5555-5555"));
		
		int res = studentService.updateStudentApi(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void lTestUpdateStudentAnnotation(){
		
		Student student = new Student(5, "황인영2", "lgm1@test.co.kr", new Date(), new PhoneNumber("666-6666-6666"));
		
		int res = studentService.updateStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	
	////////////////////////////////////////////////////
	@Test
	public void mTestRemoveStudent(){
		
		Student student = new Student();
		student.setStudId(3);
		
		int res = studentService.removeStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void nTestRemoveStudentApi(){
		
		Student student = new Student();
		student.setStudId(4);
		
		int res = studentService.removeStudentApi(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void oTestRemoveStudentAnnotation(){
		
		Student student = new Student();
		student.setStudId(5);
		
		int res = studentService.removeStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
}
