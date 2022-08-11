package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Region;
import com.practice.entity.UserProfile;
import com.practice.service.RegionService;

@RestController
@RequestMapping("/region")
public class RegionController {

	@Autowired
	private RegionService regionService;

	@PostMapping("/saveRegion")
	public ResponseEntity<Region> saveRegion(@RequestBody Region region){
		Region reg = regionService.saveRegion(region);
		return new ResponseEntity<Region>(reg,HttpStatus.CREATED);
		
	}
	
	
}
