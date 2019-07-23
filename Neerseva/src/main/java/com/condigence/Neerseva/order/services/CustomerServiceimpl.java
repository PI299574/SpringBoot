package com.condigence.Neerseva.order.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.condigence.Neerseva.order.dao.UserDAO;
import com.condigence.Neerseva.order.entity.User;

@Service("customer")
public class CustomerServiceimpl implements CustomerService {

	@Autowired
	private UserDAO userdao;

	@Override
	public User getCustomerDetail(int userId) {
		// TODO Auto-generated method stub
		/*
		 * User u = new User(); u.setUserId(100); u.setUserIsActive(true);
		 * u.setUserTypeID("C");
		 */
		return (userdao.findById(userId)).get();

	}

}
