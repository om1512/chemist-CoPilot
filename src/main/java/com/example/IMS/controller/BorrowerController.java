package com.example.IMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.IMS.convertor.BorrowerConvertor;
import com.example.IMS.model.Borrower;
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
	
	
	@GetMapping("/viewBorrower")
	public String viewBorrower(Model model,ModelMap borrowerModel) {
		List<Borrower> teachers = borrowerService.getAllBorrowers();
		System.out.println("TEACHER : "+teachers);
		borrowerModel.addAttribute("teachers", teachers);
		return "/Item/viewBorrower";
	}
	
	@GetMapping("/store_data")
	public String store_data(@RequestParam (value = "firstname", required = true) String firstname,
			@RequestParam(value = "lastname", required = true) String lastname,@RequestParam(value="email",required=true) String email) {
		Borrower borrower = new Borrower(firstname,lastname,email);
		borrowerService.updateBorrower(borrower);
		return "/Item/Borrower";
	}
	
	
}
