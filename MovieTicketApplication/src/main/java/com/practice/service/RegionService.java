package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Region;
import com.practice.repositary.RegionRepositary;

@Service
public class RegionService {

	@Autowired
	private RegionRepositary regionRepo;

	public Region saveRegion(Region region) {
		return regionRepo.save(region);
	}

}
