package category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryBean;
import category.model.CategoryDao;

@Controller
public class MovieListController {

	
	private final String command = "/movie.category";
	private final String getPage = "moviepage"; 
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet() {
		
		List<CategoryBean> lists=cdao.selectMovie();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("lists",lists);
		mav.setViewName(getPage);
		return mav;
	}
}