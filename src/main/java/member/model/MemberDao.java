package member.model;

import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import utility.Paging;

public interface MemberDao {

	
	
	public int idCheck(String userId) throws Exception;

	public MemberBean getPW(String name, String id);

	public MemberBean getData(String id);
	
	public int insertMember(MemberBean mb);
	
	public List<MemberBean> getMemberList(Paging pageInfo, Map<String, String> map);
	
	public MemberBean getMember(int num);
	
	public int updateData(@Valid MemberBean member);
	
	public int deleteMember(int num);
	
	public  int insertData(MemberBean member);

	public int getTotalCount(Map<String, String> map);
	
	public int updateMember(MemberBean mb);
}
