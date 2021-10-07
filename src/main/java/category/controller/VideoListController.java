package category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailDao;
import category.model.CategoryBean;
import category.model.CategoryDao;

@Controller
public class VideoListController {
	
	private final String command="/videoList.category";
	private final String getPage="videoList";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction() {
		
		List<CategoryBean> clists=cdao.selectAll();
		
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("clists",clists);
		mav.setViewName(getPage);
		return mav;
	}
}
