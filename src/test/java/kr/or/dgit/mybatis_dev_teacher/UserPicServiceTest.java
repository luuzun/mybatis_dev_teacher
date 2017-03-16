package kr.or.dgit.mybatis_dev_teacher;

import static org.junit.Assert.fail;

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
	public void atestInsertUserPic() {
        UserPic userPic = new UserPic();
        userPic.setName("HanJiMin");
        userPic.setBio("put some lengthy bio here");
        userPic.setPic(getPicToByte("hanjimin.jpg"));

        int result = userPicService.insertUserPic(userPic);
        Assert.assertSame(1, result);
	}

	@Test
	public void btestGetUserPic() {
        UserPic userPic = userPicService.getUserPic(1);
        Assert.assertNotNull(userPic);
        loadByteToPic(userPic, "hanjimin.jpg");
	}*/
	
/*	@Test
	public void atestInsertUserPicAnnotation() {
        UserPic userPic = new UserPic();
        userPic.setName("HanJiMin");
        userPic.setBio("put some lengthy bio here");
        userPic.setPic(getPicToByte("hanjimin.jpg"));

        int result = userPicService.insertUserPicAnnotation(userPic);
        Assert.assertSame(1, result);
	}

	@Test
	public void btestGetUserPicAnnotation() {
        UserPic userPic = userPicService.getUserPicAnnotation(2);
        Assert.assertNotNull(userPic);
        loadByteToPic(userPic, "hanjimin2.jpg");
	}*/
	
	@Test
	public void atestInsertUserPicProv() {
        UserPic userPic = new UserPic();
        userPic.setName("HanJiMin");
        userPic.setBio("put some lengthy bio here");
        userPic.setPic(getPicToByte("hanjimin.jpg"));

        int result = userPicService.insertUserPicProv(userPic);
        Assert.assertSame(1, result);
	}

	@Test
	public void btestGetUserPicProv() {
		UserPic searchUserPic = new UserPic();
		searchUserPic.setId(3);
        UserPic userPic = userPicService.getUserPicProv(searchUserPic);
        
        Assert.assertNotNull(userPic);
        loadByteToPic(userPic, "hanjimin3.jpg");
	}
	
	private byte[] getPicToByte(String fileName){
		byte[] pic = null;
        File file = new File( System.getProperty("user.dir") + "\\DataFiles\\" + fileName);
        try (InputStream is = new FileInputStream(file);){
            pic = new byte[is.available()];
            is.read(pic);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pic;
	}
	
	private void loadByteToPic(UserPic userPic, String fileName){
        byte[] pic=userPic.getPic();
        try {
            File file = new File(System.getProperty("user.dir") + "\\Download\\" + fileName);
            OutputStream os = new FileOutputStream(file);
            os.write(pic);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
