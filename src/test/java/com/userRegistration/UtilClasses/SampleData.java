package com.userRegistration.UtilClasses;

import com.userRegistration.model.Admin;
import com.userRegistration.model.User;

public class SampleData {
	public static User getUserDetails() {
		User user = new User();
		user.setUserId("1");
		user.setUserFirstName("Besta");
		user.setUserLastName("Shashidhar");
		user.setUserName("B Shashidhar");
		user.setUserEmail("shashi@gmail.com");
		user.setUserPassword("123456789");
		user.setProfilePicture("google.com");
		user.isActive();
		return user;
	}
	public static User getUpdateUserDetails() {
		User user = new User();
		user.setUserId("1");
		user.setUserFirstName("Bestha");
		user.setUserLastName("Shashidhar");
		user.setUserName("Besta Shashidhar");
		user.setUserEmail("shashi@gmail.com");
		user.setUserPassword("Password");
		user.setProfilePicture("shashi.png");
		user.setActive(true);
		return user;
	}
	public static Admin getAdminDetails() {
		Admin admin = new Admin();
		admin.setAdminId("1");
		admin.setAdminName("admin");
		admin.setAdminPassword("admin");
		return admin;
	}
}