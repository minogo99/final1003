package main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import main.detail.MainDetailBean;
import main.detail.MainDetailDao;
import main.model.MainBean;
import main.model.MainDao;

public class DetailMain {
	private final String command = "/detailMain.wa";
	private final String getPage = "detailmain";
	
	@Autowired
	MainDao mdao;
	
	@Autowired
	MainDetailDao dmdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		
		MainDetailBean dmb = dmdao.detailMainVideoView(num);
		List<MainDetailBean> dlists = dmdao.detailMainVideoGenre(dmb.getGenre());
		List<MainBean> clists = mdao.selectMainAll();
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("dmb",dmb);
		mav.addObject("dlists",dlists);
		mav.addObject("clists",clists);
		mav.setViewName(getPage);
		return mav;
	}
	
	
	
}
