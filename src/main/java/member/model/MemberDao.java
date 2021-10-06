package member.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component
public class MemberDao{

	String namespace="member.model.MemberBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public	int idCheck(String userId) throws Exception {
		int result = sqlSessionTemplate.selectOne(namespace + ".idCheck",userId);
		return result;
	}

	public MemberBean getID(String name) {
		MemberBean bean = sqlSessionTemplate.selectOne(namespace+".getID",name);
		return bean;
		
	}

	public MemberBean getPW(String name, String id) {
		MemberBean mb = new MemberBean();
		mb.setName(name);
		mb.setId(id);
		mb = sqlSessionTemplate.selectOne(namespace+".getPW",mb);
		return mb;
	}

	public MemberBean getData(String id) {
		MemberBean bean = sqlSessionTemplate.selectOne(namespace+".getData",id);
		return bean;
	}

	public int insertMember(MemberBean bean) {
		int cnt = sqlSessionTemplate.insert(namespace+".insertMember",bean);
		return cnt;
	}
	public int getTotalCount(Map<String, String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace + ".getTotalCount",map);
		return cnt;
	}
	
	public List<MemberBean> getMemberList(Paging pageInfo, Map<String, String> map) {
		List<MemberBean> lists = new ArrayList<MemberBean>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists = sqlSessionTemplate.selectList(namespace + ".getMemberList", map, rowBounds);
		return lists;
	}
	public  int insertData(MemberBean member) {
		return sqlSessionTemplate.insert(namespace+".insertMember", member);
	}

	public MemberBean getMember(int num) {
		MemberBean member = sqlSessionTemplate.selectOne(namespace+".getMember",num);
		return member;
	}

	public int updateData(@Valid MemberBean member) {
		int cnt = sqlSessionTemplate.update(namespace+".updateData",member);
		return cnt;
	}

	public int deleteMember(int num) {
		int cnt = sqlSessionTemplate.delete(namespace+".deleteMember",num);
		return cnt;
	}
	

	public int updateMember(MemberBean bean) {
		int cnt = sqlSessionTemplate.update(namespace + ".updateMember", bean);
		return cnt;
	}

	public MemberBean getByNumData(int num) {
		MemberBean member = sqlSessionTemplate.selectOne(namespace+".getByNumData",num);
		return member;
	}

	public int passwordCheck(MemberBean mb) {
		int cnt = sqlSessionTemplate.selectOne(namespace+".passwordCheck",mb);
		return 0;
	}

}
