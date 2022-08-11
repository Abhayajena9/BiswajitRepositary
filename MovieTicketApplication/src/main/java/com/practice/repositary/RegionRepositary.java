package com.practice.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Region;
@Repository
public interface RegionRepositary extends JpaRepository<Region, Long>{

}
