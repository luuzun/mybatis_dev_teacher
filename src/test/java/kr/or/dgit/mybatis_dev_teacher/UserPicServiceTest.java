package kr.or.dgit.mybatis_dev_teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;
import kr.or.dgit.mybatis_dev_teacher.services.UserPicService;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserPicServiceTest {
	private static UserPicService userPicService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		userPicService = new UserPicService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		userPicService = null;
	}

/*	@Test 
	public void aTestInsertUserPic(){
		byte[] pic = null;
		File file = new File(System.getProperty("user.dir")+"\\DataFiles\\jjh.jpg");
		try (InputStream is = new FileInputStream(file);){
			pic = new byte[is.available()];
			is.read(pic);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		UserPic userPic = new UserPic(1, "전지현", pic, "인어공주 전지현");
		int res = userPicService.insertUserPic(userPic);
		Assert.assertEquals(1, res);
	}*/
	
	@Test 
	public void bTestFindUserPicById(){
		UserPic userPic = userPicService.findUserPicById(1);
		byte[] pic = userPic.getPic();
		
		File file = new File(System.getProperty("user.dir")+"\\Download\\전지현.jpg");
		try (OutputStream os = new FileOutputStream(file)){
			os.write(pic);
			os.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Assert.assertNotNull(userPic);
	}
	

	
}

















