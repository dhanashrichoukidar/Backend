package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.StudentAddress;

@Repository
public interface StudentAddressRepository extends JpaRepository<StudentAddress, Integer> {

}