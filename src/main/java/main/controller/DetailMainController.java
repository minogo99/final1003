package main.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import main.detail.DetailMainBean;
import main.detail.DetailMainDao;
import main.model.MainBean;
import main.model.MainDao;
import member.model.MemberBean;
import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class DetailMainController {
	private final String command = "/detailmain.wa";
	private final String getPage = "detailmain";
	
	@Autowired
	MainDao mdao;
	
	@Autowired
	DetailMainDao dmdao;
	

	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		
		ModelAndView mav=new ModelAndView();
			
		DetailMainBean dmb = dmdao.detailMainVideoView(num);
		List<DetailMainBean> dlists = dmdao.detailMainVideoGenre(dmb.getGenre());
		List<MainBean> clists = mdao.selectMainAll();
		
		mav.addObject("dmb",dmb);
		mav.addObject("dlists",dlists);
		mav.addObject("clists",clists);
		mav.setViewName(getPage);
		return mav;
	}
	
	
	
}
