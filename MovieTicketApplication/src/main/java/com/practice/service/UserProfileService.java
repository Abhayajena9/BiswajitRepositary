package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.UserProfile;
import com.practice.repositary.UserProfileRepositary;

@Service
public class UserProfileService {
	@Autowired
	private UserProfileRepositary userProfileRepositary;

	public UserProfile saveUserProfile(UserProfile userProfile) {

		return userProfileRepositary.save(userProfile);

	}

}
