package com.nhj.ioc.containeroverview.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AService {

private BService bService;
	
	@Autowired
	public AService (BService bService) {
		this.bService=bService;
	}
	
}
