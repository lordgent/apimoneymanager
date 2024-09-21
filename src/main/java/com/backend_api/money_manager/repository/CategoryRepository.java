package com.backend_api.money_manager.repository;

import com.backend_api.money_manager.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<String, Category> {
}
