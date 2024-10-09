package com.shigeru.app_spring.repositories;

import com.shigeru.app_spring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
