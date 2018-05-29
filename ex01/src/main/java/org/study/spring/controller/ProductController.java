package org.study.spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.study.spring.model.ProductVO;

@Controller
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProductList(@ModelAttribute("msg") String msg, Model model) {
		logger.info("getProductList called...");
		
		ProductVO product = new ProductVO("ABC", 10000.0);
		model.addAttribute(product);

		
		return "productDetail";
	}
	
	@RequestMapping(value = "/list")
	public String list(RedirectAttributes rttr) {
		logger.info("list called...");
		rttr.addFlashAttribute("msg", "message from list");
		
		return "redirect:/product";
	}
	
	@RequestMapping(value = "/doJSON")
	public @ResponseBody ProductVO doJSON() {
		ProductVO vo = new ProductVO("샘플상품", 30000);
		
		return vo;
	}
	
}
