package member.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;

@Controller
public class memberDeleteController {
	private final String command = "/delete.admin";
	private final String gotoPage = "";
	
	MemberDao memberDao;
	
	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doActionGet(@RequestParam("num") int num, 
			@RequestParam("pageNumber") int pageNumber) {
		//MemberBean member = memberdao.getMember(num);
		int cnt = memberDao.deleteMember(num);
		
		return gotoPage + "?pageNumber=" + pageNumber;
	}
}
