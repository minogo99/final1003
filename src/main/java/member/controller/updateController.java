package member.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDaoImpl;

@Controller
public class updateController {

	private final String command = "userupdate.member";
	private final String getPage = "updateForm";
	private final String gotoPage = "redirect:/main.wa";
	
	@Autowired
	MemberDaoImpl mdao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doActionGet(@RequestParam(value="num", required=true)int num ,Model model) {
		MemberBean mb = mdao.getByNumData(num);
		model.addAttribute("mb", mb);
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView doActionPost(@Valid MemberBean mb, BindingResult result,
									 @RequestParam(value="num", required=true)int num,
									 HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			System.out.println("유효성 검사 오류입니다.");
			mav.addObject("mb", mb);
			mav.setViewName(getPage);
			return mav;
		}
		
		int cnt = mdao.updateMember(mb);
		MemberBean loginInfo = mdao.getByNumData(num);
		session.setAttribute("loginInfo", loginInfo);
		mav.setViewName(gotoPage);
		return mav;
	}

	
	
}
