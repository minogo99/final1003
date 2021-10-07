package main.detail;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;


public class DetailMainDao {

	String namespace="main.detail.DetailMainBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public DetailMainBean detailMainVideoView(int vnum) {
		DetailMainBean dmb = sqlSessionTemplate.selectOne(namespace+".detailMainVideoView",vnum);
		return dmb;
	}

	public List<DetailMainBean> detailMainVideoGenre(String genre) {
		List<DetailMainBean> lists=new ArrayList<DetailMainBean>();
		lists=sqlSessionTemplate.selectList(namespace+".detailVideoGenre", genre);
		return lists;
	}

}
