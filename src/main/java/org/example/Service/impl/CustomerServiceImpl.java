package org.example.Service.impl;

import org.example.Service.CustomerService;
import org.example.Service.OrderService;
import org.example.entity.Customer;
import org.example.entity.Order;
import org.example.repository.CustomerRepository;
import org.example.repository.impl.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    OrderService orderService = new OrderServiceImpl();

    @Override
    public Customer login(Customer customer) {
        return customerRepository.read(customer);
    }

    @Override
    public Order loadPendingOrder(long customerId) {
        return orderService.loadPendingOrder(customerId);
    }
}