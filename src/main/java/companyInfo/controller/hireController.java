package companyInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class hireController {


	private final String command = "/hire.companyInfo";
	private final String getPage = "hire"; 
	@RequestMapping(value=command)
	public ModelAndView doActionGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(getPage);
	return mav;
	}
}
