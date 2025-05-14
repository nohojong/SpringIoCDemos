package com.nhj.ioc.containeroverview.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.nhj.ioc.containeroverview.service.AccountService;
import com.nhj.ioc.containeroverview.service.DefaultServiceLocator;
import com.nhj.ioc.containeroverview.service.ServerService;

@Configuration
public class serviceLocator {
	
	@Bean
	public DefaultServiceLocator serviceLocator() {
		return new DefaultServiceLocator();
	}

	@Bean
	public ServerService serverService(DefaultServiceLocator serviceLocator) {
		return serviceLocator.createServerServiceInstance();
	}
	
	@Bean
    public AccountService accountService (DefaultServiceLocator serviceLocator) {
		return serviceLocator.createAccountServiceInstance();
    }
	
}
