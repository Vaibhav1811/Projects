package com.demo.bday;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.demo.bday.MainService;

@Controller
public class MainController {
	@Autowired
	MainService mainservice;

	@Autowired
	MainRepository mainrepository;

	@Autowired
	Scheduledtask scheduledtask;

	@GetMapping("/")
	public String home(Model model) throws Exception {
		List<String> s2 = scheduledtask.checkLogin();
		model.addAttribute("message", s2);
		return "index1";
	}
	
}