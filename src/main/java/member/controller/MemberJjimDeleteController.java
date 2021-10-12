package member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;


@Controller
public class MemberJjimDeleteController {

	private final String command ="deletejjim.member";
	private final String getpage = "redirect:/main.wa";
	
	@Autowired
	MemberDao mdao;
	
	@RequestMapping(value = command)
	public String doAction(@RequestParam(value="movie_num") int movie_num,HttpSession session) {
		int cnt = mdao.deleteJjim(movie_num);
		session.removeAttribute("jjim");
		return getpage;
		
	}
	
}
