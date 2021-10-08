package cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeDao;

@Controller
public class CsNoticeDeleteController {

	@Autowired
	CsNoticeDao cnDao;
	
	private final String command = "/noticeDelete.cs";
	private final String getPage = "redirect:noticeList.cs";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		cnDao.deleteData(num);
		mav.setViewName(getPage);
		return mav;
	}
}
