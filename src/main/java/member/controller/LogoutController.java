package member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	private final String command = "/logout.member";
	private final String getPage = "redirect:main.wa";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		
		session.invalidate();
		mav.setViewName(getPage);
		return mav;
	}
}
