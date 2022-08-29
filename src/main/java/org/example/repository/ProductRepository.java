package org.example.repository;

import org.example.base.BaseRepository;
import org.example.entity.Product;

import java.util.List;

public interface ProductRepository extends BaseRepository<Product, Long> {
   List<Product> readAll();
}