package com.country2.crud;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;

	@GetMapping("/sample") 
	public List<EmployeeEntity> getSample(){
		ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
    	for(EmployeeEntity emt:er.findAll()) {
    		EmployeeEntity temp=new EmployeeEntity();
    		temp.setId(emt.getId());
    		if(emt.getEmployee_name().contains("#")) {
    			temp.setEmployee_name(emt.getEmployee_name().replaceAll("\\#", ""));
    		}
    		transformedvalues.add(temp);
    	}
    	return transformedvalues;
	}
	@GetMapping("/employeename")
	public List<String> getdata(){
		ArrayList<String> ename=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		ename.add(emt.getEmployee_name());
    		
    	}
    	return ename;
	}
	@GetMapping("/id") 
	public List<Integer> getid(){
		ArrayList<Integer> id=new ArrayList<Integer>();
    	for(EmployeeEntity emt:er.findAll()) {
    		id.add(emt.getId());
    	}
    	return id;
	}
	@GetMapping("/a") 
	public ArrayList<String> geta(){

		ArrayList<String> temp=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		if(emt.getEmployee_name().startsWith("a")) {
    			temp.add(emt.getEmployee_name());
    		}
    	}
    	return temp;
	}
	@GetMapping("/deptname")
	public List<String> getdept(){
		ArrayList<String> edept=new ArrayList<String>();
    	for(EmployeeEntity emt:er.findAll()) {
    		edept.add(emt.getDepartment());
    		
    	}
    	return edept;
	}
	
	
}
	
