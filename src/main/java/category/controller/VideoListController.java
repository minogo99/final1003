package category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VideoListController {
	
	private final String command="/videoList.category";
	private final String getPage="";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction() {
		
		ModelAndView mav=new ModelAndView();
		
		return mav;
	}
}
