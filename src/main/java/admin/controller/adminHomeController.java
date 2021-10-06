package admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import admin.model.AdminDAO;
import admin.model.AdminDTO;

@Controller
public class adminHomeController {

	private final String command = "/adminHome.admin";
	private final String getPage = "adminHome";
	private final String gotopage = "redirect:/memberList.admin";
	
	@Autowired
	AdminDAO adminDao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String doAction( ) {
		
		return getPage;
	}
	
	@RequestMapping(value=command, method=RequestMethod.POST)
	public String doAction(AdminDTO admin,HttpServletResponse response, HttpSession session ) throws IOException {
		
		System.out.println(admin.getAdmin_id());
		System.out.println(admin.getAdmin_pass());
		
		AdminDTO adminDto = adminDao.getData(admin.getAdmin_id()); 
		
		System.out.println("AdminLoginController adminDto:" + adminDto);

		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		if(adminDto == null) {
			
			pw.println("<script>alert('�븘�씠�뵒媛� �씪移섑븯吏� �븡�뒿�땲�떎.');</script>");
			pw.flush();
			return getPage;
		}
		else {
			
			if( admin.getAdmin_pass().equals(adminDto.getAdmin_pass()) ) { 
				System.out.println("濡쒓렇�씤�꽦怨�");
				session.setAttribute("loginInfo", adminDto);
								
				return gotopage; 
				
			}else { 
				pw.println("<script>alert('鍮꾨�踰덊샇媛� �씪移섑븯吏� �븡�뒿�땲�떎.');</script>");
				pw.flush();
				return getPage;
			}
		}
		
	}

}
