package com.userRegistration.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "User")
public class UserDTO {
	@Id
	private int userId;
	private String userFirstName;
	private String userLastName;
	private String userName;	
	private String userEmail;
	private String userPassword;
	private String profilePicture;
	private boolean active = true;
}