package com.bujak;

import com.bujak.service.CustomerService;
import com.bujak.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerServie() {
        return new CustomerServiceImpl();
    }
}
