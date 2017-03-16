package kr.or.dgit.mybatis_dev_teacher.persistences;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;
import kr.or.dgit.mybatis_dev_teacher.provider.UserPicProvider;

public interface UserPicMapper {
	int insertUserPic(UserPic userPic);
	UserPic getUserPic(int id);
	
	@Insert("INSERT INTO user_pics(name, pic, bio) VALUES (#{name}, #{pic}, #{bio})")
	int insertUserPicAnnotation(UserPic userPic);
	
	@Select("SELECT id, name, pic, bio FROM USER_PICS WHERE ID=#{id}")
    UserPic getUserPicAnnotation(int id);
    
    @InsertProvider(type=UserPicProvider.class, method="insertUserPic")
    @Options(useGeneratedKeys=true, keyProperty="id")
	int insertUserPicProv(UserPic userPic);
    
    @SelectProvider(type=UserPicProvider.class, method="selectUserPicByIdProv")
    UserPic getUserPicProv(UserPic userPic);
}
