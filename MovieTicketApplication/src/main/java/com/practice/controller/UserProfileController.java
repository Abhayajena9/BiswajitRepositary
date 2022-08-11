package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.UserProfile;
import com.practice.service.UserProfileService;

@RestController
@RequestMapping("/userprofile")
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;

	@PostMapping("/saveProfile")
	public ResponseEntity<UserProfile> saveUserProfile(@RequestBody UserProfile userProfile) {
		System.out.println("v--" + userProfile);
		UserProfile uProfile = userProfileService.saveUserProfile(userProfile);
		return new ResponseEntity<UserProfile>(uProfile, HttpStatus.CREATED);

	}
}
