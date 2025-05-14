package com.nhj.ioc.containeroverview;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nhj.ioc.containeroverview.config.AppConfig;
import com.nhj.ioc.containeroverview.service.PetStoreServiceImpl;

public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context = 
        		new AnnotationConfigApplicationContext(AppConfig.class);

        PetStoreServiceImpl petStoreService = 
        		context.getBean(PetStoreServiceImpl.class);
        
        // petStoreService를 사용하여 비즈니스 로직 수행
        petStoreService.addItem("dog");
    }
<<<<<<< HEAD
<<<<<<< HEAD
           
=======
    
>>>>>>> 23f6eb2205f94135d7d2e7ae042209e19bae64df
=======
    
>>>>>>> 23f6eb2205f94135d7d2e7ae042209e19bae64df
}