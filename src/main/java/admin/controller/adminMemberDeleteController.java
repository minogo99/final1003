package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;

@Controller
public class adminMemberDeleteController {

	private final String command = "/memberDelete.admin";
	private final String gotoPage = "redirect:memberList.admin";
	
	@Autowired
	MemberDao memberDao;
	
	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doActionGet(@RequestParam("num") int num, 
			@RequestParam("pageNumber") int pageNumber) {
		//MemberBean member = memberdao.getMember(num);
		int cnt = memberDao.deleteMember(num);
		
		return gotoPage + "?pageNumber=" + pageNumber;
	}
}
