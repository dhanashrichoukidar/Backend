package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.EducationalDetails;

@Repository
public interface EducationDetailRepository extends JpaRepository<EducationalDetails, Integer> {
}