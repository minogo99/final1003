package voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import order.model.OrderBean;
import order.model.OrderDao;
import order.model.OrderDetailBean;

@Controller
public class OrderController {
	
	private final String command="/order.voucher";
	private final String getPage="payMain";
	
	@Autowired(required = false)
	OrderDao odao;
	
	@RequestMapping(value=command)
	public ModelAndView doAction(@RequestParam("cnum") int cnum,
			@RequestParam("mnum") int mnum) {
		OrderBean ob;
		OrderDetailBean odb=new OrderDetailBean();
		int cnt=odao.setInsert(mnum);
		if(cnt>0) {
			ob=odao.selectOne(mnum);
			odb.setOnum(ob.getNum());
			odb.setCnum(cnum);
			odao.setInsertDetail(odb);
			
		}
		
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(getPage);
		return mav;
	}
}
