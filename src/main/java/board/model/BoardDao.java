package board.model;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import utility.Paging;

@Component("BoardDao")
public class BoardDao {

private String namespace = "board.model.BoardBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int getTotalCount(Map<String,String> map) {
		int cnt = sqlSessionTemplate.selectOne(namespace+".getTotalCount",map);
		return cnt;
	}
	public List<BoardBean> getAllData(Paging pageInfo,Map<String,String> map){
		RowBounds rowbounds = new RowBounds(pageInfo.getOffset(),pageInfo.getLimit());
		List<BoardBean> lists = sqlSessionTemplate.selectList(namespace+".getAllData",map,rowbounds);
		return lists;
	}
	public BoardBean getOneData(int num) {
		BoardBean bb = sqlSessionTemplate.selectOne(namespace+".getOneData",num);
		return bb;
	}
	public int readCountUp(int num) {
		int cnt = sqlSessionTemplate.update(namespace+".readCountUp",num);
		return cnt;
	}
	public int insertData(BoardBean bb) {
		int cnt = sqlSessionTemplate.insert(namespace+".insertData",bb);
		return cnt;
	}
	public int deleteData(int num) {
		int cnt = sqlSessionTemplate.delete(namespace+".deleteData",num);
		return cnt;
	}
	public int updateData(BoardBean bb) {
		int cnt = sqlSessionTemplate.update(namespace+".updateData",bb);
		return cnt;
	}
}
