package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeBean;

@Controller
public class adminNoticeDetailViewController {

	@Autowired
	cs.model.CsNoticeDao cnDao;
	
	private final String command = "/noticeDetailView.admin";
	private final String getPage = "adminMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		CsNoticeBean cnb = cnDao.getOneData(num);
		mav.addObject("cnb", cnb);

		String pageType = "noticeDetailView";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
}
