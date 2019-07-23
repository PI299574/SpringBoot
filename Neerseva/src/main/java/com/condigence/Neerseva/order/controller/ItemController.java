package com.condigence.Neerseva.order.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.condigence.Neerseva.order.entity.Item;

@RestController
public class ItemController {

	@RequestMapping(value = "/item")
	public String addItem(@ModelAttribute Item item) {

		return null;

	}

}
