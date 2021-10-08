package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeDao;

@Controller
public class adminNoticeDeleteController {

	@Autowired
	CsNoticeDao cnDao;
	
	private final String command = "/noticeDelete.admin";
	private final String getPage = "redirect:noticeList.admin";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		cnDao.deleteData(num);
		mav.setViewName(getPage);
		return mav;
	}
}
