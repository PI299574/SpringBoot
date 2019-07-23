package com.condigence.Neerseva.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Item")
public class Item {

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "itemId")
	@Getter
	@Setter
	private int itemId;

	@Column(name = "ItemName")
	@Getter
	@Setter
	private String itemName;

	@Column(name = "itemCode")
	@Getter
	@Setter
	private String itemCode;

	@Column(name = "itemPrice")
	@Getter
	@Setter
	private int itemPrice;

	@Column(name = "itemMrp")
	@Getter
	@Setter
	private String itemMrp;

	@Column(name = "itemDispPrice")
	@Getter
	@Setter
	private Integer itemDispPrice;

	@Column(name = "itemDiscount")
	@Getter
	@Setter
	private String itemDiscount;

	@Column(name = "itemType")
	@Getter
	@Setter
	private String itemType;

	@Column(name = "itemDescription")
	@Getter
	@Setter
	private String itemDescription;

	@Column(name = "priceCapcity")
	@Getter
	@Setter
	private String priceCapcity;

	@Column(name = "itemBrand")
	@Getter
	@Setter
	private String itemBrand;

	@Column(name = "itemImageId")
	@Getter
	@Setter
	private String itemImageId;

	@Column(name = "itemdateCreated")
	@Getter
	@Setter
	private Date itemdateCreated;

	@Column(name = "itemCreatedByUser")
	@Getter
	@Setter
	private String itemCreatedByUser;

	@Column(name = "itemIsDeleted")
	@Getter
	@Setter
	private String itemIsDeleted;

	@Column(name = "itemIsActive")
	@Getter
	@Setter
	private boolean itemIsActive;

	@Column(name = "itemTax")
	@Getter
	@Setter
	private String itemTax;

	@Column(name = "itemTotalPrice")
	@Getter
	@Setter
	private int itemTotalPrice;

	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemCode
	 */
	public String getItemCode() {
		return itemCode;
	}

	/**
	 * @param itemCode the itemCode to set
	 */
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	/**
	 * @return the itemPrice
	 */
	public int getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	/**
	 * @return the itemMrp
	 */
	public String getItemMrp() {
		return itemMrp;
	}

	/**
	 * @param itemMrp the itemMrp to set
	 */
	public void setItemMrp(String itemMrp) {
		this.itemMrp = itemMrp;
	}

	/**
	 * @return the itemDispPrice
	 */
	public Integer getItemDispPrice() {
		return itemDispPrice;
	}

	/**
	 * @param totalPrice the itemDispPrice to set
	 */
	public void setItemDispPrice(Integer totalPrice) {
		this.itemDispPrice = totalPrice;
	}

	/**
	 * @return the itemDiscount
	 */
	public String getItemDiscount() {
		return itemDiscount;
	}

	/**
	 * @param itemDiscount the itemDiscount to set
	 */
	public void setItemDiscount(String itemDiscount) {
		this.itemDiscount = itemDiscount;
	}

	/**
	 * @return the itemType
	 */
	public String getItemType() {
		return itemType;
	}

	/**
	 * @param itemType the itemType to set
	 */
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * @return the priceCapcity
	 */
	public String getPriceCapcity() {
		return priceCapcity;
	}

	/**
	 * @param priceCapcity the priceCapcity to set
	 */
	public void setPriceCapcity(String priceCapcity) {
		this.priceCapcity = priceCapcity;
	}

	/**
	 * @return the itemBrand
	 */
	public String getItemBrand() {
		return itemBrand;
	}

	/**
	 * @param itemBrand the itemBrand to set
	 */
	public void setItemBrand(String itemBrand) {
		this.itemBrand = itemBrand;
	}

	/**
	 * @return the itemImageId
	 */
	public String getItemImageId() {
		return itemImageId;
	}

	/**
	 * @param itemImageId the itemImageId to set
	 */
	public void setItemImageId(String itemImageId) {
		this.itemImageId = itemImageId;
	}

	/**
	 * @return the itemdateCreated
	 */
	public Date getItemdateCreated() {
		return itemdateCreated;
	}

	/**
	 * @param itemdateCreated the itemdateCreated to set
	 */
	public void setItemdateCreated(Date itemdateCreated) {
		this.itemdateCreated = itemdateCreated;
	}

	/**
	 * @return the itemCreatedByUser
	 */
	public String getItemCreatedByUser() {
		return itemCreatedByUser;
	}

	/**
	 * @param itemCreatedByUser the itemCreatedByUser to set
	 */
	public void setItemCreatedByUser(String itemCreatedByUser) {
		this.itemCreatedByUser = itemCreatedByUser;
	}

	/**
	 * @return the itemIsDeleted
	 */
	public String getItemIsDeleted() {
		return itemIsDeleted;
	}

	/**
	 * @param itemIsDeleted the itemIsDeleted to set
	 */
	public void setItemIsDeleted(String itemIsDeleted) {
		this.itemIsDeleted = itemIsDeleted;
	}

	/**
	 * @return the itemIsActive
	 */
	public boolean getItemIsActive() {
		return itemIsActive;
	}

	/**
	 * @param itemIsActive the itemIsActive to set
	 */
	public void setItemIsActive(boolean itemIsActive) {
		this.itemIsActive = itemIsActive;
	}

	/**
	 * @return the itemTax
	 */
	public String getItemTax() {
		return itemTax;
	}

	/**
	 * @param itemTax the itemTax to set
	 */
	public void setItemTax(String itemTax) {
		this.itemTax = itemTax;
	}

	/**
	 * @return the itemTotalPrice
	 */
	public int getItemTotalPrice() {
		return itemTotalPrice;
	}

	/**
	 * @param itemTotalPrice the itemTotalPrice to set
	 */
	public void setItemTotalPrice(int itemTotalPrice) {
		this.itemTotalPrice = itemTotalPrice;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemCode=" + itemCode + ", itemPrice="
				+ itemPrice + ", itemMrp=" + itemMrp + ", itemDispPrice=" + itemDispPrice + ", itemDiscount="
				+ itemDiscount + ", itemType=" + itemType + ", itemDescription=" + itemDescription + ", priceCapcity="
				+ priceCapcity + ", itemBrand=" + itemBrand + ", itemImageId=" + itemImageId + ", itemdateCreated="
				+ itemdateCreated + ", itemCreatedByUser=" + itemCreatedByUser + ", itemIsDeleted=" + itemIsDeleted
				+ ", itemIsActive=" + itemIsActive + ", itemTax=" + itemTax + ", itemTotalPrice=" + itemTotalPrice
				+ "]";
	}

}
