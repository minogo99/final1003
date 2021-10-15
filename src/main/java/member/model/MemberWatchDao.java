package member.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import category.model.CategoryBean;

@Component
public class MemberWatchDao {

	private String namespace="member.model.MemberWatchBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public int insertWatch(MemberWatchBean watch) {
		int cnt = sqlSessionTemplate.insert(namespace + ".insertWatch", watch);
		return cnt;
	}

	public List<MemberWatchBean> getByMydata(String id) {
		List<MemberWatchBean> wblists = sqlSessionTemplate.selectList(namespace+".getByMydata",id);
		return wblists;
	}

	public void deleteWatch() {
		sqlSessionTemplate.delete(namespace + ".deleteWatch");
		
	}
}
