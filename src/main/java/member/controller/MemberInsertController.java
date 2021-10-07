package member.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import member.model.MemberBean;
import member.model.MemberDao;



@Controller
public class MemberInsertController {
	private final String command="insert.admin";
	private final String getPage="memberInsertForm";
	private final String gotoPage="redirect:/list.member";

	MemberDao memberDao;

	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String insertForm(ModelAndView mav) {

		return getPage;
	}
	

	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView insertForm(@Valid MemberBean member,BindingResult result) {



		ModelAndView mav = new ModelAndView();


		if(result.hasErrors()) {
			mav.setViewName(getPage); 
			return mav;
		}

		else {
			int cnt = memberDao.insertData(member);  
			System.out.println("insert cnt:" + cnt);
		}

		mav.setViewName(gotoPage);
		return mav;

	}
	
	
}

