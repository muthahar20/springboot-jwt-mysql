package com.mtr.springbootjwtmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mtr.springbootjwtmysql.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}