package com.condigence.Neerseva.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "OrderDetail")
public class OrderDetail {

	public OrderDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "orderDetailId")
	@Getter
	@Setter
	private int orderDetailId;

	@Column(name = "orderId")
	@Getter
	@Setter
	private int orderId;

	@Column(name = "itemId")
	@Getter
	@Setter
	private int itemId;

	@Column(name = "orderItemQuantity")
	@Getter
	@Setter
	private String orderItemQuantity;

	@Column(name = "orderTotalamount")
	@Getter
	@Setter
	private String orderTotalamount;

	@Column(name = "orderDiscount")
	@Getter
	@Setter
	private String orderDiscount;

	@Column(name = "orderSubTotal")
	@Getter
	@Setter
	private String orderSubTotal;

	@Column(name = "orderIsFree")
	@Getter
	@Setter
	private String orderIsFree;

	@Column(name = "orderServiceCharge")
	@Getter
	@Setter
	private String orderServiceCharge;

	@Column(name = "orderGST")
	@Getter
	@Setter
	private String orderGST;

	@Override
	public String toString() {
		return "OrderDetail [orderDetailId=" + orderDetailId + ", orderId=" + orderId + ", itemId=" + itemId
				+ ", orderItemQuantity=" + orderItemQuantity + ", orderTotalamount=" + orderTotalamount
				+ ", orderDiscount=" + orderDiscount + ", orderSubTotal=" + orderSubTotal + ", orderIsFree="
				+ orderIsFree + ", orderServiceCharge=" + orderServiceCharge + ", orderGST=" + orderGST + "]";
	}

}
