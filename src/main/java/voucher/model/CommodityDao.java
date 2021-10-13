package voucher.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommodityDao {
	
private String namespace="voucher.model.CommodityBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public CommodityBean selectMember(int num) {
		CommodityBean cb=sqlSessionTemplate.selectOne(namespace+".selectMember", num);
		return cb;
	}
}
