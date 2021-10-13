package voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import voucher.model.CommodityBean;
import voucher.model.CommodityDao;

@Controller
public class PaymentController {
	
	private final String command="/payment.voucher";
	private final String getPage="";
	
	@Autowired
	CommodityDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("num") int num) {
		
		CommodityBean cb=cdao.selectMember(num);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("cb",cb);
		mav.setViewName(getPage);
		
		return mav;
	}
}
