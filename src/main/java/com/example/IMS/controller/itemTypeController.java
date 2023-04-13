package com.example.IMS.controller;

import java.util.Collections;
import java.util.List;

import javax.validation.constraints.Positive;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.IMS.model.ItemType;
import com.example.IMS.service.IItemIssuanceService;
import com.example.IMS.service.IItemTypeService;

@Controller
public class itemTypeController {

	@Autowired
	IItemTypeService typeService;
	
	@GetMapping("/createItemType")
	public String createItemType(Model model) {
		
		List<ItemType> list = typeService.getAllItemTypes();
		Collections.sort(list);
		model.addAttribute("list",list);
		return "Create";
	}
	
	@GetMapping("/deleteItemType/{id}")
	public String deleteItemType(@PathVariable(value = "id") long id, Model model) {
		
		typeService.deleteItemById(id);
		
		List<ItemType> list = typeService.getAllItemTypes();
		Collections.sort(list);
		
		model.addAttribute("list",list);
		return "Create";
	}
	
	@PostMapping("/addType")
	public String addType(@RequestParam("type") String type,Model model) {
		typeService.saveItemType(new ItemType(type));
		List<ItemType> list = typeService.getAllItemTypes();
		Collections.sort(list);
		model.addAttribute("list",list);
		return "Create";
	}
}
