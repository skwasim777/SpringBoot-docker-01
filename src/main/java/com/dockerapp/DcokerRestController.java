package com.dockerapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcokerRestController {
	@GetMapping
	public String getMsg() {
		return "Hello Wasim";
	}
}
