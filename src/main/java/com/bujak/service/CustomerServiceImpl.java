package com.bujak.service;

import com.bujak.model.Customer;
import com.bujak.repository.CustomerRepository;
import com.bujak.repository.CustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
