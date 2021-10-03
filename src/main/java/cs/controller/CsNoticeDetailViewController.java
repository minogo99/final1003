package cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeBean;

@Controller
public class CsNoticeDetailViewController {

	@Autowired
	cs.model.CsNoticeDao cnDao;
	
	private final String command = "/noticeDetailView.cs";
	private final String getPage = "CsMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		CsNoticeBean cnb = cnDao.getOneData(num);
		mav.addObject("cnb", cnb);

		int flag = 1;
		mav.addObject("flag", flag);
		String noticePage = "detailView";
		mav.addObject("noticePage", noticePage);
		
		mav.setViewName(getPage);
		return mav;
	}
	
}
