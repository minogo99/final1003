package admin.controller;
<<<<<<< HEAD:src/main/java/admin/controller/adminMemberUpdateController.java
=======

import java.io.IOException;
>>>>>>> 4a3d30d329452bba6d450fcf5f3240cf13495293:src/main/java/member/controller/MemberUpdateController.java

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDao;

@Controller
public class adminMemberUpdateController {
<<<<<<< HEAD:src/main/java/admin/controller/adminMemberUpdateController.java
	private final String command="memberUpdate.admin";
	private final String getPage = "adminMain";
	private final String gotoPage="redirect:memberList.admin";

	@Autowired
	MemberDao memberDao;
=======
	private final String command="update.admin";
	private final String getPage="adminMemberUpdate";
	private final String gotoPage="redirect:/memberList.admin";

	@Autowired
	private MemberDao memberDao;
>>>>>>> 4a3d30d329452bba6d450fcf5f3240cf13495293:src/main/java/member/controller/MemberUpdateController.java


	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView doUpdate(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber) {
		
		ModelAndView mav = new ModelAndView();
		
		MemberBean member = memberDao.getMember(num);
		mav.addObject("member",member);
		mav.addObject("pageNumber",pageNumber);
		
		
		String pageType = "memberUpdateForm";
		mav.addObject("pageType", pageType);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView insertForm(@ModelAttribute("bean")
			@Valid MemberBean member,BindingResult result,
			@RequestParam(value="pageNumber", required=true) String pageNumber)  {


		ModelAndView mav = new ModelAndView();


		if(result.hasErrors()) {
			System.out.println("에러");
			mav.setViewName(getPage); 
			return mav;
		}

		else { 
			int cnt = memberDao.updateData(member);
		}

		mav.setViewName(gotoPage);
		return mav;

	}
}
