package com.nhj.ioc.containeroverview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BService {
	
	private AService aService;
	
	@Autowired
	public BService (AService aService) {
		this.aService=aService;
	}
	
}
