package category.detail;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import category.model.CategoryBean;

@Component
public class DetailDao {
	
	String namespace="category.detail.DetailBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public DetailBean detailVideoView(int vnum) {
		
		DetailBean db =sqlSessionTemplate.selectOne(namespace+".detailVideoView",vnum);
		return db;
	}
	
	public List<DetailBean> detailVideoGenre(String genre) {
		List<DetailBean> lists=new ArrayList<DetailBean>();
		lists=sqlSessionTemplate.selectList(namespace+".detailVideoGenre", genre);
		return lists;
	}
}



