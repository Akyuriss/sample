package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AppController {

//	@GetMapping("/index")
	@RequestMapping("/")
	public String index() {
		return "index";
}
}