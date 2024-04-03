package com.boot.control;

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

import com.boot.dao.BPUserRepository;
import com.boot.entity.BPUser;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BPUserController {
	
	@Autowired
	BPUserRepository bpuRepo;
	
	//Add BPUser
	@PostMapping("/addbpu")
	public void addBPUDetails(@RequestBody BPUser bpUser) {
		bpuRepo.save(bpUser);
	}
	
	@GetMapping("/getbpuser")
	public List<BPUser> getAllBPUserDetails(){
		return bpuRepo.findAll();
	}
	
	@GetMapping("/getbpuserbyId/{bpuId}")
	public BPUser getBPUserbybpuId(@PathVariable int bpuId) {
		return bpuRepo.getReferenceById(bpuId);
	}
	
	@GetMapping("/getbpuserbyusername/{bpuusername}")
	public BPUser getBPUserbybpuusername(@PathVariable String bpuusername) {
		return bpuRepo.getBPUserbyDetailsbyBPUusername(bpuusername);
	}
	
	@GetMapping("/getbpuserbybpufName/{bpufName}")
	public List<BPUser> getBPUserbybpufName(@PathVariable String bpufName) {
		return bpuRepo.getBPUserbyDetailsbyBPUfName(bpufName);
	}
	
	@GetMapping("/getbpuserbybpuLName/{bpuLName}")
	public List<BPUser> getBPUserbybpuLName(@PathVariable String bpuLName) {
		return bpuRepo.getBPUserbyDetailsbyBPULName(bpuLName);
	}
	
	@GetMapping("/validateBPUser/{bpusername}/{bppassword}")
	public BPUser validateUsernameandPassword(@PathVariable String bpusername, @PathVariable String bppassword){
		return bpuRepo.getUserbyUsernameandPassword(bpusername, bppassword);
	}
	
	//Update Methods
	@PutMapping("/updateBPUusername/{BPUusername}/{bpuId}")
	public void updateBPUusername(@PathVariable String BPUusername, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpuUsername(BPUusername);
	}
	
	@PutMapping("/updateBPUfName/{BPUfName}/{bpuId}")
	public void updateBPUfName(@PathVariable String BPUfName, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpufName(BPUfName);
	}
	
	@PutMapping("/updateBPUlName/{BPUlName}/{bpuId}")
	public void updateBPUlName(@PathVariable String BPUlName, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpulName(BPUlName);
	}
	
	@PutMapping("/updateBPUPassword/{BPUusername}/{bpuId}")
	public void updateBPUPassword(@PathVariable String BPUPassword, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpuPassword(BPUPassword);
	}
	
	@PutMapping("/updateBPUEmail/{BPUEmail}/{bpuId}")
	public void updateBPUEmail(@PathVariable String BPUEmail, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpuEmail(BPUEmail);
	}
	
	@PutMapping("/updateBPUContactNo/{BPUContactNo}/{bpuId}")
	public void updateBPUContactNo(@PathVariable double BPUContactNo, @PathVariable int bpuId) {
		bpuRepo.getReferenceById(bpuId).setBpuContactno(BPUContactNo);
	}
	
	//Delete Method
	@DeleteMapping("/deleteById/{bpuId}")
	public void deleteBPUser(@PathVariable int bpuId) {
		bpuRepo.deleteById(bpuId);
	}
	
}
