package com.example.vehicle;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer truckid;
	private String truck_name;
	private Integer no_of_tyres;
	public Integer getTruckid() {
		return truckid;
	}
	public void setTruckid(Integer truckid) {
		this.truckid = truckid;
	}
	public String getTruck_name() {
		return truck_name;
	}
	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}
	public Integer getNo_of_tyres() {
		return no_of_tyres;
	}
	public void setNo_of_tyres(Integer no_of_tyres) {
		this.no_of_tyres = no_of_tyres;
	}

}
