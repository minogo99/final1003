package member.service;

import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import member.model.MemberBean;
import member.model.MemberDao;

@Service
public class MemberServiceImpl implements MemberService {

	@Inject
	private MemberDao memberDao;

	// 아이디 중복 검사(AJAX)
	@Override
	public void check_id(String id, HttpServletResponse response) throws Exception {
		PrintWriter out = response.getWriter();
		out.println(memberDao.check_id(id));
		out.close();
	}

	// 회원가입
	@Override
	public int insertData(MemberBean member, HttpServletResponse response) throws Exception {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		if (memberDao.check_id(member.getId()) == 1) {
			out.println("<script>");
			out.println("alert('동일한 아이디가 있습니다.');");
			out.println("history.go(-1);");
			out.println("</script>");
			out.close();
			return 0;
		}else {
			memberDao.insertData(member);
			return 1;
		}
	}
}