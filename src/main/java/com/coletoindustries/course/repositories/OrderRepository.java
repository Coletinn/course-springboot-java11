package com.coletoindustries.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coletoindustries.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
