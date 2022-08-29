package org.example.repository;

import org.example.base.BaseRepository;
import org.example.entity.ProductOrder;

import java.util.List;

public interface ProductOrderRepository extends BaseRepository<ProductOrder,ProductOrder> {


        List<ProductOrder> readAll(long orderId);
        void deleteAll(long orderId);
    }

