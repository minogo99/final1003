package cs.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("CsFaqDao")
public class CsFaqDao {

private String namespace = "cs.model.CsFaqBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int getTotalCount(Map<String,String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace+".getTotalCount",map);
		return cnt;
	}
	public List<CsFaqBean> getAllData(Paging pageInfo,Map<String,String> map){
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		List<CsFaqBean> lists = sqlSessionTemplate.selectList(namespace+".getAllData",map,rowBounds);
		return lists;
	}
	public CsFaqBean getOneData(int num) {
		CsFaqBean cfb = sqlSessionTemplate.selectOne(namespace+".getOneData",num);
		return cfb;
	}
}
