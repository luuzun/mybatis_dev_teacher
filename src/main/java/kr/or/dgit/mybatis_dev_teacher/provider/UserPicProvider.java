package kr.or.dgit.mybatis_dev_teacher.provider;

import org.apache.ibatis.jdbc.SQL;

import kr.or.dgit.mybatis_dev_teacher.dto.UserPic;

public class UserPicProvider {
	
	public String selectUserPicByIdProv(UserPic userPic) {
		return new SQL() {
			{
				SELECT("id, name, pic, bio");
				FROM("user_pics");
				WHERE("id=#{id}");
			}
		}.toString();
	}
	
	public String insertUserPic(UserPic userPic) {
		return new SQL() {
			{
				INSERT_INTO("user_pics");
				VALUES("id", "#{id}");
				VALUES("name", "#{name}");
				VALUES("pic", "#{pic}");
				VALUES("bio", "#{bio}");
			}
		}.toString();
	}
}
