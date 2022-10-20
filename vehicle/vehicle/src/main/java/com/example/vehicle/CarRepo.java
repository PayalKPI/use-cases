package com.example.vehicle;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CarRepo extends JpaRepository<CarEntity, Integer> {
	@Query(value="Select * from car INNER JOIN truck ON car.no_of_tyres= truck.no_of_tyres;", nativeQuery=true)
	public List<CarEntity> getjoin2();
}

