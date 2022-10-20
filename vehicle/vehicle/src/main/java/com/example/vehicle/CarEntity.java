package com.example.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer carid;
	public Integer getCarid() {
		return carid;
	}
	public void setCarid(Integer carid) {
		this.carid = carid;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public Integer getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(Integer no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}
	private String car_name;
	private Integer no_of_tyres;

}
