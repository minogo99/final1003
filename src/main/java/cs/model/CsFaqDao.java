package cs.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import utility.Paging;

@Component
public class CsFaqDao {

private String namespace = "cs.model.CsFaqBean";
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
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
	public void insertData(CsFaqBean cfb) {
		sqlSessionTemplate.insert(namespace+".insertData",cfb);
	}
	public void deleteData(int num) {
		sqlSessionTemplate.delete(namespace+".deleteData",num);
	}
	public void updateData(CsFaqBean cfb) {
		sqlSessionTemplate.update(namespace+".updateData",cfb);
	}
}
