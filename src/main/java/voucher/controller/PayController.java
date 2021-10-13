package voucher.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class PayController {
	
	private final String command="/pay.voucher";
	private final String getPage="payMain";
	
	@RequestMapping(value=command,method =RequestMethod.GET )
	public ModelAndView doAction(HttpSession session,HttpServletResponse response,HttpServletRequest request) throws IOException {
		System.out.println(1234);
		
		PrintWriter pw = response.getWriter();
		request.setCharacterEncoding("UTF-8");
		ModelAndView mav = new ModelAndView();
		
		MemberBean loginInfo = null;
		loginInfo = (MemberBean)session.getAttribute("loginInfo");
		if(loginInfo == null) {
			mav.addObject("msg", "로그인을 먼저 해야합니다.");
			session.setAttribute("destination", "redirect:pay.voucher");
			mav.setViewName("alert");
			
		}else {
			mav.setViewName(getPage);
		}
		return mav;
	}
	
}
