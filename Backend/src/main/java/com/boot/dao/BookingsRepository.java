package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.Bookings;

@Repository
public interface BookingsRepository extends JpaRepository<Bookings, Integer> {

	@Query("from Bookings b where b.userId=:userId")
	List<Bookings> getBookingsbyUserId(@Param(value = "userId") int userId);

	@Query("from Bookings b where b.busId=:busId")
	List<Bookings> getBookingsbyBusId(@Param(value = "busId") int busId);
	
}
