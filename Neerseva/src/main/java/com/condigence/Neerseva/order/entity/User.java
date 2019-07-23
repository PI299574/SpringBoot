package com.condigence.Neerseva.order.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "User")
public class User {

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "userId")
	@Getter
	@Setter
	private int userId;

	@Column(name = "userName")
	@Getter
	@Setter
	private String userName;

	@Column(name = "userContact")
	@Getter
	@Setter
	private int userContact;

	@Column(name = "userEmail")
	@Getter
	@Setter
	private String userEmail;

	@Column(name = "userAddressID")
	@Getter
	@Setter
	private String userAddressID;

	@Column(name = "userTypeID")
	@Getter
	@Setter
	private String userTypeID;

	@Column(name = "userIsDeleted")
	@Getter
	@Setter
	private String userIsDeleted;

	@Column(name = "userIsActive")
	@Getter
	@Setter
	private boolean userIsActive;

	@Column(name = "userDateCreated")
	@Getter
	@Setter
	private Date userDateCreated;

	@Column(name = "userIsProfileCompleted")
	@Getter
	@Setter
	private String userIsProfileCompleted;

	@Column(name = "userProfileId")
	@Getter
	@Setter
	private int userProfileId;

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userContact=" + userContact + ", userEmail="
				+ userEmail + ", userAddressID=" + userAddressID + ", userTypeID=" + userTypeID + ", userIsDeleted="
				+ userIsDeleted + ", userIsActive=" + userIsActive + ", userDateCreated=" + userDateCreated
				+ ", userIsProfileCompleted=" + userIsProfileCompleted + ", userProfileId=" + userProfileId + "]";
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the userContact
	 */
	public int getUserContact() {
		return userContact;
	}

	/**
	 * @param userContact the userContact to set
	 */
	public void setUserContact(int userContact) {
		this.userContact = userContact;
	}

	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @return the userAddressID
	 */
	public String getUserAddressID() {
		return userAddressID;
	}

	/**
	 * @param userAddressID the userAddressID to set
	 */
	public void setUserAddressID(String userAddressID) {
		this.userAddressID = userAddressID;
	}

	/**
	 * @return the userTypeID
	 */
	public String getUserTypeID() {
		return userTypeID;
	}

	/**
	 * @param userTypeID the userTypeID to set
	 */
	public void setUserTypeID(String userTypeID) {
		this.userTypeID = userTypeID;
	}

	/**
	 * @return the userIsDeleted
	 */
	public String getUserIsDeleted() {
		return userIsDeleted;
	}

	/**
	 * @param userIsDeleted the userIsDeleted to set
	 */
	public void setUserIsDeleted(String userIsDeleted) {
		this.userIsDeleted = userIsDeleted;
	}

	/**
	 * @return the userIsActive
	 */
	public boolean getUserIsActive() {
		return userIsActive;
	}

	/**
	 * @param userIsActive the userIsActive to set
	 */
	public void setUserIsActive(boolean userIsActive) {
		this.userIsActive = userIsActive;
	}

	/**
	 * @return the userDateCreated
	 */
	public Date getUserDateCreated() {
		return userDateCreated;
	}

	/**
	 * @param userDateCreated the userDateCreated to set
	 */
	public void setUserDateCreated(Date userDateCreated) {
		this.userDateCreated = userDateCreated;
	}

	/**
	 * @return the userIsProfileCompleted
	 */
	public String getUserIsProfileCompleted() {
		return userIsProfileCompleted;
	}

	/**
	 * @param userIsProfileCompleted the userIsProfileCompleted to set
	 */
	public void setUserIsProfileCompleted(String userIsProfileCompleted) {
		this.userIsProfileCompleted = userIsProfileCompleted;
	}

	/**
	 * @return the userProfileId
	 */
	public int getUserProfileId() {
		return userProfileId;
	}

	/**
	 * @param userProfileId the userProfileId to set
	 */
	public void setUserProfileId(int userProfileId) {
		this.userProfileId = userProfileId;
	}

}
