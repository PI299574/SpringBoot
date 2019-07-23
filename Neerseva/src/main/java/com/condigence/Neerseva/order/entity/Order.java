package com.condigence.Neerseva.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Order_table")
public class Order {

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "orderId")
	private int orderId;

	@Column(name = "orderNumber")
	@Getter
	@Setter
	private int orderNumber;

	@Column(name = "orderDate")
	@Getter
	@Setter
	private Date orderDate;

	@Column(name = "orderTime")
	@Getter
	@Setter
	private Date orderTime;

	@Column(name = "orderByCustomerContact")
	@Getter
	@Setter
	private String orderByCustomerContact;

	@Column(name = "orderByCustomerEmail")
	@Getter
	@Setter
	private String orderByCustomerEmail;

	@Column(name = "orderStatus")
	@Getter
	@Setter
	private String orderStatus;

	@Column(name = "orderLocationCode")
	@Getter
	@Setter
	private String orderLocationCode;

	@Column(name = "orderType")
	@Getter
	@Setter
	private String orderType;

	@Column(name = "orderIsCancelled")
	@Getter
	@Setter
	private String orderIsCancelled;

	@Column(name = "orderIsPaid")
	@Getter
	@Setter
	private String orderIsPaid;

	@Column(name = "orderPaymentType")
	@Getter
	@Setter
	private String orderPaymentType;

	@Column(name = "orderPaymentDate")
	@Getter
	@Setter
	private String orderPaymentDate;

	@Column(name = "orderPaymentTime")
	@Getter
	@Setter
	private String orderPaymentTime;

	@Column(name = "orderPaymentMethod")
	@Getter
	@Setter
	private String orderPaymentMethod;

	@Column(name = "orderpayamentTxnId")
	@Getter
	@Setter
	private String orderpayamentTxnId;

	@Column(name = "orderPaymentCustContact")
	@Getter
	@Setter
	private String orderPaymentCustContact;

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderNumber=" + orderNumber + ", orderDate=" + orderDate
				+ ", orderTime=" + orderTime + ", orderByCustomerContact=" + orderByCustomerContact
				+ ", orderByCustomerEmail=" + orderByCustomerEmail + ", orderStatus=" + orderStatus
				+ ", orderLocationCode=" + orderLocationCode + ", orderType=" + orderType + ", orderIsCancelled="
				+ orderIsCancelled + ", orderIsPaid=" + orderIsPaid + ", orderPaymentType=" + orderPaymentType
				+ ", orderPaymentDate=" + orderPaymentDate + ", orderPaymentTime=" + orderPaymentTime
				+ ", orderPaymentMethod=" + orderPaymentMethod + ", orderpayamentTxnId=" + orderpayamentTxnId
				+ ", orderPaymentCustContact=" + orderPaymentCustContact + "]";
	}

}
