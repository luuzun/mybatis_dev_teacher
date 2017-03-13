package kr.or.dgit.mybatis_dev_teacher;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
	public void testFindStudent(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.findStudent(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testFindStudentByAll(){
		List<Student> lists = studentService.findStudentByAll();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test
	public void testFindStudentAPI(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.findStudentAPI(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testFindStudentByAllAPI(){
		List<Student> lists = studentService.findStudentByAllAPI();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}

	
	@Test
	public void testFindStudentANNOTATION(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.findStudentANNOTATION(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	@Test
	public void testFindStudentByAllANNOTATION(){
		List<Student> lists = studentService.findStudentByAllANNOTATION();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}

	
	@Test
	public void testInsertStudent() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student(3, "홍길동3", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentAPI() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 3, 28);
		
		Student student = new Student(4, "홍길동4", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentANNOTATION() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 4, 28);
		
		Student student = new Student(5, "홍길동5", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStudentANNOTATION(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentAutoInc() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student();
		student.setName("홍길동3");
		student.setEmail("lee3@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res = studentService.insertStudentAutoInc(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testInsertStudentANNOTATION() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student student = new Student();
		student.setName("홍길동4");
		student.setEmail("lee4@test.co.kr");
		student.setDob(newDate.getTime());
		student.setPhone(new PhoneNumber("010-1234-1234"));
		
		int res = studentService.insertStudentAutoIncANNOTATION(student);
		Assert.assertEquals(1, res);
	}

	
	@Test
	public void testUpdateStudent(){
		Student student = new Student();
		student.setStudId(3);
		student.setName("3홍길동3");
		student.setEmail("3lee3@test.co.kr");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("010-3333-3333"));

		int res = studentService.updateStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testUpdateStudentAPI(){
		Student student = new Student();
		student.setStudId(4);
		student.setName("4홍길동4");
		student.setEmail("4lee4@test.co.kr");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("010-4444-4444"));
		int res = studentService.updateStudentAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testUpdateStudentANNOTATION(){
		Student student = new Student();
		student.setStudId(5);
		student.setName("5홍길동5");
		student.setEmail("5lee5@test.co.kr");
		student.setDob(new Date());
		student.setPhone(new PhoneNumber("010-5555-5555"));
		
		int res = studentService.updateStudentANNOTATION(student);
		Assert.assertEquals(1, res);
	}
	*/

	@Test
	public void testDeleteStudent(){
		Student student = new Student();
		student.setStudId(3);
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDeleteStudentAPI(){
		Student student = new Student();
		student.setStudId(4);
		int res = studentService.deleteStudentAPI(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testDeleteStudentANNOTATION(){
		Student student = new Student();
		student.setStudId(5);
		int res = studentService.deleteStudentANNOTATION(student);
		Assert.assertEquals(1, res);
	}
		
}
