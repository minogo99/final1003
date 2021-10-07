package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class MemberMyPageController {
	private final String command = "/mypage.member";
	private final String getPage = "memberMypage";
	
	@Autowired
	MemberDao memberDao;
	
	@RequestMapping(value=command)
	public String doAction(@RequestParam("num")int num,			 
			 Model model) {
		
		MemberBean member = memberDao.getMember(num);
		model.addAttribute("member", member);
		System.out.println("마이페이지");		
		return getPage;
	}
}
