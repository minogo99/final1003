package admin.controller;
<<<<<<< HEAD:src/main/java/admin/controller/adminMemberDeleteController.java
=======

import javax.inject.Inject;
>>>>>>> 4a3d30d329452bba6d450fcf5f3240cf13495293:src/main/java/member/controller/memberDeleteController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;

@Controller
public class adminMemberDeleteController {
<<<<<<< HEAD:src/main/java/admin/controller/adminMemberDeleteController.java
	private final String command = "/memberDelete.admin";
	private final String gotoPage = "redirect:memberList.admin";
=======
	private final String command = "/delete.admin";
	private final String gotoPage = "redirect:/memberList.admin";
>>>>>>> 4a3d30d329452bba6d450fcf5f3240cf13495293:src/main/java/member/controller/memberDeleteController.java
	
	@Autowired
	MemberDao memberDao;
	
	@RequestMapping(value = command, method = RequestMethod.GET)
	public String doActionGet(@RequestParam("num") int num, 
			@RequestParam("pageNumber") int pageNumber) {
		//MemberBean member = memberdao.getMember(num);
		int cnt = memberDao.deleteMember(num);
		
		return gotoPage + "?pageNumber=" + pageNumber;
	}
}
