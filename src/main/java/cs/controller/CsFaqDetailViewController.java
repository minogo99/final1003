package cs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqBean;
import cs.model.CsNoticeBean;

@Controller
public class CsFaqDetailViewController {

	@Autowired
	cs.model.CsFaqDao cfDao;
	
	private final String command = "/faqDetailView.cs";
	private final String getPage = "CsMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		CsFaqBean cfb = cfDao.getOneData(num);
		mav.addObject("cfb", cfb);

		int flag = 2;
		mav.addObject("flag", flag);
		String faqPage = "detailView";
		mav.addObject("faqPage", faqPage);
		
		mav.setViewName(getPage);
		return mav;
}

}