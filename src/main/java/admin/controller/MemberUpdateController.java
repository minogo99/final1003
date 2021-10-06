package admin.controller;

import java.io.IOException;

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
public class MemberUpdateController {
	private final String command="update.admin";
	private final String getPage="memberUpdateForm";
	private final String gotoPage="redirect:/list.member";

	MemberDao memberDao;


	@RequestMapping(value=command, method=RequestMethod.GET)
	public ModelAndView doUpdate(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber) {
		
		ModelAndView mav = new ModelAndView();
		
		MemberBean member = memberDao.getMember(num);
		mav.addObject("member",member);
		mav.addObject("pageNumber",pageNumber);
		mav.setViewName(getPage);
		
		return mav;
	}
	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView insertForm(@ModelAttribute("bean")
			@Valid MemberBean member,BindingResult result,
			@RequestParam(value="pageNumber", required=true) String pageNumber)  {


		ModelAndView mav = new ModelAndView();


		if(result.hasErrors()) {
			mav.setViewName(getPage); 
			return mav;
		}

		else { 
			int cnt = memberDao.updateData(member);  
			System.out.println("insert�꽦怨�");
		}

		mav.setViewName(gotoPage);
		return mav;

	}
}
