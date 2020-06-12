package com.userRegistration.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value = "Admin")
public class Admin {
	@Id
	private String adminId;

	private String adminName;

	private String adminPassword;
}
