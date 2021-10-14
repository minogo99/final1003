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

@Controller
public class LoginController {

	private final String command = "/login.member";
	private final String getPage = "loginpage";
	
	@Autowired
	MemberDao mdao;
	
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
			System.out.println("�������� �ʴ� ȸ��");
			pw.println("<script>alert('�ش� ���̵� �����ϴ�');</script>");
			pw.flush();
			return getPage;
			
		}
		else {
			System.out.println("�����ϴ� ȸ��");
			if(bean.getPassword().equals(loginInfo.getPassword()) ) {
				session.setAttribute("loginInfo", loginInfo);
				
				
				if((String)session.getAttribute("destination") == null) {
					session.setAttribute("destination", "redirect:main.wa");
				}
				return (String)session.getAttribute("destination"); 
				
			}else {
				pw.println("<script>alert('����� �߸� �Ǿ����ϴ�.');</script>");
				pw.flush();
				return getPage;
	}
	
		}
		
	}
}

