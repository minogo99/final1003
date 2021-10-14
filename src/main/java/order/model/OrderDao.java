package order.model;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderDao {
	
	private String namespace="order.model.OrderBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int setInsert(int mnum) {
		int cnt=sqlSessionTemplate.insert(namespace+".insertOne",mnum);
		return cnt;
	}
	public OrderBean selectOne(int mnum) {
		OrderBean ob=sqlSessionTemplate.selectOne(namespace+".selectOne",mnum);
		return ob;
	}
	
	public int setInsertDetail(OrderDetailBean odb) {
		int cnt=sqlSessionTemplate.insert(namespace+".setInsertDetail",odb);
		return cnt;
	}
}
