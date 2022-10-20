package com.example.insurance;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="client_details")
public class ClientEntity {
	public Integer getClient_id() {
		return client_id;
	}
	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}
	public String getClient_firstname() {
		return client_firstname;
	}
	public void setClient_firstname(String client_firstname) {
		this.client_firstname = client_firstname;
	}
	public String getClient_lastname() {
		return client_lastname;
	}
	public void setClient_lastname(String client_lastname) {
		this.client_lastname = client_lastname;
	}
	public String getClient_email() {
		return client_email;
	}
	public void setClient_email(String client_email) {
		this.client_email = client_email;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	private Integer client_id;
	private String client_firstname;
	private String client_lastname;
	private String client_email;
	private String insurance_policy_name;
	private String insurace_term_plan;
	public String getInsurance_policy_name() {
		return insurance_policy_name;
	}
	public void setInsurance_policy_name(String insurance_policy_name) {
		this.insurance_policy_name = insurance_policy_name;
	}
	public String getInsurace_term_plan() {
		return insurace_term_plan;
	}
	public void setInsurace_term_plan(String insurace_term_plan) {
		this.insurace_term_plan = insurace_term_plan;
	}

}
