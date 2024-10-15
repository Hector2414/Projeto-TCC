package com.sesi.TCC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TelaLoginController {
	
	@GetMapping("/")
	public String telaLogin() {
		return"telaLogin";
	}
}
