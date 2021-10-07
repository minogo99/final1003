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
public class EntertainListController {

	private final String command = "entertain.category";
	private final String getPage = "entertainpage";
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet() {
		
		List<CategoryBean> lists=cdao.selectEntertain();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("lists",lists);
		System.out.println("asdasd"+lists.size());
		mav.setViewName(getPage);
		return mav;
	}
	
}
