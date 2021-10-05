package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.ReplyDao;

@Controller
public class ReplyDeleteController {

	@Autowired
	ReplyDao replyDao;
	
	private final String command = "/replyDelete.board";
	private final String getPage = "redirect:detailView.board";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("rnum") int rnum,@RequestParam("bnum") int bnum) {
		ModelAndView mav = new ModelAndView();
		
		replyDao.replyDelete(rnum);
		mav.addObject("num", bnum);
		mav.setViewName(getPage);
		return mav;
	}
}
