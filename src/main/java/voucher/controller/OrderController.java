package voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import order.model.OrderBean;
import order.model.OrderDao;

@Controller
public class OrderController {
	
	private final String command="/order.voucher";
	private final String getPage="payMain";
	
	@Autowired
	OrderDao odao;
	
	OrderBean ob = new OrderBean();
	
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doAction(@RequestParam("cnum") int cnum,
			@RequestParam("mnum") int mnum) {
		
		
		System.out.println(cnum);
		System.out.println(mnum);
		ob.setCnum(cnum);
		ob.setMnum(mnum);
		
		int cnt=odao.setInsertOrder(ob);
		System.out.println(cnt); 
		
		ModelAndView mav=new ModelAndView();
		if(cnt>0) {
			
			mav.setViewName(getPage);
		}
		return mav;
	}
}
