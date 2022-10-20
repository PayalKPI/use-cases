package com.example.vehicle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private TruckRepo t;
	@Autowired
	private CarRepo c;
	@Autowired BikeRepo b;
	
	@GetMapping("/truck")
	public List<TruckEntity> joincol(){
		return t.getjoin() ;
	}
	
	@GetMapping("/car")
	public List<CarEntity> joinco() {
		return c.getjoin2();
	}
	
	@GetMapping("/bike")
	public List<BikeEntity> joinbike(){
		return b.getjoinbike();
		}

}
