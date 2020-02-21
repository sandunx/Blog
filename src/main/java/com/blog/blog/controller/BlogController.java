package com.blog.blog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
}
