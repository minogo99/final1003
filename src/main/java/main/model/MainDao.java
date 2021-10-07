package main.model;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("myMainDao")
public class MainDao {
	
	String namespace = "main.model.MainBean";

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public List<MainBean> selectMain() {
		List<MainBean> lists = new ArrayList<MainBean>();
		lists=sqlSessionTemplate.selectList(namespace+".selectMain");
		return lists;
	}

	public List<MainBean> selectAll() {
		List<MainBean> lists = new ArrayList<MainBean>();
		lists=sqlSessionTemplate.selectList(namespace+".selectAll");
		return lists;
	}
	
	
	
}
