package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDao;
import member.model.MemberDaoImpl;

@Controller
public class FindpwController {

	private final String command = "/findpw.member";
	private final String getPage = "findpw";
	private final String gotoPage = "finduser";
	@Autowired
	MemberDaoImpl mdao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doActionGET() {
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doActionPOST(MemberBean bean, HttpServletResponse response,Model model) throws IOException {
		MemberBean loginInfo = mdao.getPW(bean.getName(),bean.getId());
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		if(loginInfo == null) {
			pw.println("<script>alert('없는 회원입니다.');</script>");
			pw.flush();
			return getPage;
	}
		else {
			String type = "password";
			model.addAttribute("type", type);
			model.addAttribute("loginInfo", loginInfo);
			return gotoPage;
		}
	}
}
