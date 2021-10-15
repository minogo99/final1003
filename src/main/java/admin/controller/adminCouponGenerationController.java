package admin.controller;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import voucher.model.couponBean;
import voucher.model.couponDao;

@Controller
public class adminCouponGenerationController {

	@Autowired
	couponDao cdao;
	private final String command = "/couponGeneration.admin";
	private final String getPage = "adminMain";
	private final String gotoPage = "redirect:couponList.admin";
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doActionGet() {
		ModelAndView mav = new ModelAndView();
		
		String pageType = "couponGeneration";
		mav.addObject("pageType", pageType);
		
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method=RequestMethod.POST)
	public ModelAndView doActionPost(couponBean cb) {
		ModelAndView mav = new ModelAndView();
		
		String number = "";
		Random rand = new Random();
		for(int i = 0 ; i < 5 ; i++) {
		 number += rand.nextInt(10); // 0~29
		}
		cb.setCp_number(number);
		cb.setCp_check("false");
		cdao.insertData(cb);
		mav.setViewName(gotoPage);
		return mav;
	}
}
