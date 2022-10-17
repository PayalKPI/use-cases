package com.school.school1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "school")
public class SchoolEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer roll_no;
	private String school_name;
	public Integer getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(Integer roll_no) {
		this.roll_no = roll_no;
	}
	public String getSchool_name() {
		return school_name;
	}
	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

		
	}
	


