package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class FindidController {

	private final String command = "/findid.member";
	private final String getPage = "findid";
	private final String gotoPage = "finduser";
	
	@Autowired
	MemberDao mdao;

	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doActionGET() {
		return getPage;
	}

	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doActionPOST(MemberBean bean, HttpServletResponse response,Model model ) throws IOException {
		MemberBean loginInfo = mdao.getID(bean.getName());

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		if(loginInfo == null) {
			pw.println("<script>alert('없는 회원 입니다.');</script>");
			pw.flush();
			return getPage;
		}
		else {
			String type="id";
			model.addAttribute("type", type);
			model.addAttribute("loginInfo", loginInfo);
			return gotoPage;

		}

	}
}