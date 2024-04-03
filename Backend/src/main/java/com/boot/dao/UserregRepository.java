package com.boot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boot.entity.Userreg;

@Repository
public interface UserregRepository extends JpaRepository<Userreg, Integer> {
	
	@Query("from Userreg u where u.username=:username")
	Userreg getUserDetailbyusername(@Param(value = "username") String username);
	
	@Query("from Userreg u where u.userfName=:fName")
	List<Userreg> getUserDetailsbyFirstName(@Param(value="fName") String fName);
	
	@Query("from Userreg u where u.userlName=:lName")
	List<Userreg> getUserDetailsbyLastName(@Param(value="lName") String lName);
	
	@Query("from Userreg u where u.username=:username and u.userPassword=:password")
	Userreg getUserregbyUsernameandPassword(@Param(value="username") String username, @Param(value="password") String password);
	
	@Query("update Userreg u set u.userfName=:fName where userId=:userId")
	void updateUserFName(@Param(value="fName") String fName, @Param(value="userId") int userId);
	
	@Query("update Userreg u set u.userlName=:lName where userId=:userId")
	void updateUserLName(@Param(value="lName") String lName, @Param(value="userId") int userId);
	
	@Query("update Userreg u set u.userContactNo=:contactNo where userId=:userId")
	void updateUserContactNo(@Param(value="contactNo") double contactNo, @Param(value="userId") int userId);
	
	@Query("update Userreg u set u.username=:username where userId=:userId")
	void updateUserUsername(@Param(value="username") String username, @Param(value="userId") int userId);
	
	@Query("update Userreg u set u.userEmail=:email where userId=:userId")
	void updateUserEmailId(@Param(value="email") String email, @Param(value="userId") int userId);

}