package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.ShipmentType;
import com.app.service.IShipmentTypeService;

@Controller
@RequestMapping("/shipmenttype")
public class ShipmentTypeController {
	@Autowired
	private IShipmentTypeService service;

	// Display Register Page on Enter/Register
	@GetMapping("/register")
	public String showRegister() {
		return "ShipmentTypeRegister";
	}

	@PostMapping("/save")
	public String saveRegister(@ModelAttribute ShipmentType shipmentType, Model model) {
		Integer saveShipmentType = service.saveShipmentType(shipmentType);
		String msg = "ShipmentType" + saveShipmentType + "Saved Successfully";
		model.addAttribute("message", msg);

		return "ShipmentTypeRegister";
	}

	@GetMapping("/all")
	public String getAll(Model model) {
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);
		return "ShipmentTypeData";

	}

	@GetMapping("/delete/{id}")
	public String removeById(@PathVariable Integer id, Model model) {
		String message = null;
		if (service.isShipmentTypeTypeExist(id)) {
			service.deleteShipmentType(id);
			message = "ShipmentType" + id + "Deleted";
		} else {
			message = "ShipmentType Not Exist! ";
		}
		List<ShipmentType> list = service.getAllShipmentType();
		model.addAttribute("list", list);

		model.addAttribute("message", message);
		return "ShipmentTypeData";
	}

}
