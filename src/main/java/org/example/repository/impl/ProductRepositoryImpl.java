package org.example.repository.impl;

import org.example.config.DBConfig;
import org.example.entity.Product;
import org.example.exception.NotFoundException;
import org.example.repository.ProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public Product read(Long id) {
        String query = """
                select * from product
                where id = ?
                """;
        Product product = null;
        try (PreparedStatement ps = DBConfig.getConnection().prepareStatement(query)) {
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            product = getProduct(rs);

        } catch (SQLException e) {
            throw new NotFoundException("This product not found!");
        }
        return product;
    }

    @Override
    public void create(Product product) {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public void update(Product product) {
        throw new RuntimeException("Not implemented.");
    }

    @Override
    public void delete(Product product) {
        throw new RuntimeException("Not implemented.");
    }




    private Product getProduct(ResultSet rs) throws SQLException {
        return new Product(rs.getLong("id"),
                rs.getString("name"),
                rs.getString("category"),
                rs.getString("type"),
                rs.getInt("quantity"),
                rs.getBoolean("is_exist"),
                rs.getInt("price")
        );

    }
}