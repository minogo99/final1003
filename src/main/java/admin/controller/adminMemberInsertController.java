package admin.controller;

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
public class adminMemberInsertController {

	@Autowired
	private MemberDao memberDao;

	private final String command="insert.admin";
	private final String getPage="adminMemberInsert";
	private final String gotoPage="redirect:/memberList.admin";
	
	@RequestMapping(value=command, method=RequestMethod.GET)
	public String insertForm(ModelAndView mav) {

		return getPage;
	}
	

	@RequestMapping(value=command, method=RequestMethod.POST)
	public ModelAndView insertForm(@Valid MemberBean member,BindingResult result) {



		ModelAndView mav = new ModelAndView();


		if(result.hasErrors()) {
			System.out.println("에러");
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
