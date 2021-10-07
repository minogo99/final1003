package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.ReplyBean;
import board.model.ReplyDao;

@Controller
public class ReplyUpdateController {

	@Autowired
	ReplyDao replyDao;
	
	private final String command="replyUpdate.board";
	private final String getPage = "redirect:detailView.board";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doActionGet(@RequestParam("bnum") int bnum,@RequestParam("rnum") int rnum,@RequestParam("replyType") String replyType) {
		ModelAndView mav = new ModelAndView();
		System.out.println("replyTypesadasdadasdasdaUpdate"+replyType);
		mav.addObject("replyType", replyType);
		mav.addObject("num", bnum);
		mav.addObject("rnum", rnum);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doActionPost(ReplyBean rb) {
		ModelAndView mav = new ModelAndView();

		replyDao.replyUpdate(rb);
		mav.addObject("num", rb.getBnum());
		mav.setViewName(getPage);
		return mav;
	}
}
