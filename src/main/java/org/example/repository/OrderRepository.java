package org.example.repository;

import org.example.base.BaseRepository;
import org.example.entity.Order;

import java.util.List;

public interface OrderRepository extends BaseRepository<Order, Long> {
    List<Order> readAll(long CustomerId);

    Order readPendingOrder(long customerId);
}