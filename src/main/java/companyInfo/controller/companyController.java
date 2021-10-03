package companyInfo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class companyController {

	private final String command = "/company.companyInfo";
	private final String getPage = "company"; 
	@RequestMapping(value=command)
	public ModelAndView doActionGet(HttpSession session) {
		ModelAndView mav = new ModelAndView();
			mav.setViewName(getPage);
		return mav;
	}
}
