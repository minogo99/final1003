package voucher.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
}
