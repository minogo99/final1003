package category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class VideoInsertController {
	
	private final String command="/videoInsert.category";
	private final String getPage="videoInsertForm";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(getPage);
		return mav;
	}
	
}
