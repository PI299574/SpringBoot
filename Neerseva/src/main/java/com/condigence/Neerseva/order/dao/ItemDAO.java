package com.condigence.Neerseva.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condigence.Neerseva.order.entity.Item;

public interface ItemDAO extends JpaRepository<Item, Integer> {

}
