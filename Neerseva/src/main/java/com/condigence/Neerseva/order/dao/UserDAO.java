package com.condigence.Neerseva.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.condigence.Neerseva.order.entity.User;

public interface UserDAO extends JpaRepository<User, Integer> {

}
