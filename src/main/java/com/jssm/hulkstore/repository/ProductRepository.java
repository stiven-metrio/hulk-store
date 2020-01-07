package com.jssm.hulkstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jssm.hulkstore.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
