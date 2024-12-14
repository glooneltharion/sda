package com.sda.sdaspring.repositories;

import com.sda.sdaspring.models.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}