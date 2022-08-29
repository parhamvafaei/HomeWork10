package org.example.Service;

import org.example.entity.Order;
import org.example.entity.OrderStatus;

public interface OrderService {
    Order load(long id);
    void add(long customerId);

    int numberOfProduct (long id);
}