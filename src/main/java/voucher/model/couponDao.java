package voucher.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component
public class couponDao {

	private String namespace="voucher.model.couponBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public void couponRegister(String cp_number,String cp_id) {
		couponBean cpb = new couponBean();
		cpb.setCp_number(cp_number);
		cpb.setCp_id(cp_id);
		sqlSessionTemplate.selectOne(namespace+".couponRegister",cpb);
	}
	public couponBean getOneData(String cp_number) {
		couponBean cb = sqlSessionTemplate.selectOne(namespace+".getOneData",cp_number);
		return cb;
	}
	
	public int getTotalCount(Map<String,String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace+".getTotalCount",map);
		return cnt;
	}
	public List<couponBean> getAllData(Paging pageInfo,Map<String,String> map){
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		List<couponBean> lists = sqlSessionTemplate.selectList(namespace + ".getMemberList", map, rowBounds);
		return lists;
	}
}
