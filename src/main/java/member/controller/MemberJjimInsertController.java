package member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberDao;
import member.model.MemberJjimBean;

@Controller
public class MemberJjimInsertController {

	private final String command ="insertjjim.member";
	private final String getpage = "redirect:/jjimlist.member";
	
	@Autowired
	MemberDao mdao;
	
	@RequestMapping(value=command)
	public String doAction(MemberJjimBean jjim,HttpSession session) {

		session.setAttribute("jjim", jjim);
		System.out.println("asdasdcccccc"+jjim.getMovie_title());
		int cnt = mdao.insertJjim(jjim);
		return getpage;
	}
	
}
