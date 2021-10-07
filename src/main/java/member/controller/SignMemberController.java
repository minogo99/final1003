package member.controller;

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
public class SignMemberController {
	
	
	private final String command = "sign.member";
	private final String getPage = "signpage";
	private final String gotoPage = "loginpage";
	
	@Autowired
	MemberDao mdao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doActionGET() {
		
		return getPage;
	}
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView doActionPOST(@Valid MemberBean mb, BindingResult result
			) {
		ModelAndView mav = new ModelAndView();
		if(result.hasErrors()) {
			System.out.println("유효성검사에 오류가 있습니다.");
			mav.addObject("mb", mb);
			mav.setViewName(getPage);
			return mav;
		}
		
		int cnt = mdao.insertMember(mb);
		mav.setViewName(gotoPage);
		return mav;
}
}