package org.study.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	
//	city / date custom
	@InitBinder
	public void intiBinder(WebDataBinder binder) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
		
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(dateFormat, false));
		
		binder.registerCustomEditor(String.class, "address.city", new CityNameEditor());
	}
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/submitAdmission", method = RequestMethod.GET)
	public String submitForm() {
		logger.info("submitForm: ");
		
		return "admissionForm";
	}
	
	@ModelAttribute
	public void addCommonObjects(Model model) {
		model.addAttribute("headerMessage", "Seoul Hyndai College");
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@Valid @ModelAttribute("student") Student student, BindingResult result) {
		logger.info("process :" + student);
		
		if (result.hasErrors()) {
			return "admissionForm";
		}
		return "admissionSuccess";
	}
}
