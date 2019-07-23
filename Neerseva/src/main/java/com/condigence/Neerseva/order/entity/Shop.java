package com.condigence.Neerseva.order.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "shop")
public class Shop {

	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "shopId")
	@Getter
	@Setter
	private int shopId;

	@Column(name = "shopName")
	@Getter
	@Setter
	private String shopName;

	@Column(name = "shopImageId")
	@Getter
	@Setter
	private String shopImageId;

	@Column(name = "shopType")
	@Getter
	@Setter
	private String shopType;

	@Column(name = "shopAddressId")
	@Getter
	@Setter
	private String shopAddressId;

	@Column(name = "shopCode")
	@Getter
	@Setter
	private String shopCode;

	@Column(name = "shopBranch")
	@Getter
	@Setter
	private String shopBranch;

	@Override
	public String toString() {
		return "shop [shopId=" + shopId + ", shopName=" + shopName + ", shopImageId=" + shopImageId + ", shopType="
				+ shopType + ", shopAddressId=" + shopAddressId + ", shopCode=" + shopCode + ", shopBranch="
				+ shopBranch + "]";
	}

}
