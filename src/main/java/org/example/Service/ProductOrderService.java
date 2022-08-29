package org.example.Service;

import org.example.entity.ProductOrder;

public interface ProductOrderService {
    void add(long productId, long orderId);
    ProductOrder load(long orderId, long productId);
    void delete(long id);
    void deleteAll(long orderId);

}