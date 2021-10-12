package admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqDao;
 
@Controller
public class adminFaqDeleteController {

	@Autowired
	CsFaqDao cfDao;
	
	private final String command = "/faqDelete.admin";
	private final String getPage = "redirect:faqList.admin";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num) {
		ModelAndView mav = new ModelAndView();
		
		cfDao.deleteData(num);
		mav.setViewName(getPage);
		return mav;
	}
}
