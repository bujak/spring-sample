package com.bujak.repository;

import com.bujak.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();
        customer.setFirstName("Jonh");
        customer.setLastName("Doe");

        customers.add(customer);
        return customers;
    }

}
