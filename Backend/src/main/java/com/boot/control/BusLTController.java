package com.boot.control;

import java.sql.Time;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.BusLTRepository;
import com.boot.entity.BusLT;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
public class BusLTController {

	@Autowired
	BusLTRepository BusLTRepo;
	
	//ADD BusLT
	@PostMapping("/addBusLT")
	public void addBusLT(@RequestBody BusLT busLT) {
		BusLTRepo.save(busLT);
	}
	
	//Get
	@PutMapping("/getBusLT")
	public List<BusLT> getAllBusLT(){
		return BusLTRepo.findAll();
	}
	
	@GetMapping("/getBusLTbyId/{busLTId}")
	public BusLT getBusLTbybusLTId(@PathVariable int busLTId){
		return BusLTRepo.getReferenceById(busLTId);
	}
	
	//Update
	@PutMapping("/updateLocation/{location}/{busLTId}")
	public void updateBusLTLocation(@PathVariable String location, @PathVariable int busLTId) {
		BusLTRepo.getReferenceById(busLTId).setLocation(location);
	}
	
	@PutMapping("/updateTime/{time}/{busLTId}")
	public void updateBusLTTime(@PathVariable Time time, @PathVariable int busLTId) {
		BusLTRepo.getReferenceById(busLTId).setTime(time);
	}
	
	//Delete
	@DeleteMapping("/delete/{busLTId}")
	public void deletebyId(@PathVariable int busLTId) {
		BusLTRepo.deleteById(busLTId);
	}
}
