package voucher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PaymentController {
	
	private final String command="/payment.voucher";
	private final String getPage="";
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(@RequestParam("pay") String selectpay) {
		
		System.out.println(selectpay);
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(getPage);
		
		return mav;
	}
}
