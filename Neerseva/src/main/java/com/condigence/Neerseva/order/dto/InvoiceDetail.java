package com.condigence.Neerseva.order.dto;

import com.condigence.Neerseva.order.entity.Item;

public class InvoiceDetail {

	private String status;
	Item item;
	private Integer itemQuantity;

	private Integer totalInvoicePrice;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the item
	 */
	public Item getItem() {
		return item;
	}

	/**
	 * @param item the item to set
	 */
	public void setItem(Item item) {
		this.item = item;
	}

	/**
	 * @return the itemQuantity
	 */
	public Integer getItemQuantity() {
		return itemQuantity;
	}

	/**
	 * @param itemQuantity the itemQuantity to set
	 */
	public void setItemQuantity(Integer itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	/**
	 * @return the totalInvoicePrice
	 */
	public Integer getTotalInvoicePrice() {
		return totalInvoicePrice;
	}

	/**
	 * @param totalInvoicePrice the totalInvoicePrice to set
	 */
	public void setTotalInvoicePrice(Integer totalInvoicePrice) {
		this.totalInvoicePrice = totalInvoicePrice;
	}

	@Override
	public String toString() {
		return "InvoiceDetail [status=" + status + ", item=" + item + ", itemQuantity=" + itemQuantity
				+ ", totalInvoicePrice=" + totalInvoicePrice + "]";
	}

}
