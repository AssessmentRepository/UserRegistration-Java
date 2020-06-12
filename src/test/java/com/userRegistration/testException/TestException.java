package com.userRegistration.testException;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import com.userRegistration.exception.UserAlreadyExistException;
import com.userRegistration.exception.UserDoesNotExistException;
import com.userRegistration.model.User;
import com.userRegistration.service.LoginServiceImpl;

public class TestException {

	static {
		File file = new File("output_exception_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_exception_revised.txt"));
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}

	@InjectMocks
	private LoginServiceImpl loginServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test(expected = UserAlreadyExistException.class)
	public void testForUserRegistration() throws Exception {
		try {
			User user = new User();
			user.setUserName("admin");
			user.setUserPassword("james");
			loginServiceImpl.register(user);
		} catch (UserAlreadyExistException e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "testForUserRegistration=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "testForUserRegistration=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "testForUserRegistration=false", true);

	}

	@Test(expected = UserDoesNotExistException.class)
	public void testForUserLogin() throws Exception {
		try {
			User user = new User();
			user.setUserName("admin");
			user.setUserPassword("james");
			loginServiceImpl.login(user.getUserName(), user.getUserPassword());
		} catch (UserDoesNotExistException e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=true", true);
			throw e;
		} catch (Exception e) {
			File file = new File("output_exception_revised.txt");
			FileUtils.write(file, "\ntestForUserLogin=false", true);
			throw e;
		}
		File file = new File("output_exception_revised.txt");
		FileUtils.write(file, "\ntestForUserLogin=false", true);
	}
}
