package com.happysat.microservices.order.repository;

import com.happysat.microservices.order.modal.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
