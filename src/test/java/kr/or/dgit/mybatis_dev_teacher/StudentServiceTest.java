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
	public void testInsertStudentApi() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		System.out.println(newDate);
		Student student = new Student(4, "leegyomin4", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentApi(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testInsertStudentAnnotation() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		Student student = new Student(5, "leegyomin4", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStsudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testSelectStudent(){
		Student student = new Student();
		student.setStudId(3);
		
		Student selectStudent = studentService.selectStudent(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testSelectStudentApi(){
		Student student = new Student();
		student.setStudId(3);
		Student selectStudent = studentService.selectStudentApi(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testSelectStudentAnnotation(){
		Student student = new Student();
		student.setStudId(3);
		Student selectStudent = studentService.selectStudentAnnotation(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testSelectStudentByAll(){
		List<Student> lists = studentService.selectStudentByAll();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test
	public void testSelectStudentByAllApi(){
		List<Student> lists = studentService.selectStudentByAllApi();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test
	public void testSelectStudentByAllAnnotation(){
		List<Student> lists = studentService.selectStudentByAllAnnotation();
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
	public void testUpdateStudentApi(){
		Student searchStd = new Student();
		searchStd.setStudId(6);	
		Student student = studentService.selectStudent(searchStd);	
		student.setPhone(new PhoneNumber("010-1111-1111"));
		int res = studentService.updateStudentApi(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testUpdateStudentAnnotation(){
		Student searchStd = new Student();
		searchStd.setStudId(6);	
		Student student = studentService.selectStudent(searchStd);	
		student.setPhone(new PhoneNumber("010-2222-2222"));
		int res = studentService.updateStudentAnnotation(student);
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
	
	@Test
	public void testDeleteStudentApi(){
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student insStd = new Student(4, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		studentService.insertStudent(insStd);
		
		Student student = new Student();
		student.setStudId(4);
		int res = studentService.deleteStudentApi(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDeleteStudentAnnotation(){
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student insStd = new Student(5, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		studentService.insertStudent(insStd);
		
		Student student = new Student();
		student.setStudId(5);
		int res = studentService.deleteStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
}
