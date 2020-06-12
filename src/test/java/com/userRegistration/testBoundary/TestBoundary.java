package com.userRegistration.testBoundary;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.userRegistration.UtilClasses.SampleData;
import com.userRegistration.model.Admin;
import com.userRegistration.model.User;
@RunWith(JUnitPlatform.class)
public class TestBoundary {
	static {
		File file = new File("output_boundary_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_boundary_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Test
	public void testUserFirstNameLength() throws Exception {
		User user=SampleData.getUserDetails();
		user.getUserFirstName();
		int maxChar = 5;
		boolean userFirstNameLength = ((user.getUserFirstName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserFirstNameLength=" + (userFirstNameLength ? true : false), true);
	}
	@Test
	public void testUserLastNameLength() throws Exception {
		User user=SampleData.getUserDetails();
		user.getUserLastName();
		int maxChar = 5;
		boolean userLastLength = ((user.getUserLastName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserLastNameLength=" + (userLastLength ? true : false), true);
	}
	
	@Test
	public void testUserPasswordLength() throws Exception {
		User user=SampleData.getUserDetails();
		user.getUserPassword();
		int maxChar = 5;
		boolean userPasswordLength = ((user.getUserPassword().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserPasswordLength=" + (userPasswordLength ? true : false), true);
	}

	@Test
	public void testUserNameLength() throws Exception {
		User user=SampleData.getUserDetails();
		user.getUserName();
		int maxChar = 5;
		boolean userNameLength = ((user.getUserName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestUserNameLength=" + (userNameLength ? true : false), true);
	}

	@Test
	public void testAdminPasswordLength() throws Exception {
		Admin admin=SampleData.getAdminDetails();
		admin.getAdminPassword();
		int maxChar = 5;
		boolean adminPassword = ((admin.getAdminPassword().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestAdminPasswordLength=" + (adminPassword ? true : false), true);
	}

	@Test
	public void testAdminUserNameLength() throws Exception {
		Admin admin=SampleData.getAdminDetails();
		admin.getAdminName();
		int maxChar = 5;
		boolean adminUserNameLength = ((admin.getAdminName().length()) >= maxChar);
		File file = new File("output_boundary_revised.txt");
		FileUtils.write(file, "\ntestAdminUserNameLength=" + (adminUserNameLength ? true : false), true);		
	}
}
