package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import main.model.MainBean;
import main.model.MainDao;

@Controller
public class MainController {

	private final String command = "/main.wa";
	private final String getPage = "main";
	
	@Autowired
	MainDao mdao;
	
	@RequestMapping(value=command)
	public ModelAndView doAction() {
		
		
		List<MainBean> lists = mdao.selectMain();
		ModelAndView mav=new ModelAndView();
		mav.addObject("lists",lists);
		
		mav.setViewName(getPage);
		return mav;
	}
	
}
