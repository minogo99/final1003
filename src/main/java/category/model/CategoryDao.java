package category.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import member.model.MemberBean;
import utility.Paging;

@Component("myCategoryDao")
public class CategoryDao {
	
	String namespace="category.model.CategoryBean";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<CategoryBean> selectAll() {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		
		lists=sqlSessionTemplate.selectList(namespace+".selectAll");
		System.out.println("lists : " + lists.size());
		return lists;
	}
	
	public List<CategoryBean> selectMovie() {
		List<CategoryBean> lists=new ArrayList<CategoryBean>();
		
		lists=sqlSessionTemplate.selectList(namespace+".selectMovie");
		System.out.println("lists : " + lists.size());
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
	public int getTotalCount(Map<String, String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace + ".getTotalCount",map);
		return cnt;
	}
	
	public List<CategoryBean> getVideoList(Paging pageInfo, Map<String, String> map) {
		List<CategoryBean> lists = new ArrayList<CategoryBean>();
		RowBounds rowBounds = new RowBounds(pageInfo.getOffset(), pageInfo.getLimit());
		lists = sqlSessionTemplate.selectList(namespace + ".getVideoList", map, rowBounds);
		return lists;
	}
	public int InsertVideo(CategoryBean cb) {
		int cnt=sqlSessionTemplate.insert(namespace+".insertVideo",cb);
		return cnt;
	}
	public CategoryBean selectTitle(String title) {
		
		CategoryBean cb =sqlSessionTemplate.selectOne(namespace+".selectTitle",title);
		return cb;
	}
	public int detailVideoDelete(int num) {
		int cnt=sqlSessionTemplate.delete(namespace+".detailVideoDelete",num);
		return cnt;
	}

	public CategoryBean getCategory(int num) {
		CategoryBean cb =sqlSessionTemplate.selectOne(namespace+".selectNum",num);
		return cb;
	}

	public int UpdateVideo(CategoryBean cb) {
		int cnt=sqlSessionTemplate.update(namespace+".updateVideo",cb);
		return cnt;
	}
	
}
