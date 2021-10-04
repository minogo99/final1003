package member.service;

import javax.servlet.http.HttpServletResponse;

import member.model.MemberBean;


public interface MemberService {
	public void check_id(String id, HttpServletResponse response) throws Exception;

	public int insertData(MemberBean member, HttpServletResponse response) throws Exception;
}