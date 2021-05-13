package com.ltts.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class DemoController {

	@RequestMapping("/hi")
	public String firstMethod() {
		return "hello Spring";

	}

	@RequestMapping("/")
	public ModelAndView secondMethod() {
		return new ModelAndView("index");
	}

}
