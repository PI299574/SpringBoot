package com.condigence.Neerseva.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "stock")
public class Stock {

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "stockId")
	@Getter
	@Setter
	private int stockId;

	@Column(name = "stockQuantity")
	@Getter
	@Setter
	private int stockQuantity;

	@Column(name = "stockItemId")
	@Getter
	@Setter
	private int stockItemId;

	@Column(name = "stockDateCreated")
	@Getter
	@Setter
	private Date stockDateCreated;

	@Column(name = "stockCreatedByUser")
	@Getter
	@Setter
	private String stockCreatedByUser;

	@Column(name = "stockIsAvailable")
	@Getter
	@Setter
	private boolean stockIsAvailable;

	@Column(name = "stockIsDeleted")
	@Getter
	@Setter
	private String stockIsDeleted;

	/**
	 * @return the stockId
	 */
	public int getStockId() {
		return stockId;
	}

	/**
	 * @param stockId the stockId to set
	 */
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	/**
	 * @return the stockQuantity
	 */
	public int getStockQuantity() {
		return stockQuantity;
	}

	/**
	 * @param stockQuantity the stockQuantity to set
	 */
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	/**
	 * @return the stockItemId
	 */
	public int getStockItemId() {
		return stockItemId;
	}

	/**
	 * @param stockItemId the stockItemId to set
	 */
	public void setStockItemId(int stockItemId) {
		this.stockItemId = stockItemId;
	}

	/**
	 * @return the stockDateCreated
	 */
	public Date getStockDateCreated() {
		return stockDateCreated;
	}

	/**
	 * @param stockDateCreated the stockDateCreated to set
	 */
	public void setStockDateCreated(Date stockDateCreated) {
		this.stockDateCreated = stockDateCreated;
	}

	/**
	 * @return the stockCreatedByUser
	 */
	public String getStockCreatedByUser() {
		return stockCreatedByUser;
	}

	/**
	 * @param stockCreatedByUser the stockCreatedByUser to set
	 */
	public void setStockCreatedByUser(String stockCreatedByUser) {
		this.stockCreatedByUser = stockCreatedByUser;
	}

	/**
	 * @return the stockIsAvailable
	 */
	public boolean getStockIsAvailable() {
		return stockIsAvailable;
	}

	/**
	 * @param stockIsAvailable the stockIsAvailable to set
	 */
	public void setStockIsAvailable(boolean stockIsAvailable) {
		this.stockIsAvailable = stockIsAvailable;
	}

	/**
	 * @return the stockIsDeleted
	 */
	public String getStockIsDeleted() {
		return stockIsDeleted;
	}

	/**
	 * @param stockIsDeleted the stockIsDeleted to set
	 */
	public void setStockIsDeleted(String stockIsDeleted) {
		this.stockIsDeleted = stockIsDeleted;
	}

	@Override
	public String toString() {
		return "stock [stockId=" + stockId + ", stockQuantity=" + stockQuantity + ", stockItemId=" + stockItemId
				+ ", stockDateCreated=" + stockDateCreated + ", stockCreatedByUser=" + stockCreatedByUser
				+ ", stockIsAvailable=" + stockIsAvailable + ", stockIsDeleted=" + stockIsDeleted + "]";
	}

}
