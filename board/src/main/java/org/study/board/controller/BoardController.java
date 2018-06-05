package org.study.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
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
	public String registerPost(BoardVO board, RedirectAttributes rttr) {
		logger.info("register post" + board);
		
		try {
			service.regist(board);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rttr.addFlashAttribute("result", "success");
		return "redirect:/board/listAll";
	}
	
//	Model 객체를 전달하는 박스 같은 것
	@RequestMapping(value="listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		logger.info("show all list");
//		리스트 가지고오기
		model.addAttribute("list", service.listAll()); 
//		경로
		return "board/list";
	}
	
	@RequestMapping(value="read", method=RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception{
		model.addAttribute(service.read(bno)); 
		return "board/read";
	}
}
