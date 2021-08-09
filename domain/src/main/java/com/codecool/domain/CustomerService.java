package com.codecool.domain;

import java.util.List;

public class CustomerService {

    private final CustomerDao customerDao;


    public CustomerService(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> showCustomers() {
        return customerDao.getAll();
    }
}
