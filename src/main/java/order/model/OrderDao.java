package order.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public class OrderDao {
	
	private String namespace="order.model.OrderBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int setInsertOrder(OrderBean ob) {
		System.out.println("1234567");
		int cnt=sqlSessionTemplate.insert(namespace+".insertOrder", ob);
		return cnt;
	}
}
