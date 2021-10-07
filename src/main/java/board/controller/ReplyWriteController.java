package board.controller;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import board.model.ReplyBean;
import board.model.ReplyDao;
import member.model.MemberBean;

@Controller
public class ReplyWriteController {

	@Autowired
	ReplyDao replyDao;
	
	private final String command = "/replyWrite.board";
	private final String getPage = "redirect:detailView.board";
	@RequestMapping(value=command)
	public ModelAndView doActionPost(ReplyBean rb,HttpSession session,HttpServletResponse response) throws IOException {
		
		ModelAndView mav = new ModelAndView();
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		MemberBean loginInfo = (MemberBean)session.getAttribute("loginInfo");
		if(loginInfo == null) {
			mav.addObject("msg", "로그인을 먼저 해야합니다.");
			session.setAttribute("destination", getPage+"?num="+rb.getBnum());
			mav.setViewName("alert");
		}else {
		rb.setWriter(loginInfo.getId());
		replyDao.replyWrite(rb);
		
		mav.addObject("num", rb.getBnum());
		mav.setViewName(getPage);
		}
		return mav;
	}
}
