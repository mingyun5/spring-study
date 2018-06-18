package org.study.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/submitAdmission", method = RequestMethod.GET)
	public String submitForm() {
		logger.info("submitForm: ");
		
		return "admissionForm";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@ModelAttribute("student") Student student, BindingResult result) {
		logger.info("process :" + student);
		
		if (result.hasErrors()) {
			return "admissionForm";
		}
		return "admissionSuccess";
	}
}
