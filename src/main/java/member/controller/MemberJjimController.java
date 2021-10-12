package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;
import member.model.MemberJjimBean;

@Controller
public class MemberJjimController {

	private final String command ="jjim.member";
	private final String getpage = "redirect:/detailMovie.category";
	
	@Autowired
	MemberDao mdao;
	
	@RequestMapping(value=command)
	public String doAction(MemberJjimBean mjb,Model model) {

		model.addAttribute("mjb", mjb);
		int cnt = mdao.insertJjim(mjb);
		
		
		return getpage;
	}
	
}
