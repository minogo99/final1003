package admin.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class adminMemberInsertController {
	
	private final String command="memberInsert.admin";
	private final String getPage = "adminMain";
	private final String gotoPage="redirect:memberList.admin";

	@Autowired
	private MemberDao memberDao;

	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView insertForm() {

		ModelAndView mav = new ModelAndView();
		
		String pageType = "memberInsertForm";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView insertForm(@Valid MemberBean member,BindingResult result) {
		ModelAndView mav = new ModelAndView();

		if(result.hasErrors()) {
			mav.setViewName(getPage); 
			return mav;
		}
		else {
			int cnt = memberDao.insertData(member);  
		}
		mav.setViewName(gotoPage);
		return mav;

	}
}
