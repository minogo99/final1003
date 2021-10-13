package member.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import member.model.MemberJjimBean;
import member.model.MemberJjimDao;

@Controller
public class MemberJjimInsertController {

	private final String command ="insertjjim.member";
	private final String getpage = "redirect:detailMovie.category";
	
	@Autowired
	MemberJjimDao mjdao;

	
	@RequestMapping(value=command)
	public String doAction(MemberJjimBean jjim) {

		int cnt = mjdao.insertJjim(jjim);

		return getpage+"?num="+jjim.getMovie_num();
	}
	
}
