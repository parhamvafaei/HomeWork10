package org.example.repository.impl;

import org.example.config.DBConfig;
import org.example.entity.ProductOrder;
import org.example.exception.NotFoundException;
import org.example.repository.ProductOrderRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductOrderRepositoryImpl implements ProductOrderRepository {


    @Override
    public ProductOrder read(ProductOrder productOrder) {
        return null;
    }

    @Override
    public void create(ProductOrder productOrder) {
        String query = """
                insert into product_order (order_id, product_id, price, count)
                values (?,?,?,?)
                """;
        try (PreparedStatement ps = DBConfig.getConnection().prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            ps.setLong(1, productOrder.getOrderId());
            ps.setLong(2, productOrder.getProductId());
            ps.setInt(3, productOrder.getPrice());
            ps.setInt(4, productOrder.getCount());
            ps.execute();
            ResultSet rs = ps.getGeneratedKeys();
            rs.next();
            productOrder.setId(rs.getLong(1));
            rs.close();
        } catch (SQLException e) {
            throw new NotFoundException("This product not found!");
        }
    }

    @Override
    public void update(ProductOrder productOrder) {
        String query = """
                update product_order
                set price = ?, count = ?
                where id =?
                """;
        try (PreparedStatement ps = DBConfig.getConnection().prepareStatement(query)) {
            ps.setInt(1, productOrder.getPrice());
            ps.setInt(2, productOrder.getCount());
            ps.setLong(3, productOrder.getId());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Can't update product_order");
        }
    }

    @Override
    public void delete(ProductOrder productOrder) {
        String query = """
                delete from product_order
                where id =? and order_id = ? and product_id = ?
                """;
        try (PreparedStatement ps = DBConfig.getConnection().prepareStatement(query)) {
            ps.setLong(1, productOrder.getId());
            ps.setLong(2, productOrder.getOrderId());
            ps.setLong(3, productOrder.getProductId());
            ps.execute();
        } catch (SQLException e) {
            throw new RuntimeException("Can't delete from product_order", e);
        }
    }
}
