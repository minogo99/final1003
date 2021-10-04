package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class MemberDeleteController {
	private final String command = "/delete.member";
	private final String gotoPage = "redirect:/list.member";
	
	@Autowired
	MemberDao memberdao;
	
	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doActionGet(@RequestParam("num") int num, 
			@RequestParam("pageNumber") int pageNumber) {
		//MemberBean member = memberdao.getMember(num);
		
		int cnt = memberdao.deleteMember(num);
		
		return gotoPage + "?pageNumber=" + pageNumber;
	}
}
