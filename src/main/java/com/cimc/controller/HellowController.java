package com.cimc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellowController {

	@RequestMapping("/promt")
	@ResponseBody
	public String promt(){
		return "nice shoes!!";
	}
}
