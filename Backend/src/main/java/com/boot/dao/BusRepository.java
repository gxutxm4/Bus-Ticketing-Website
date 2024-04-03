package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;

import com.boot.entity.Bus;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
	
	@Query("from Bus b where b.busSource=:busSource and b.busDestination=:busDestination")
	List<Bus> getBusbySourceandDestination(@Param(value="busSource") String busSource, @Param(value="busDestination") String busDestination);
	
	@Query("from Bus b where b.busNo=:busNo")
	Bus getBusbyBusNo(@Param(value="busNo") String busNo);
	
	@Query("from Bus b where b.bpuId=:bpuId")
	List<Bus> getBusbyBPUId(@Param(value="bpuId") int bpuId);
	
	@Query("from Bus b where b.busId=:busId")
	Bus getBusbyID(@Param(value="busId") int busId);

	@Query("from Bus b where b.bpuId=:bpuId")
	List<Bus> getBusbpuId(@Param(value="bpuId") int bpuId);

	@Query("delete from Bus b where b.busNo=:busNo")
	void deleteBusbyBusNo(@Param(value="busNo") String busNo);

}
