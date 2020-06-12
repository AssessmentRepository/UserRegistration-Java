package com.userRegistration.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "Admin")
public class AdminDTO {
	@Id
	private int adminId;
	private String adminName;
	private String adminPassword;
}
