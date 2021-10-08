package admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsNoticeBean;
import cs.model.CsNoticeDao;
import member.model.MemberBean;

@Controller
public class adminNoticeWriteController {

	@Autowired
	CsNoticeDao cnDao;
	
	private final String command = "/noticeWrite.admin";
	private final String getPage = "adminMain";
	private final String gotoPage = "redirect:noticeList.admin";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doActionGet() {
		ModelAndView mav = new ModelAndView();
		
		String pageType = "noticeWriteForm";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav; 
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doActionPost(CsNoticeBean cnb,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		MemberBean loginInfo = (MemberBean) session.getAttribute("loginInfo");
		cnb.setWriter(loginInfo.getId());
		
		cnDao.insertData(cnb);
		
		mav.setViewName(gotoPage);
		return mav; 
	}
}
