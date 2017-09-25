package com.bujak.service;

import com.bujak.model.Customer;
import com.bujak.repository.CustomerRepository;
import com.bujak.repository.CustomerRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
