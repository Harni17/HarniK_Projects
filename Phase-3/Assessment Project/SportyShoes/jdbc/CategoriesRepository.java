package com.HarniK.SportyShoes.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HarniK.SportyShoes.entity.Categories;

public interface CategoriesRepository extends JpaRepository<Categories, Long> {

}
