package com.shivam.microservices.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.microservices.limitservice.bean.LimitonfigController;

@RestController
public class LimitsConfigController {
	@Autowired
	Configration configration;
		@GetMapping("/limits")
		public LimitonfigController retrive(){
					return new LimitonfigController(configration.getMax(),configration.getMin());
		}
}
