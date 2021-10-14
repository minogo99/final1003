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
public class PaymentSetController {
	private final String command="/paymentSet.voucher";
	private final String goPage="payment";
	
	@Autowired(required = false)
	CommodityDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView goPage(@RequestParam("cnum") int num) {
		
		System.out.println("실행됩니다");
		
		CommodityBean cb=cdao.selectMember(num);
		
		ModelAndView mav=new ModelAndView();
		mav.addObject("cb",cb);
		mav.setViewName(goPage);
		return mav;
	}
}
