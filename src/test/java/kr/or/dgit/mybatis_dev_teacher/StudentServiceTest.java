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

@FixMethodOrder(MethodSorters.NAME_ASCENDING) //이름순으로 실행
public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass	//StudentServiceTest가 실행되기 전 동작
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
		studentService = StudentService.getInstance();
	}

	@AfterClass		//StudentServiceTest가 실행된 후 동작
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
		studentService = null;
	}

	@Before			// test메서드 실행 전 수행
	public void setUp(){
		System.out.println("setUp()");
	}
	
	@After			// test메서드 실행 후 수행
	public void tearDown(){
		System.out.println("tearDown()");
	}
	
	@Test
	public void aTestInsertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student(3, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void bTestSelectStudent(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.selectStudent(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void cTestSelectStudentByAll(){
		List<Student> lists = studentService.selectStudentByAll();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	

	@Test
	public void dTestUpdateStudent(){
		Student student = new Student();
		student.setStudId(3);	
		student.setName("홍길동");
		student.setDob(new Date());

		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void fTestDeleteStudent(){
		Student student = new Student();
		student.setStudId(3);
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}
	
}
