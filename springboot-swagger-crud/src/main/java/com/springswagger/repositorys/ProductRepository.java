package com.springswagger.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springswagger.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}