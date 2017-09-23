package com.bujak;

import com.bujak.model.Customer;
import com.bujak.service.CustomerService;
import com.bujak.service.CustomerServiceImpl;

/**
 * Created by bujak on 23.09.2017.
 */
public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
