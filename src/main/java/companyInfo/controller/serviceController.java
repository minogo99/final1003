package companyInfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class serviceController {

	private final String command = "/service.companyInfo";
	private final String getPage = "service"; 
	@RequestMapping(value=command)
	public ModelAndView doActionGet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName(getPage);
	return mav;
	}
}
