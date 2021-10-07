package member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import member.model.MemberBean;
import member.model.MemberDao;
import utility.Paging;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public int getTotalCount(Map<String, String> map) {
		int cnt = memberDao.getTotalCount(map);
		return cnt;
	}
	public List<MemberBean> getMemberList(Paging pageInfo, Map<String, String> map) {
		List<MemberBean> lists  = memberDao.getMemberList(pageInfo, map);
		return lists;
	}
}
