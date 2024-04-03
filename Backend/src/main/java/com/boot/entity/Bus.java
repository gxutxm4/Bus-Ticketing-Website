package com.boot.entity;

import java.sql.Time;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Nonnull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
	@Id
	@GeneratedValue
	@Column(name = "busId")
	private int busId;
	
	@OneToMany(mappedBy = "busprovider", cascade = CascadeType.ALL)
	@Column(name = "busStopPoints")
	private List<BusLT> busStopPoints;
	
	@Column(name = "bpuId")
	@Nonnull
	private int bpuId;
	
	@Column(name = "bpuCompanyName")
	@Nonnull
	private String bpuCompanyName;
	
	@Column(name = "busNo", updatable=false)
	@Nonnull
	private String busNo;
	
	@Column(name = "busSource")
	private String busSource;
	
	@Column(name = "busDestination")
	private String busDestination;
	
	@Column(name = "busFare")
	private double busFare;
	
	@Column(name = "busDeparturetime")
	private Time busDeparturetime;
	
	@Column(name = "busArrivalTime")
	private Time busArrivalTime;
	
	@Column(name = "busTotalSeats")
	private int busTotalSeats;
	
	@Column(name = "busPillow")
	private boolean busPillow;
	
	@Column(name = "busCCTV")
	private boolean busCCTV;
	
	@Column(name = "busCharging")
	private boolean busCharging;
	

	
	
	
	
	
	
	
	
	public Bus(int bpuId, String busNo, String busSource, String busDestination, double busFare, Time busDeparturetime,
			Time busArrivalTime, int busTotalSeats, boolean busPillow, boolean busCCTV, boolean busCharging) {
		super();
		this.bpuId = bpuId;
		this.busNo = busNo;
		this.busSource = busSource;
		this.busDestination = busDestination;
		this.busFare = busFare;
		this.busDeparturetime = busDeparturetime;
		this.busArrivalTime = busArrivalTime;
		this.busTotalSeats = busTotalSeats;
		this.busPillow = busPillow;
		this.busCCTV = busCCTV;
		this.busCharging = busCharging;
	}
	
}
