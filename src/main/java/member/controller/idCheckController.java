package member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


import member.model.MemberDao;

@Controller
public class idCheckController {

	@Autowired
	MemberDao memberDao;
	@RequestMapping(value="/idCheck.member",method = RequestMethod.POST, produces = "application/text; charset=utf8")
	@ResponseBody
	 public String simpleWithObjectPost(HttpServletRequest request) throws Exception {
		String userId = request.getParameter("userId");   
		int result = memberDao.idCheck(userId);
		System.out.println(result);
	       return Integer.toString(result);
	    }
}
