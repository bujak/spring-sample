package com.bujak.repository;

import com.bujak.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

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
