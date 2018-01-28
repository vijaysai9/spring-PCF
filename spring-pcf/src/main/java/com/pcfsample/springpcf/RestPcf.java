package com.pcfsample.springpcf;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestPcf {
	
	@RequestMapping("/hello")
	String getMessage(@RequestParam(value = "name") String name) {
		
		String restpcf = name + new Date() + " :given response" ;
		System.out.println(restpcf);
		
		return restpcf;
		
	}
	
	

}
