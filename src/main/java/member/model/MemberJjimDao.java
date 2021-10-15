package member.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import category.model.CategoryBean;

@Component
public class MemberJjimDao {

	private String namespace="member.model.MemberJjimBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	
	public int insertJjim(MemberJjimBean jjim) {
		int cnt = sqlSessionTemplate.insert(namespace+".insertJjim",jjim);
		return cnt;
	}
	public int deleteJjim(MemberJjimBean jjim) {
		int cnt = sqlSessionTemplate.delete(namespace + ".deleteJjim",jjim);
		return cnt;
	}
	public List<MemberJjimBean> getByData(String id) {
		List<MemberJjimBean> mjlists = sqlSessionTemplate.selectList(namespace+".getByData",id);
		return mjlists;
	}
	public List<MemberJjimBean> getByMydata(String id){
		List<MemberJjimBean> cblists = sqlSessionTemplate.selectList(namespace+".getByMydata",id);
		return cblists;
	}
}
