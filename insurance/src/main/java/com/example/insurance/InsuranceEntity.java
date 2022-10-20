package com.example.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_policy_types")
public class InsuranceEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer insurance_policy_type_code;
	private String insurance_policy_typre_name;
	public Integer getInsurance_policy_type_code() {
		return insurance_policy_type_code;
	}
	public void setInsurance_policy_type_code(Integer insurance_policy_type_code) {
		this.insurance_policy_type_code = insurance_policy_type_code;
	}
	public String getInsurance_policy_typre_name() {
		return insurance_policy_typre_name;
	}
	public void setInsurance_policy_typre_name(String insurance_policy_typre_name) {
		this.insurance_policy_typre_name = insurance_policy_typre_name;
	}

}
