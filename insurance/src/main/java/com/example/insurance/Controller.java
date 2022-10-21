package com.example.insurance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private ClientRepo c;
	
	@GetMapping("/details")
	public List<ClientEntity> joinclient(){
		return c.getjoinclient(5);
	}
	@GetMapping("/client_discount/{ten}/{premium}")
	public int discount(@PathVariable String ten, @PathVariable int premium) {
		
		String more = "morethanfive";
		String less = "lessthanfive";
		String equal = "equalfive";
		if(ten.equals(less)) {
			return premium;
			
		}
		if(ten.equals(equal)) {
			int per = 10*premium/100;
			premium=premium-per;
			return premium;
		}
		else if(ten.equals(more)) {
			int per = 12*premium/100;
			premium=premium-per;
			return premium;
			
		}
		return 0;
	}

}
