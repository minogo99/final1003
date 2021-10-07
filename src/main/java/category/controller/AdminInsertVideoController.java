package category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryDao;

@Controller
public class AdminInsertVideoController {

	private final String command="/adminInsertVideo.category";
	private final String getPage="/adminInsertVideoForm";
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction() {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(getPage);
		
		return mav;
	}
	
}
