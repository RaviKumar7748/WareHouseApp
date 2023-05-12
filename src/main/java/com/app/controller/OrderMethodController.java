package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.OrderMethod;
import com.app.service.IOrderMethodService;

@Controller
@RequestMapping("/ordermethod")
public class OrderMethodController {
	@Autowired
	private IOrderMethodService service;
	
	
//	1.save Reg Page
	@GetMapping("/register")
	public String showReg(
			Model model) {
		model.addAttribute("orderMethod", new OrderMethod());
		return "OrderMethodRegister";
	}
	
	@PostMapping
	public String save(@ModelAttribute OrderMethod orderMethod,Model model) {
		Integer saveOrderMethod = service.saveOrderMethod(orderMethod);
		String message="Order Method"+saveOrderMethod+"Saved";
		model.addAttribute("message"+message);
		return "OrderMethodRegister";
	}
	 
//	2.save data 
	
//	3.show all
	
//	4.edit page

}
