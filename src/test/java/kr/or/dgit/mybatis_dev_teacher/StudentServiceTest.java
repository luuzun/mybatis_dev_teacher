package kr.or.dgit.mybatis_dev_teacher;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
	public void testInsertStudentAnnotation() {
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		Student student = new Student(5, "leegyomin4", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		int res = studentService.insertStsudentAnnotation(student);
		Assert.assertEquals(1, res);
	}*/
	
/*	@Test
	public void testSelectStudentAnnotation(){
		Student student = new Student();
		student.setStudId(1);
		Student selectStudent = studentService.selectStudentAnnotation(student);
		Assert.assertEquals(student, selectStudent);
	}
	
	
	@Test
	public void testSelectStudentByAllAnnotation(){
		List<Student> lists = studentService.selectStudentByAllAnnotation();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test
	public void testUpdateStudentAnnotation(){
		Student searchStd = new Student();
		searchStd.setStudId(6);	
		Student student = studentService.selectStudentAnnotation(searchStd);	
		student.setPhone(new PhoneNumber("010-2222-2222"));
		int res = studentService.updateStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}

	@Test
	public void testDeleteStudentAnnotation(){
		Calendar newDate = GregorianCalendar.getInstance();
		newDate.set(1990, 2, 28);
		
		Student insStd = new Student(5, "leegyomin", "lee@test.co.kr", newDate.getTime(), new PhoneNumber("010-1234-1234"));
		studentService.insertStsudentAnnotation(insStd);
		
		Student student = new Student();
		student.setStudId(5);
		int res = studentService.deleteStudentAnnotation(student);
		Assert.assertEquals(1, res);
	}
	
	@Test
	public void testSelectStudentByAllForResults(){
		List<Student> lists = studentService.selectStudentByAllForResults();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
	
	@Test
	public void testSelectStudentByAllForResultsMap(){
		List<Map<String, Object>> lists = studentService.selectStudentByAllForResultsMap();
		List<Map<String, Object>> emptyList = Collections.emptyList();
		for(Map<String, Object>map : lists){
			for(Entry<String, Object>entry : map.entrySet()){
				System.out.printf("%s -> %s%n", entry.getKey(), entry.getValue());
			}
		}
		Assert.assertNotEquals(emptyList, lists);
	}*/
	
	@Test
	public void testSelectStudentByAllForMapper(){
		List<Student> lists = studentService.selectStudentByAllForMapper();
		List<Student> emptyList = Collections.emptyList();
		Assert.assertNotEquals(emptyList, lists);
	}
}
