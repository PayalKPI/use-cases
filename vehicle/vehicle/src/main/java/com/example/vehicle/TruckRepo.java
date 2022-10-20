package com.example.vehicle;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TruckRepo extends JpaRepository<TruckEntity, Integer> {
	@Query(value="select * from truck t INNER JOIN car c ON t.truck_name=c.car_name;",nativeQuery=true)
	public List<TruckEntity> getjoin();

}
