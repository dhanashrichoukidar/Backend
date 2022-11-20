package com.institute.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.institute.entity.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Integer> {

}