package com.coletoindustries.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coletoindustries.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
