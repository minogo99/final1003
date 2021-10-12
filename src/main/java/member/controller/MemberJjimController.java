package member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberJjimController {

	private final String command ="jjim.member";
	private final String getpage = "redirect:/movie.category";
	
	@RequestMapping(value=command)
	public String doAction() {
		
		
		
		
		return getpage;
	}
	
}
