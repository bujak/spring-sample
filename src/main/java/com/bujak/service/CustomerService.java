package com.bujak.service;

import com.bujak.model.Customer;

import java.util.List;

/**
 * Created by bujak on 23.09.2017.
 */
public interface CustomerService {
    List<Customer> findAll();
}
