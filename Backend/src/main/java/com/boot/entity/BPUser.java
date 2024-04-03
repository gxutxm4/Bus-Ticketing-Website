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
public class BPUser {
	@Id
	@GeneratedValue
	@Column(name = "bpuId")	
	private int bpuId;
	
	@Column(name = "bpufName")	
	private String bpufName;
	
	@Column(name = "bpulName")	
	private String bpulName;
	
	@Column(name = "bpuCompanyName")
	private String bpuCompanyName;
	
	@Column(name = "bpuUsername")	
	private String bpuUsername;
	
	@Column(name = "bpuPassword")	
	private String bpuPassword;
	
	@Column(name = "bpuEmail")	
	private String bpuEmail;
	
	@Column(name = "bpuContactno")	
	private double bpuContactno;
	
	@Column(name = "bpuDOB")	
	private Date bpuDOB;
	
}
