package kr.or.dgit.mybatis_dev_teacher;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
import kr.or.dgit.mybatis_dev_teacher.dto.Student;
import kr.or.dgit.mybatis_dev_teacher.services.StudentService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
	
/*
	@Test
	public void aTestInsertStudent(){
		Student student = new Student(3, "홍길동", "hong@test.co.kr", new Date(), new PhoneNumber("010-1111-2222"));
		student.setGender(Gender.FEMALE);
		
		int res = studentService.insertStudent(student);
		Assert.assertEquals(1, res);
	}
	@Test
	public void bTestUpdateSetStudent(){
		Student student = new Student(3, "3홍길동3", "3hong3@test.co.kr", new Date(), new PhoneNumber("010-3333-4444"));
		int res = studentService.updateSetStudent(student);
		Assert.assertEquals(1, res);
		
		student.setStudId(3);
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		System.out.println(selectStudent);
	}
	
	@Test
	public void cTestUpdateSetStudent(){
		Student student = new Student();
		student.setStudId(3);
		student.setName("4홍길동4");
		int res = studentService.updateSetStudent(student);
		Assert.assertEquals(1, res);
		
		student.setStudId(3);
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		System.out.println(selectStudent);
	}
	
	@Test
	public void dTestUpdateSetStudent(){
		Student student = new Student();
		student.setStudId(3);
		student.setName("5홍길동5");
		student.setEmail("testtest@test.co.kr");
		int res = studentService.updateSetStudent(student);
		Assert.assertEquals(1, res);
		
		student.setStudId(3);
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		System.out.println(selectStudent);
	}
	
	@Test
	public void eTestDeleteStudent(){
		
		Student student = new Student();
		student.setStudId(3);
		int res = studentService.deleteStudent(student);
		Assert.assertEquals(1, res);
	}*/
	///////////////////////////////////////////////////
	
	/*@Test 
	public void aTestSelectStudentByNoForResultMap(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoForResultMap(student);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void bTestSelectStudentByALLForResultMap(){
		List<Student> lists = studentService.selectStudentByAllForResultMap();
		List<Student> emptyLists = Collections.emptyList();
		Assert.assertNotEquals(emptyLists, lists);
	}
	
	///////////////////////////////////////////////////
	@Test 
	public void cTestSelectStudentByNoForHashMap(){
		Student student = new Student();
		student.setStudId(1);
		
		Map<String, Object> selectStudent = studentService.selectStudentByNoForHashMap(student);
		for(Entry<String, Object> e : selectStudent.entrySet()){
			System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
		}
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void dTestSelectStudentByALLForHashMap(){
		List<Map<String, Object>> lists = studentService.selectStudentByAllForHashMap();
		List<Map<String, Object>> emptyLists = Collections.emptyList();
		
		for(Map<String, Object> map : lists){
			for(Entry<String, Object> e : map.entrySet()){
				System.out.printf("key : %s -> value : %s %n", e.getKey(), e.getValue());
			}
		}
		Assert.assertNotEquals(emptyLists, lists);
	}
	
	
	@Test 
	public void eTestSelectStudentByNoWithAddress(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoWithAddress(student);
		Assert.assertNotNull(selectStudent);
	}
	
	@Test 
	public void fTestSelectStudentByNoAssociationAddress(){
		Student student = new Student();
		student.setStudId(1);
		
		Student selectStudent = studentService.selectStudentByNoAssociationAddress(student);
		Assert.assertNotNull(selectStudent);
	}*/
}

















