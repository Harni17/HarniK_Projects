package com.HarniK.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HarniK.SportyShoes.entity.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
