package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;

@Controller
public class BoardUpdateController {

	@Autowired
	BoardDao boardDao;
	private final String command = "/update.board";
	private final String getPage = "BoardUpdateForm";
	private final String gotoPage = "redirect:list.board";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		BoardBean bb = boardDao.getOneData(num);
		
		mav.addObject("bb", bb);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doActionPost(BoardBean bb) {
		ModelAndView mav = new ModelAndView();
		
		boardDao.updateData(bb);
		mav.setViewName(gotoPage);
		return mav;
	}
}
