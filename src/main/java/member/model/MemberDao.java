package member.model;


public interface MemberDao {

	
	
	public int idCheck(String userId) throws Exception;

	public MemberBean getPW(String name, String id);

	public MemberBean getData(String id);
	
}
