package com.boot.entity;

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
public class Bookings {
	@Id
	@GeneratedValue
	@Column(name="bookingId")
	private int bookingId;
	
	@Column(name = "busId")
	private int busId;
	
	@Column(name="userId")
	private int userId;
	
	@Column(name="bpuId")
	private int bpuId;
	
	@Column(name="bookingFare")
	private double bookingFare;
	
	
}
