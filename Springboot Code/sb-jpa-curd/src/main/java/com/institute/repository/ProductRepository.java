package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.institute.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	@Transactional
	@Modifying
	@Query("UPDATE Product set quantity= :qty, updatedDate=CURRENT_TIMESTAMP where id= :id")
	void updateQuantity(@Param("qty") int qty, @Param("id") int id);
	
}