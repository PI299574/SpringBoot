package com.condigence.Neerseva.order.services;

import com.condigence.Neerseva.order.entity.Item;

public interface OrderService {

	Integer getItemDetailFromStock(Item item);

	int getItemPrice(Item item);

	void updateItemQuantyinStock(int itemId, int value);

}
