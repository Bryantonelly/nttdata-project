package com.nttdata.escuelajava.project.service;

import java.util.List;

import com.nttdata.escuelajava.project.bean.Customer;

public interface CustomerService {
	List<Customer> getAllCustomer();
    Customer getCustomerById(Long id);
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Long id, Customer customer);
    void deleteCustomer(Long id);
}
