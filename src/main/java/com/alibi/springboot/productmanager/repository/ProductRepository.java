package com.alibi.springboot.productmanager.repository;

import com.alibi.springboot.productmanager.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    public List<Product> findByCategoryId(Long id);
}
