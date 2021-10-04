package admin.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.model.MemberBean;
import utility.Paging;


@Component("myAdminDAO")
public class AdminDAO {

	private String namespace = "admin.model.AdminDTO";
	

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public AdminDTO getData(String admin_id) {
		AdminDTO adminDto = sqlSessionTemplate.selectOne(namespace+".getData",admin_id);
		return adminDto;
	}
	
	



}



