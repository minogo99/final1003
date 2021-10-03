package voucher.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoinController {

	private final String command="/coin.voucher";
	private final String getPage="coin_forward";
	
	@RequestMapping(value=command,method =RequestMethod.GET )
	public ModelAndView doAction() {
		ModelAndView mav=new ModelAndView();
		
		mav.setViewName(getPage);
		return mav;
	}
}
