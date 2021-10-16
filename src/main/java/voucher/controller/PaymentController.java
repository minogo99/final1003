package voucher.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import voucher.model.VoucherBean;
import voucher.model.VoucherDao;

@Controller
public class PaymentController {
	
	private final String command="/readyPaymemt.voucher";
	private final String getPage="payMain";
	private final String gotoPage="payment";
	
	@Autowired
	VoucherDao vdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(int num) {
		
		System.out.println("Á¢¼Ó");
		System.out.println(num);
		VoucherBean vb=vdao.getSelect(num);
		ModelAndView mav=new ModelAndView();
		mav.addObject("vb",vb);
		mav.setViewName(getPage);
		
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView getPage(int num) {
		
		VoucherBean vb=vdao.getSelect(num);
		ModelAndView mav=new ModelAndView();
		mav.addObject("vb",vb);
		mav.setViewName(gotoPage);
		
		return mav;
	}
}
