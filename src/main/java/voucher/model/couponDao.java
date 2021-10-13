package voucher.model;

import java.time.LocalDate;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class couponDao {

	private String namespace="voucher.model.couponBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int useCheck(String cp_number,String nowdate) {
		couponBean cpb = new couponBean();
		cpb.setCp_number(cp_number);
		cpb.setNowdate(nowdate);
		int result = sqlSessionTemplate.selectOne(namespace+".useCheck",cpb);
		return result;
	}
	public void couponRegister(String cp_number,String cp_id) {
		couponBean cpb = new couponBean();
		cpb.setCp_number(cp_number);
		cpb.setCp_id(cp_id);
		sqlSessionTemplate.selectOne(namespace+".couponRegister",cpb);
	}
}
