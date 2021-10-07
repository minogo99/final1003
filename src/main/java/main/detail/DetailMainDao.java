package main.detail;


public class DetailMainDao {


import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


public class DetailMainDao {

	String namespace="main.detail.DetailMainBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public DetailMainBean detailVideoView(int num) {
		DetailMainBean dmb = sqlSessionTemplate.selectOne(namespace+".detailVideoView",num);
		return dmb;
	}

	public List<DetailMainBean> detailVideoGenre(String genre) {
		List<DetailMainBean> lists=new ArrayList<DetailMainBean>();
		lists=sqlSessionTemplate.selectList(namespace+".detailVideoGenre", genre);
		return lists;
	}


}
