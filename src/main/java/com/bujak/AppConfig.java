package com.bujak;

import com.bujak.model.Customer;
import com.bujak.repository.CustomerRepository;
import com.bujak.repository.CustomerRepositoryImpl;
import com.bujak.service.CustomerService;
import com.bujak.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerServie() {
        CustomerServiceImpl service = new CustomerServiceImpl();
        service.setCustomerRepository(getCustomerRepository());
        return service;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new CustomerRepositoryImpl();
    }
}
