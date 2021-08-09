package com.codecool.web;

import com.codecool.domain.CustomerDao;
import com.codecool.domain.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.codecool");

        CustomerDao customerDao = context.getBean(CustomerDao.class);
        CustomerController customerController = new CustomerController(new CustomerService(customerDao));

        System.out.println(customerDao.getAll());

    }

}

