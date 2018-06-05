package org.study.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.study.board.model.BoardVO;
import org.study.board.service.BoardService;

@Controller
@RequestMapping("/board/*")
public class BoardController {
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class); 
	
	@Autowired
	private BoardService service;
	
	@RequestMapping(value = "/register" , method=RequestMethod.GET)
	public String registerGet() {
		logger.info("register get");
		
		return "board/register";
	}
	
	@RequestMapping(value = "/register" , method=RequestMethod.POST)
	public String registerPost(BoardVO board, Model model) {
		logger.info("register post" + board);
		
		try {
			service.regist(board);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("result", "success");
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value="listAll", method=RequestMethod.GET)
	public String listAll() throws Exception{
		logger.info("show all list");
		
		return "board/list";
	}
}
