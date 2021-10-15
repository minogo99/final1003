package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberWatchDao;

@Controller
public class MemberWatchDeleteController {

	private final String command = "deletewatch.member";
	private final String getPage = "redirect:/mypage.member";
	
	@Autowired
	MemberWatchDao mwdao;
	
	@RequestMapping(value=command)
	public String doAction(@RequestParam("num") int num) {
		mwdao.deleteWatch();
		
		return getPage+"?num="+num;
	}
}
