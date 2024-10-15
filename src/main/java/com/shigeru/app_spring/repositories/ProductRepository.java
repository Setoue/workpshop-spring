package com.shigeru.app_spring.repositories;

import com.shigeru.app_spring.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
