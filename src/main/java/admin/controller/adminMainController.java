package admin.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import admin.model.AdminDAO;
import admin.model.AdminDTO;

@Controller
public class adminMainController {

	private final String command = "/adminMain.admin";
	private final String getPage = "adminMain";
	private final String gotopage = "redirect:/memberList.admin";
	
	@Autowired
	AdminDAO adminDao;
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView doAction() {
		ModelAndView mav = new ModelAndView();
		
		String pageType = "main";
		mav.addObject("pageType", pageType);
		mav.setViewName(getPage);
		return mav;
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
			
			pw.println("<script>alert('占쎈툡占쎌뵠占쎈탵揶쏉옙 占쎌뵬燁살꼹釉�筌욑옙 占쎈륫占쎈뮸占쎈빍占쎈뼄.');</script>");
			pw.flush();
			return getPage;
		}
		else {
			
			if( admin.getAdmin_pass().equals(adminDto.getAdmin_pass()) ) { 
				System.out.println("嚥≪뮄�젃占쎌뵥占쎄쉐�⑨옙");
				session.setAttribute("loginInfo", adminDto);
								
				return gotopage; 
				
			}else { 
				pw.println("<script>alert('�뜮袁⑨옙甕곕뜇�깈揶쏉옙 占쎌뵬燁살꼹釉�筌욑옙 占쎈륫占쎈뮸占쎈빍占쎈뼄.');</script>");
				pw.flush();
				return getPage;
			}
		}
		
	}

}
