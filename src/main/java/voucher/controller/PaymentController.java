package voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import commodity.model.CommodityBean;
import commodity.model.CommodityDao;

@Controller
public class PaymentController {
	
	private final String command="/payment.voucher";
	private final String getPage="payMain";
	private final String goPage="payMain";
	
	@Autowired(required = false)
	CommodityDao cdao;
	
	@RequestMapping(value=command,method=RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		
		System.out.println(num);
		CommodityBean cb=cdao.selectMember(num);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("cb",cb);
		mav.setViewName(getPage);
		return mav;
	}
	
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView goPage(@RequestParam("num") int num) {
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(getPage);
		return mav;
	}
}
