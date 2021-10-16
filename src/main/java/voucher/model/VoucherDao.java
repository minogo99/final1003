package voucher.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VoucherDao {
	
	String namespace = "voucher.model.VoucherBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public VoucherBean getSelect(int num) {
		VoucherBean vb=sqlSessionTemplate.selectOne(namespace+".getSelect",num);
		return vb;
	}
}
