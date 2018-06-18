package org.study.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {

	@RequestMapping("/hello")
	public ModelAndView showMessage(@RequestParam(value="key", required=false, defaultValue="default name")String name) {
		ModelAndView model = new ModelAndView("hello");
		model.addObject("msg", "Hello World!");
		model.addObject("name", name);
		
		return model;
	}
}
