package admin.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqBean;
import cs.model.CsFaqDao;
import member.model.MemberBean;

@Controller
public class adminFaqWriteController {

	@Autowired
	CsFaqDao cfDao;
	
	private final String command = "/faqWrite.admin";
	private final String getPage = "adminMain";
	private final String gotoPage = "redirect:faqList.admin";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doActionGet() {
		ModelAndView mav = new ModelAndView();
		
		String pageType = "faqWriteForm";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView doActionPost(CsFaqBean cfb,HttpSession session) {
		ModelAndView mav = new ModelAndView();
		
		MemberBean loginInfo = (MemberBean) session.getAttribute("loginInfo");
		cfb.setWriter(loginInfo.getId());
		
		cfDao.insertData(cfb);
		
		mav.setViewName(gotoPage);
		return mav;
	}
}
