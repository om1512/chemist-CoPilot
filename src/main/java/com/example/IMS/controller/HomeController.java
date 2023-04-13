package com.example.IMS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.IMS.service.userService;

@Controller
public class HomeController {

	@Autowired(required = true)
	userService userS;

	@GetMapping("/login")
	public String Index() {
		return "Item/Login";
	}

	@GetMapping("/")
	public String dashboard() {
		return "index";
	}

	@RequestMapping("/validate")
	String show(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
		boolean str;
		boolean status = userS.existingUser(username, password);
		System.out.println("OM  : " + status);
		if (status) {
			str = true;
			return "index";
		} else {
			str = false;
		}
		model.addAttribute("message", str);
		return "Item/Login";
	}

}
