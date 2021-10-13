package member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberDao;
import member.model.MemberJjimBean;

@Controller
public class MemberJjimListController {

	private final String command = "jjimlist.member";
	private final String getpage = "memberMypage";
	
	@Autowired
	MemberDao mdao;
	
	@RequestMapping(value=command)
	public ModelAndView doAction() {
		
		List<MemberJjimBean> lists = mdao.getjjimList();
		ModelAndView mav = new ModelAndView();
		mav.addObject("lists", lists);
		System.out.println("lists:" + lists);
		mav.setViewName(getpage);
		return mav;
	}
	
}
