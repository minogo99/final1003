package category.controller;

import java.util.List;

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
public class DetailEnterController {
	
	private final String command="/detailEnter.category";
	private final String getPage="detailEnter";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		System.out.println("1");
		
		DetailBean db=ddao.detailVideoView(num);
		List<DetailBean> dlists = ddao.detailVideoGenre(db.getGenre());
		List<CategoryBean> clists=cdao.selectAll();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("db",db);
		mav.addObject("dlists",dlists);
		mav.addObject("clists",clists);
		mav.setViewName(getPage);
		return mav;
		
	}
}
