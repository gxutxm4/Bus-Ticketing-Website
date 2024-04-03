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

import com.boot.dao.UserregRepository;
import com.boot.entity.Userreg;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserregController {
	
	@Autowired
	UserregRepository webRepo;
	
	//POST functionalities
	@PostMapping("/add")
	public void addUserregDetails(@RequestBody Userreg userreg) {
		webRepo.save(userreg);
	}
	
	//GET functionalities
	@GetMapping("/getuser")
	public List<Userreg> getUserregDetails() {
		return webRepo.findAll();
	}
	
	@GetMapping("/getuserbyID/{userId}")
	public Userreg getUserByUserId(@PathVariable int userId) {
		return webRepo.getReferenceById(userId);
	}
	
	@GetMapping("/getuserbyFName/{FName}")
	public List<Userreg> getUserregDetailsbyFName(@PathVariable String FName) {
		return webRepo.getUserDetailsbyFirstName(FName);
	}
	
	@GetMapping("/getuserbyLName/{LName}")
	public List<Userreg> getUserregDetailsbyLName(@PathVariable String LName) {
		return webRepo.getUserDetailsbyLastName(LName);
	}
	
	@GetMapping("/getuserbyusername/{username}")
	public Userreg getUserregDetailsbyusername(@PathVariable String username) {
		return webRepo.getUserDetailbyusername(username);
	}
	
	@GetMapping("/userEmail/{userId}")
	public String getuserEmail(@PathVariable int userId) {
		return webRepo.getReferenceById(userId).getUserEmail();
	}
	
	@GetMapping("/userContactNo/{userId}")
	public double getuserContactNo(@PathVariable int userId) {
		return webRepo.getReferenceById(userId).getUserContactNo();
	}
	
	@GetMapping("/validateuserReg/{username}/{password}")
	public Userreg validateUsernameandPassword(@PathVariable String username, @PathVariable String password){
		return webRepo.getUserregbyUsernameandPassword(username, password);
	}
	
	
	//Update(PUT) Functionalities for UserReg
	@PutMapping("/updatecontactno/{contactNo}/{userId}")
	public void updateUserContactNo(@PathVariable double contactNo, @PathVariable int userId) {
		webRepo.updateUserContactNo(contactNo, userId);
	}
	
	@PutMapping("/updateFName/{fName}/{userId}")
	public void updateUserFName(@PathVariable String fName, @PathVariable int userId) {
		webRepo.updateUserFName(fName, userId);
	}
	@PutMapping("/updateLName/{lName}/{userId}")
	public void updateUserLName(@PathVariable String lName, @PathVariable int userId) {
		webRepo.updateUserLName(lName, userId);
	}
	
	@PutMapping("/updateusername/{username}/{userId}")
	public void updateUserUsername(@PathVariable String username, @PathVariable int userId) {
		webRepo.updateUserUsername(username, userId);
	}
	
	@PutMapping("/updateEmail/{email}/{userId}")
	public void updateUserEmail(@PathVariable String email, @PathVariable int userId) {
		webRepo.updateUserEmailId(email, userId);
	}
	
	//Delete Functionality
	@DeleteMapping("/deletebyuserId/{userId}")
	public void deleteUserById(@PathVariable int userId) {
		webRepo.deleteById(userId);
	}
}
