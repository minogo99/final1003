package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeBean;
import cs.model.CsNoticeDao;

@Controller
public class adminNoticeUpdateController {

	@Autowired
	CsNoticeDao cnDao;
	
	private final String command = "/noticeUpdate.admin";
	private final String getPage = "adminMain";
	private final String gotoPage = "redirect:noticeList.admin";
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		System.out.println("dasdasdsadasd"+num);
		CsNoticeBean cnb = cnDao.getOneData(num);
		mav.addObject("cnb", cnb);
		System.out.println("dasdasdsadasd"+cnb);
		String pageType = "noticeUpdateForm";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView doActionPost(CsNoticeBean cnb) {
		ModelAndView mav = new ModelAndView();
		
		cnDao.updateData(cnb);
		mav.setViewName(gotoPage);
		return mav;
	}
}
