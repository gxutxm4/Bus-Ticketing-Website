package com.boot.entity;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusLT {
	@Id
	@GeneratedValue
	@Column(name = "busLTId")
	private int busLTId;
	
	@Column(name = "location")
	private String location;
	
	@Column(name = "time")
	private Time time;
	
	@PrimaryKeyJoinColumn
	@ManyToOne
	private Bus busprovider;

	public BusLT(String location, Time time) {
		super();
		this.location = location;
		this.time = time;
	}
	
	
}
