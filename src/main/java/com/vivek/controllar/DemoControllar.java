package com.vivek.controllar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vivek")
public class DemoControllar {

	@GetMapping("hello")
	public String hello() {
		return "Hello";
	}
}
