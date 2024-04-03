package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.BPUser;

@Repository
public interface BPUserRepository extends JpaRepository<BPUser, Integer> {
	
	@Query("from BPUser p where p.bpuUsername=:bpuusername")
	BPUser getBPUserbyDetailsbyBPUusername(@Param(value = "bpuusername") String bpuusername);

	@Query("from BPUser p where p.bpufName=:bpufName")
	List<BPUser> getBPUserbyDetailsbyBPUfName(@Param(value = "bpufName") String bpufName);

	@Query("from BPUser p where p.bpulName=:bpulName")
	List<BPUser> getBPUserbyDetailsbyBPULName(@Param(value = "bpulName") String bpuLName);

	@Query("from BPUser p where p.bpuUsername=:bpuusername and p.bpuPassword=:bpuPassword")
	BPUser getUserbyUsernameandPassword(@Param(value = "bpuusername") String bpusername, @Param(value = "bpuPassword") String bppassword);
	
}
