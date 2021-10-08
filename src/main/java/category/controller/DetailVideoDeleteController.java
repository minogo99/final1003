package category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailDao;
import category.model.CategoryDao;

@Controller
public class DetailVideoDeleteController {

	private final String command="/deletevideo.category";
	private final String getPage="redirect:/videoList.category";
	
	@Autowired
	DetailDao ddao;
	
	@Autowired 
	CategoryDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num,@RequestParam("pageNumber") int pn) {
		
		ddao.detailVideoDelete(num);
		cdao.detailVideoDelete(num);
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName(getPage);
		return mav;
	}
}
