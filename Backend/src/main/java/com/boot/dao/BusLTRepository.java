package com.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.entity.BusLT;

@Repository
public interface BusLTRepository extends JpaRepository<BusLT, Integer> {

}
