package com.userRegistration.testFunctional;

import static org.mockito.Mockito.when;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.userRegistration.UtilClasses.SampleData;
import com.userRegistration.model.Admin;
import com.userRegistration.model.User;
import com.userRegistration.repo.AdminRepository;
import com.userRegistration.repo.UserRepository;
import com.userRegistration.service.AdminServiceImpl;
import com.userRegistration.service.UserServiceImpl;

public class TestFunctional {
	
	static {
		File file = new File("output_revised.txt");
		if (file.exists()) {
			try {
				FileUtils.forceDelete(new File("output_revised.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
			}
		}
	}
	
	@Mock
	private UserRepository userRepository;
	@Mock
	private AdminRepository adminRepository;

	@Mock
	private User user;
	@Mock
	private Admin admin;

	@InjectMocks
	private UserServiceImpl userServiceImpl;

	@InjectMocks
	private AdminServiceImpl adminServiceImpl;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testCreateUser() throws Exception {
		Boolean value = userServiceImpl.createUser(SampleData.getUserDetails());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestSaveUsers="+(value?true:false), true); 
	}

	@Test
	public void getUserByIdTest() throws Exception {
		User user = new User();
		user.setUserId("1");
		String userId = user.getUserId();
		User userfromdb = userServiceImpl.getUserById(user.getUserId());
		File file = new File("output_revised.txt");
	    FileUtils.write(file, "\ntestGetUser="+(userId==null?true:false), true); 
	}

	@Test
	public void getAllUsersTest() throws Exception {
		List<User> list = new ArrayList<User>();
		User user1 = new User();
		user1.setUserId("1");
		user1.setUserFirstName("Besta");
		user1.setUserLastName("Shashidhar");
		user1.setUserName("B Shashidhar");
		user1.setUserEmail("shashi@gmail.com");
		user1.setUserPassword("123456789");
		user1.setProfilePicture("google.com");
		user1.isActive();
		User user2 = new User();
		user2.setUserId("2");
		user2.setUserFirstName("Besta");
		user2.setUserLastName("Shashidhar");
		user2.setUserName("B Shashidhar");
		user2.setUserEmail("shashi@gmail.com");
		user2.setUserPassword("123456789");
		user2.setProfilePicture("google.com");
		user2.isActive();
		list.add(user1);
		list.add(user2);
		when(userRepository.findAll()).thenReturn(list);
		List<User> userList = userServiceImpl.listAllUsers();
		File file = new File("output_revised.txt");
		FileUtils.write(file, "testViewAllUsers="+(userList==list?true:false), true); 
	}
}
