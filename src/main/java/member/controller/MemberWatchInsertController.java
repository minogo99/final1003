package member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.model.MemberWatchBean;
import member.model.MemberWatchDao;

@Controller
public class MemberWatchInsertController {

	private final String command = "insertwatch.member";
	private final String getPage = "redirect:/main.wa";
	
	@Autowired
	MemberWatchDao mwdao;
	
	@RequestMapping(value=command)
	public String doAction(MemberWatchBean watch) {
		
		int cnt = mwdao.insertWatch(watch);
		
		return getPage +"?num" +watch.getMovie_num();
	}
}
