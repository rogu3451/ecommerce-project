package com.karolrogozinski.dao;

import com.karolrogozinski.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
