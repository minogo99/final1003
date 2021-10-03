package board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;
import member.model.MemberBean;

@Controller
public class BoardWriteController {

	@Autowired
	BoardDao boardDao;
	private final String command = "/write.board";
	private final String getPage = "BoardWriteForm";
	private final String gotoPage = "redirect:list.board";
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet(HttpSession session,HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView mav = new ModelAndView();

		MemberBean loginInfo = null;
		loginInfo = (MemberBean)session.getAttribute("loginInfo");
		if(loginInfo == null) {
			mav.addObject("msg", "로그인을 먼저 해야합니다.");
			session.setAttribute("destination", "redirect:write.board");
			mav.setViewName("alert");
		}else {
			mav.setViewName(getPage);
		}
		return mav;
	}
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView doActionPost(BoardBean bb,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		MemberBean loginInfo = (MemberBean)session.getAttribute("loginInfo");
		bb.setWriter(loginInfo.getId());
		boardDao.insertData(bb);
		mav.setViewName(gotoPage);
		return mav;
	}
}
