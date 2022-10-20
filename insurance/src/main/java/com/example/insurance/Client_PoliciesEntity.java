package com.example.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_policies")
public class Client_PoliciesEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer insurance_policy_no;
	private Integer client_id;
	private Integer date_registerd;
	private Integer insurance_policy_type_id;
	public Integer getInsurance_policy_no() {
		return insurance_policy_no;
	}
	public void setInsurance_policy_no(Integer insurance_policy_no) {
		this.insurance_policy_no = insurance_policy_no;
	}
	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	public Integer getDate_registerd() {
		return date_registerd;
	}
	public void setDate_registerd(Integer date_registerd) {
		this.date_registerd = date_registerd;
	}
	public Integer getInsurance_policy_type_id() {
		return insurance_policy_type_id;
	}
	public void setInsurance_policy_type_id(Integer insurance_policy_type_id) {
		this.insurance_policy_type_id = insurance_policy_type_id;
	}
	

}
