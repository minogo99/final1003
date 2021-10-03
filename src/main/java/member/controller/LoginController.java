package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import member.model.MemberBean;
import member.model.MemberDao;
import member.model.MemberDaoImpl;

@Controller
public class LoginController {

	private final String command = "/login.member";
	private final String getPage = "loginpage";
	
	@Autowired
	MemberDaoImpl mdao;
	
	@RequestMapping(value = command, method=RequestMethod.GET)
	public String doActionget( ) {
		
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doActionpost(MemberBean bean, HttpServletResponse response,HttpSession session) throws IOException {
		
		MemberBean loginInfo = mdao.getData(bean.getId()); 

		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		if(loginInfo == null) {
			System.out.println("존재하지 않는 회원");
			pw.println("<script>alert('해당 아이디가 없습니다');</script>");
			pw.flush();
			return getPage;
			
		}
		else {
			System.out.println("존재하는 회원");
			if(bean.getPassword().equals(loginInfo.getPassword()) ) {
				session.setAttribute("loginInfo", loginInfo);
				
				
				if((String)session.getAttribute("destination") == null) {
					session.setAttribute("destination", "redirect:main.wa");
				}
				return (String)session.getAttribute("destination"); 
				
			}else {
				pw.println("<script>alert('비번이 잘못 되었습니다.');</script>");
				pw.flush();
				return getPage;
	}
	
		}
		
	}
}

