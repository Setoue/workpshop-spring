package com.shigeru.app_spring.repositories;

import com.shigeru.app_spring.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
