package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
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
									 HttpSession session,HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			System.out.println("유효성 검사 오류입니다.");
			mav.addObject("mb", mb);
			mav.setViewName(getPage);
			return mav;
		}
		
		MemberBean DBmb = mdao.getByNumData(num);
		if(DBmb.getPassword().equals(mb.getPassword())) {
			int cnt = mdao.updateMember(mb);
			MemberBean loginInfo = mdao.getByNumData(num);
			session.setAttribute("loginInfo", loginInfo);
			mav.setViewName(gotoPage);
		}else {
			pw.println("<script>alert('패스워드가 일치하지 않습니다.');</script>");
			pw.flush();
			mav.addObject("mb", mb);
			mav.setViewName(getPage);
		}
		return mav;
	}

	
	
}
