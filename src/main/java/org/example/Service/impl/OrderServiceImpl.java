package org.example.Service.impl;


import org.example.Service.OrderService;
import org.example.Service.ProductOrderService;
import org.example.entity.Order;
import org.example.repository.OrderRepository;
import org.example.repository.impl.OrderRepositoryImpl;

public class OrderServiceImpl implements OrderService {


    @Override
    public Order load(long id) {
        return null;
    }

    @Override
    public void add(long customerId) {

    }



    @Override
    public int numberOfProduct(long id) {
        return 0;
    }
}