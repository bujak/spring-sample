package com.bujak.repository;

import com.bujak.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();
}
