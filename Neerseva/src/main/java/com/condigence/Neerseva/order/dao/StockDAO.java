package com.condigence.Neerseva.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.condigence.Neerseva.order.entity.Stock;

public interface StockDAO extends JpaRepository<Stock, Integer> {

	@Query("SELECT s.stockQuantity FROM Stock s where s.stockItemId = :id")
	Integer findItemBystockItemId(@Param("id") int id);

	@Modifying
	@Query("UPDATE Stock s SET s.stockQuantity = :quantity WHERE s.stockItemId = :id")
	Integer setitemQuantityInStock(@Param("quantity") int quantity, @Param("id") int id);
}
