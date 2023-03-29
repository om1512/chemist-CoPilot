package com.example.IMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.IMS.convertor.BorrowerConvertor;
import com.example.IMS.service.BorrowerService;

@Controller
public class BorrowerController {
	
	@Autowired
	BorrowerConvertor borrowerConvertor;
	
	@Autowired
	BorrowerService borrowerService;
	
	
	@GetMapping("/borrower")
	public String customer(Model model) {
		return "/Item/Borrower";
	}
	

	
}
