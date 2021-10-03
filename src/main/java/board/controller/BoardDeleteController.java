package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardDao;

@Controller
public class BoardDeleteController {

	@Autowired
	BoardDao boardDao;
	
	private final String command = "/delete.board";
	private final String gotoPage = "redirect:list.board";
	
	@RequestMapping(value=command)
	public ModelAndView doGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		boardDao.deleteData(num);
		mav.setViewName(gotoPage);
		return mav;
	}
}
