package com.condigence.Neerseva.order.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.condigence.Neerseva.order.dto.InvoiceDetail;
import com.condigence.Neerseva.order.entity.Item;
import com.condigence.Neerseva.order.entity.User;
import com.condigence.Neerseva.order.services.CustomerService;
import com.condigence.Neerseva.order.services.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	@Autowired
	private CustomerService customerService;

	@RequestMapping(value = "/")
	public String Order() {
		return "Order Detail";
	}

	/*
	 * customer A added 2 bislary botel , 3 kinly and 1 50 lit ken from shopA.
	 *
	 * map key is Item, value is no of Item
	 *
	 *
	 *
	 *
	 */

	@RequestMapping(value = "/getInvoice", method = RequestMethod.POST)
	public InvoiceDetail getInvoiceDetail(int userId, HashMap<Item, Integer> itemMap) {
		InvoiceDetail invoiceDtail = new InvoiceDetail();
		User customer = customerService.getCustomerDetail(userId);
		if (null != customer) {
			if (customer.getUserIsActive() && ("C").equalsIgnoreCase(customer.getUserTypeID())) {
				Integer totalPrice = 0;
				Integer price = 0;
				for (Map.Entry<Item, Integer> item : itemMap.entrySet()) {
					if (item.getKey().getItemIsActive()) {
						Integer availableQuantity = orderService.getItemDetailFromStock(item.getKey());
						if (availableQuantity > item.getValue()) {
							price = orderService.getItemPrice(item.getKey()) * item.getValue(); // by checking item mrp
							orderService.updateItemQuantyinStock(item.getKey().getItemId(),
									(availableQuantity - item.getValue()));
							invoiceDtail = generateInvoiceDetal(item.getKey(), price, "AVAILABLE", availableQuantity);
						} else if (availableQuantity < item.getValue() && availableQuantity > 0) {
							invoiceDtail = generateInvoiceDetal(item.getKey(), price, "LIMITED", availableQuantity);
						}
						invoiceDtail = generateInvoiceDetal(item.getKey(), price, "NOT_IN_STOCK", availableQuantity);
					}
					totalPrice = totalPrice + price;
				} // for loop close
				invoiceDtail.setTotalInvoicePrice(totalPrice);
			}
		}
		System.out.println("invoiceDtail***************" + invoiceDtail);
		return invoiceDtail;
	}

	private InvoiceDetail generateInvoiceDetal(Item item, Integer totalPrice, String status,
			Integer availableQuantity) {
		// TODO Auto-generated method stub
		InvoiceDetail invoiceDtail = new InvoiceDetail();
		// item.setItemTotalPrice(totalPrice);
		invoiceDtail.setItem(item);
		invoiceDtail.setStatus(status);

		return invoiceDtail;

	}
	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 *
	 * OrderController o = new OrderController(); HashMap<Item, Integer> itemMap =
	 * new HashMap<>(); Item item1 = new Item(); item1.setItemId(1);
	 * item1.setItemBrand("Bislery"); item1.setItemPrice(20);
	 * item1.setItemIsActive(true); itemMap.put(item1, 5);
	 *
	 * Item item2 = new Item(); item2.setItemId(2); item2.setItemBrand("Ken");
	 * item2.setItemPrice(10); item2.setItemIsActive(true); itemMap.put(item2, 5);
	 *
	 * o.getInvoiceDetail(100, itemMap);
	 *
	 * }
	 */
}
