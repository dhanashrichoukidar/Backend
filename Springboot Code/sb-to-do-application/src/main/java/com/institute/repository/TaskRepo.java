package com.institute.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.institute.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer>{
	
	/*
	@Transactional
	@Modifying
	@Query(value = "Update Task set title= :t, status=:st , createdDate= :cd, updatedDate= :ud where id= :id")
	public void updateTaskDetailsHql(@Param("t") String title,@Param("st") String status,@Param("cd") String createdDate,@Param("ud") String updatedDate,@Param("id") int id);
	 */
	
	@Transactional
	@Modifying
	@Query(value = "Update Task set status=:st where id= :id")
	public void updateStatusByIdHql(@Param("st") String status,@Param("id") int id);

	@Transactional
	@Modifying
	@Query(value = "delete from Task where id=:id")
	public void deleteTaskByIdHql(@Param("id") int id);

	@Query(value = "Select tsk from Task tsk where tsk.id= :id")  // 
	public Task getTaskById(@Param("id") int id);


	@Query(value = "Select ts from Task ts where ts.status= :st")  // 
	public Task getTaskByStatus(@Param("st") String status);
	
	
	@Transactional
	@Modifying
	@Query(value = "delete from Task where uid=:uid")
	public void deleteTaskByUserIdHql(@Param("uid") int uid);

}