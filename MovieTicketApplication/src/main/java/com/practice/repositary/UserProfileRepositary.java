package com.practice.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.entity.UserProfile;

public interface UserProfileRepositary extends JpaRepository<UserProfile, Long> {

}
