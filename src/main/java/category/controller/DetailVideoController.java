package category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailBean;
import category.detail.DetailDao;
import category.model.CategoryBean;
import category.model.CategoryDao;

@Controller
public class DetailVideoController {

	private final String command ="/detailvideo.category";
	private final String getPage ="adminDetailVideo";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber) {
		
		CategoryBean cb=cdao.detailVideoView(num);
		DetailBean db=ddao.detailVideoView(num);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("cb", cb);
		mav.addObject("db", db);
		mav.addObject("pageNumber", pageNumber);
		mav.setViewName(getPage);
		return mav;
	}
}
