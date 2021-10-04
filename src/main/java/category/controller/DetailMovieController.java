package category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

package category.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryBean;
import category.model.CategoryDao;

@Controller
public class DetailMovieController {
	
	private final String command="/detailMovie.category";
	private final String getPage="detailMovie";
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		System.out.println("1");
		
		CategoryBean cb=cdao.detailMovieView(num);
		List<CategoryBean> lists=cdao.detailMovieGenre(cb.getGenre());
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("cb",cb);
		mav.addObject("lists",lists);
		mav.setViewName(getPage);
		return mav;
		
	}
}
