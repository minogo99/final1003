package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqBean;
import cs.model.CsFaqDao;

@Controller
public class adminFaqUpdateController {

	@Autowired
	CsFaqDao cfDao;
	
	private final String command = "/faqUpdate.admin";
	private final String getPage = "adminMain";
	private final String gotoPage = "redirect:faqList.admin";
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		CsFaqBean cfb = cfDao.getOneData(num);
		mav.addObject("cfb", cfb);
		
		String pageType = "faqUpdateForm";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView doActionPost(CsFaqBean cnb) {
		ModelAndView mav = new ModelAndView();
		
		cfDao.updateData(cnb);
		mav.setViewName(gotoPage);
		return mav;
	}
}
