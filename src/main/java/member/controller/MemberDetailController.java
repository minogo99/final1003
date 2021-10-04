package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class MemberDetailController {
	private final String command = "/detail.member";
	private final String getPage = "memberDetailView";

	@Autowired
	MemberDao memberDao;
	
	@RequestMapping(value=command)
	public String doUpdate(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber,
			 Model model) {
		
		MemberBean member = memberDao.getMember(num);
		model.addAttribute("member", member);
		model.addAttribute("pageNumber", pageNumber);
		
		System.out.println("디테일컨트롤러");
		
		return getPage;
	}
}
