package com.condigence.Neerseva.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condigence.Neerseva.order.entity.Order;

public interface OrderDAO extends JpaRepository<Order, Integer> {

}
