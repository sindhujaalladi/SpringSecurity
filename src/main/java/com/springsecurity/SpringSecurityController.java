package com.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api/security")
public class SpringSecurityController {
	
	@GetMapping("/retrievedata")
	public String retrievedata()
	{
		return "sindhuja!!!welcome to spring security..please learn ";
	}

}
