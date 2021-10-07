package main.detail;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class MainDetailDao {

	String namespace ="main.detail.DetailMainBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	public MainDetailBean detailMainVideoView(int num) {
		MainDetailBean dmb = sqlSessionTemplate.selectOne(namespace+".detailMainVideoView",num);
		return dmb;
	}

	public List<MainDetailBean> detailMainVideoGenre(String genre) {
		List<MainDetailBean> lists = new ArrayList<MainDetailBean>();
		lists=sqlSessionTemplate.selectList(namespace+".detailMainVideoGenre",genre);
		return lists;
	}
	
	
}
