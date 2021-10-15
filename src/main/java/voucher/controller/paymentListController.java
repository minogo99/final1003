package voucher.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberDao;
import order.model.OrderDao;

@Controller
public class paymentListController {
	
	private final String command="/paymentList.voucher";
	private final String getPage="";
	
	@Autowired
	MemberDao mdao;
	
	@Autowired
	OrderDao odao;
	
	@RequestMapping(value=command)
	public ModelAndView doAction() {
		
		mdao.getAllList();
		
		
		ModelAndView mav=new ModelAndView();
		mav.setViewName(getPage);
		return mav;
		
	}
}
