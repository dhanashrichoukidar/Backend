package com.institute.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.institute.entity.Task;
import com.institute.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	
/*	
	//update user
	@Query(value = "Select ud from User ud where ud.id= :id")  // 
	public List<User> getUserById(@Param("id") int id);

	@Transactional
	@Modifying
	@Query(value = "Update User set name= :nm, email=:em , contact= :ct where id= :id")
	public void updateUserDetailsHql(@Param("nm") String name,@Param("em") String email,@Param("ct") String contact,@Param("id") int id);

	*/
	
	 
}
