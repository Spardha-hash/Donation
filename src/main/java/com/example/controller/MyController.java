package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("title","Donate For Cause");
		return "home";
	}
	@RequestMapping("/about")
	public String about(Model model) {
		model.addAttribute("title","Donate For Cause");
		return "about";
	}
	@RequestMapping("/gallery")
	public String gallery(Model model) {
		model.addAttribute("title","Donate For Cause");
		return "gallery";
	}
	@RequestMapping("/contact")
	public String contact(Model model) {
		model.addAttribute("title","Donate For Cause");
		return "contact";
	}

}
