package com.school.school1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;






@RestController
public class SchoolController {
	@Autowired
	private SchoolRepo er;
	ArrayList<SchoolEntity> transformedvalues=new ArrayList<SchoolEntity>();
	@GetMapping("/sample") 
	public List<SchoolEntity> getSample(){
		int count = 0;
		for(SchoolEntity emt:er.findAll()) {
    		SchoolEntity temp=new SchoolEntity();
    		temp.setRoll_no(emt.getRoll_no());
    		temp.setSchool_name(emt.getSchool_name());
    		transformedvalues.add(temp);
    		
    		count ++;
    		if (count == 5) {
    			break;
    		}
    		
    	}
		return transformedvalues;
		
			
		}
    
		
		
	 
	
}
	
    	
    
	



