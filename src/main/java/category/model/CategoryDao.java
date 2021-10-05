package category.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myCategoryDao")
public class CategoryDao {
	
	String namespace="category.model.CategoryBean";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<CategoryBean> selectMovie() {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		
		lists=sqlSessionTemplate.selectList(namespace+".selectMovie");
		return lists;
	}
	
	public CategoryBean detailVideoView(int num) {
		
		CategoryBean cb =sqlSessionTemplate.selectOne(namespace+".detailVideoView",num);
		return cb;
	}
	
	public List<CategoryBean> detailVideoGenre(String genre) {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		lists=sqlSessionTemplate.selectList(namespace+".detailVideoGenre", genre);
		return lists;
	}
	
	public List<CategoryBean> selectEntertain() {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		
		lists=sqlSessionTemplate.selectList(namespace+".selectEnter");
		return lists;
	}
	
	public List<CategoryBean> selectDrama() {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		
		lists=sqlSessionTemplate.selectList(namespace+".selectDrama");
		return lists;
	}
}
