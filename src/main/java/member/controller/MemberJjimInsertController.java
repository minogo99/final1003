package member.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryBean;
import member.model.MemberBean;
import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class MemberJjimInsertController {

	private final String command ="insertjjim.member";
	private final String getpage = "redirect:detailMovie.category";
	
	@Autowired
	MemberJjimDao mjdao;

	
	@RequestMapping(value=command)
	public ModelAndView doAction(MemberJjimBean jjim,HttpSession session,HttpServletResponse response) throws IOException {
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		
		ModelAndView mav = new ModelAndView();
		String msg = "";
		
		MemberBean loginInfo = (MemberBean)session.getAttribute("loginInfo");
		List<MemberJjimBean> mjlists = mjdao.getByData(loginInfo.getId());
		if(mjlists.size() > 4) {
		msg = "찜은 5개가 최대입니다";
		mav.addObject("msg", msg);
		mav.addObject("num", jjim.getMovie_num());
		mav.setViewName("alert");
		}else {
		int cnt = mjdao.insertJjim(jjim);
		mav.setViewName(getpage+"?num="+jjim.getMovie_num());
		}
		return mav;
}
}