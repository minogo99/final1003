package cs.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("CsNoticeDao")
public class CsNoticeDao {

private String namespace = "cs.model.CsNoticeBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int getTotalCount(Map<String,String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace+".getTotalCount",map);
		return cnt;
	}
	public List<CsNoticeBean> getAllData(Paging pageInfo,Map<String,String> map){
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		List<CsNoticeBean> lists = sqlSessionTemplate.selectList(namespace+".getAllData",map,rowBounds);
		return lists;
	}
	public CsNoticeBean getOneData(int num) {
		CsNoticeBean cnb = sqlSessionTemplate.selectOne(namespace+".getOneData",num);
		return cnb;
	}
	public void deleteData(int num) {
		sqlSessionTemplate.delete(namespace+".deleteData",num);
	}
}
