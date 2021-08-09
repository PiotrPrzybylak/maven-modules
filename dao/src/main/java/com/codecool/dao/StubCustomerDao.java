package com.codecool.dao;

import com.codecool.domain.Customer;
import com.codecool.domain.CustomerDao;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class StubCustomerDao implements CustomerDao {

    @Override
    public List<Customer> getAll() {
        return null;
    }
}
