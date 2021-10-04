package member.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component("myMemberDao")
@Repository
public class MemberDaoImpl implements MemberDao{

	String namespace="member.model.MemberBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	@Override
	public int idCheck(String userId) throws Exception {
		int result = sqlSessionTemplate.selectOne(namespace + ".idCheck",userId);
		return result;
	}

	public MemberBean getID(String name) {
		MemberBean bean = sqlSessionTemplate.selectOne(namespace+".getID",name);
		return bean;
		
	}

	@Override
	public MemberBean getPW(String name, String id) {
		MemberBean mb = new MemberBean();
		mb.setName(name);
		mb.setId(id);
		mb = sqlSessionTemplate.selectOne(namespace+".getPW",mb);
		return mb;
	}

	@Override
	public MemberBean getData(String id) {
		MemberBean bean = sqlSessionTemplate.selectOne(namespace+".getData",id);
		return bean;
	}

	public int insertMember(MemberBean bean) {
		int cnt = sqlSessionTemplate.insert(namespace+".insertMember",bean);
		return cnt;
	}

	public int updateData(MemberBean bean) {
		int cnt = sqlSessionTemplate.update(namespace + ".updateData", bean);
		System.out.println(cnt);
		return cnt;
	}

}
