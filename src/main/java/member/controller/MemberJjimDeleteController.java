package member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import member.model.MemberDao;
import member.model.MemberJjimBean;
import member.model.MemberJjimDao;


@Controller
public class MemberJjimDeleteController {

	private final String command ="deletejjim.member";
	private final String getpage = "redirect:detailMovie.category";

	@Autowired
	MemberJjimDao mjdao;

	@RequestMapping(value = command)
	public String doAction(MemberJjimBean jjim) {

		mjdao.deleteJjim(jjim);

		return getpage+"?num="+jjim.getMovie_num();
	}
}