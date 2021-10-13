package member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
>>>>>>> c28e6f50afc17ce18e2e43b61cdaaa7494f2e975

import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class MemberJjimInsertController {

	private final String command ="insertjjim.member";
<<<<<<< HEAD
	private final String getpage = "redirect:detailMovie.category";
=======
	private final String getpage = "redirect:/jjimlist.member";
>>>>>>> c28e6f50afc17ce18e2e43b61cdaaa7494f2e975
	
	@Autowired
	MemberJjimDao mjdao;

	
	@RequestMapping(value=command)
<<<<<<< HEAD
	public String doAction(MemberJjimBean jjim) {

		int cnt = mjdao.insertJjim(jjim);

		return getpage+"?num="+jjim.getMovie_num();
=======
	public String doAction(MemberJjimBean jjim,
						   HttpSession session) {

		session.setAttribute("jjim", jjim);
		System.out.println("asdasdcccccc"+jjim.getMovie_title());
		int cnt = mdao.insertJjim(jjim);
		return getpage;
>>>>>>> c28e6f50afc17ce18e2e43b61cdaaa7494f2e975
	}
	
}
