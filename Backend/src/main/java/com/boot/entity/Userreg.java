package com.boot.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userreg {
	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;
	
	@Column(name = "userfName")
	private String userfName;
	
	@Column(name = "userlName")	
	private String userlName;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "userPassword")
	private String userPassword;
	
	@Column(name = "userEmail")
	private String userEmail;
	
	@Column(name = "userContactNo")
	private double userContactNo;
	
	@Column(name = "userDOB")
	private Date userDOB;
	
}
