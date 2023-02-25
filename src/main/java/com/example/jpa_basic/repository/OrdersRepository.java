package com.example.jpa_basic.repository;

import com.example.jpa_basic.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Long> {
}
