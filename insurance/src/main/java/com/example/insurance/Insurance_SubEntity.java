package com.example.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="insurance_policy_sub_types")
public class Insurance_SubEntity {
	

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer policy_type_id;
	private Integer policy_type_code;
	private String description;
	private Integer yearsofpayment;
	private Integer amount;
	private Integer maturityperiod;
	private Integer validity;
	public Integer getPolicy_type_id() {
		return policy_type_id;
	}
	public void setPolicy_type_id(Integer policy_type_id) {
		this.policy_type_id = policy_type_id;
	}
	public Integer getPolicy_type_code() {
		return policy_type_code;
	}
	public void setPolicy_type_code(Integer policy_type_code) {
		this.policy_type_code = policy_type_code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getYearsofpayment() {
		return yearsofpayment;
	}
	public void setYearsofpayment(Integer yearsofpayment) {
		this.yearsofpayment = yearsofpayment;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public Integer getMaturityperiod() {
		return maturityperiod;
	}
	public void setMaturityperiod(Integer maturityperiod) {
		this.maturityperiod = maturityperiod;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	

}
