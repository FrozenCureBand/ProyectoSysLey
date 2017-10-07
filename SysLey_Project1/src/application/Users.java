package application;

import java.util.List;

import javafx.scene.control.TextField;

public class Users {
	
	public String UserName;
	public String UserLastName;
	public String UserBirth;
	public String UserPP;
	public String UserParl;
	public String UserTag;
	
	public Users(String UserTag,String UserName,String UserLastName,String UserBirth,String UserPP,String UserParl) {
		this.UserName = UserName;
		this.UserLastName = UserLastName;
		this.UserBirth = UserBirth;
		this.UserPP = UserPP;
		this.UserParl = UserParl;
		this.UserTag = UserTag;
	}
	
	

	public String getUserName() {
		return UserName;
	}
	
	public String getUserLastName() {
		return UserLastName;
	}
	
	public String getUserBirth() {
		return UserBirth;
	}
	
	public String getUserTag() {
		return UserTag;
	}



	public void setUserTag(String userTag) {
		UserTag = userTag;
	}



	public String getUserPP() {
		return UserPP;
	}
	
	public String getUserParl() {
		return UserParl;
	}
	
	public void setUserName(String UserName) {
		this.UserName = UserName;
	}
	
	public void setUserLastName(String UserLastName) {
		this.UserLastName = UserLastName;
	}
	
	public void setUserBirth(String UserBirth) {
		this.UserBirth = UserBirth;
	}
	
	public void setUserPP(String UserPP) {
		this.UserPP = UserPP;
	}
	
	public void setUserParl(String UserParl) {
		this.UserParl = UserParl;
	}
	
	
	
}
