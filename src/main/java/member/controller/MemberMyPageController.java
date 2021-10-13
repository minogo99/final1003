package member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryBean;
import member.model.MemberBean;
import member.model.MemberDao;
import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class MemberMyPageController {
	private final String command = "/mypage.member";
	private final String getPage = "memberMypage";
	
	@Autowired
	MemberDao memberDao;
	
	@Autowired
	MemberJjimDao mjdao;
	
	@RequestMapping(value=command)
	public ModelAndView doAction(@RequestParam("num")int num) {
		ModelAndView mav= new ModelAndView();
		
		MemberBean member = memberDao.getMember(num);
		mav.addObject("member", member);
		
		List<CategoryBean> cblists = mjdao.getByMdata(member.getId());
		System.out.println(cblists.size());
		mav.addObject("cblists", cblists);
		mav.setViewName(getPage);
		return mav;
	}
}
