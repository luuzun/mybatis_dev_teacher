package kr.or.dgit.mybatis_dev_teacher;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.mybatis_dev_teacher.dto.PhoneNumber;
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.services.StudentService;

public class StudentServiceTest {
	private static StudentService studentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		studentService = new StudentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		studentService = null;
	}

/*	@Test
	public void testInsertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student(3, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	
	@Test
	public void testSelectStudent(){
		Student student = new Student();
		student.setStudId(3);
		
		Student selectStudent = studentService.selectStudent(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testSelectStudentByAll(){
		List<Student> lists = studentService.selectStudentByAll();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
*/
	@Test
	public void testUpdateStudent(){
		Student searchStd = new Student();
		searchStd.setStudId(6);	
		Student student = studentService.selectStudent(searchStd);
		student.setPhone(new PhoneNumber("010-0000-0000"));
		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDeleteStudent(){
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student insStd = new Student(3, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		studentService.insertStudent(insStd);
		
		Student student = new Student();
		student.setStudId(3);
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}
	
}
