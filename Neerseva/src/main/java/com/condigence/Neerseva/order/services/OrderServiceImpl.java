package com.condigence.Neerseva.order.services;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condigence.Neerseva.order.dao.ItemDAO;
import com.condigence.Neerseva.order.dao.StockDAO;
import com.condigence.Neerseva.order.entity.Item;

@Service("order")
public class OrderServiceImpl implements OrderService {

	static HashMap<Integer, Integer> stockMap = new HashMap<>();
	@Autowired
	private StockDAO stockdao;
	@Autowired
	private ItemDAO itemdao;

	public OrderServiceImpl() {
		stockMap.put(1, 100);
		stockMap.put(1, 50);
	}

	@Override
	public Integer getItemDetailFromStock(Item item) {
		// TODO Auto-generated method stub

		System.out.println("Inside getItemDetailFromStock****");
		/*
		 * for (Map.Entry<Integer, Integer> map : stockMap.entrySet()) {
		 * System.out.println("Item Id " + map.getKey()); System.out.println("Item Id "
		 * + map.getValue()); } return stockMap.get(item.getItemId());
		 */
		// return itemQuantity;

		Integer stockQuantity = stockdao.findItemBystockItemId(item.getItemId());
		return stockQuantity;

	}

	@Override
	public int getItemPrice(Item item) {
		// TODO Auto-generated method stub
		int itemPrice = itemdao.findById(item.getItemId()).get().getItemPrice();

		// return item.getItemPrice();

		return itemPrice;
	}

	@Override
	public void updateItemQuantyinStock(int itemId, int remainQuantity) {
		// TODO Auto-generated method stub
		/*
		 * stockMap.put(itemId, (stockMap.get(remainQuantity));
		 * System.out.println("Inside Update Stock detail****"); for (Map.Entry<Integer,
		 * Integer> map : stockMap.entrySet()) { System.out.println("Item Id " +
		 * map.getKey()); System.out.println("Item Id " + map.getValue()); }
		 */

		stockdao.setitemQuantityInStock(remainQuantity, itemId);

		// or

	}

}