package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqBean;

@Controller
public class adminFaqDetailViewController {

	@Autowired
	cs.model.CsFaqDao cfDao;
	
	private final String command = "/faqDetailView.admin";
	private final String getPage = "adminMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		CsFaqBean cfb = cfDao.getOneData(num);
		mav.addObject("cfb", cfb);

		String pageType = "faqDetailView";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
}

}
