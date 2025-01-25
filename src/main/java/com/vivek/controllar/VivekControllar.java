package com.vivek.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("java")
public class VivekControllar {

	@GetMapping("/java")
	public String helloJava() {
		return "Java";
	}
}
