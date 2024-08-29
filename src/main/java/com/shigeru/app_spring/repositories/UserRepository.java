package com.shigeru.app_spring.repositories;

import com.shigeru.app_spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
