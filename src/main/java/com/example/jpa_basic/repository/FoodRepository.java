package com.example.jpa_basic.repository;

import com.example.jpa_basic.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
