package board.model;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ReplyDao")
public class ReplyDao {

private String namespace = "board.model.ReplyBean";
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;
	
	public int listCount(int bno) {
		int count = sqlSessionTemplate.selectOne(namespace+".listCount",bno);
		return count;
	}
	
	public List<ReplyBean> list(int bno,int startRow,int endRow){
		ReplyBean rb = new ReplyBean();
		rb.setBno(bno);
		rb.setStartRow(startRow);
		rb.setEndRow(endRow);
		List<ReplyBean> lists = sqlSessionTemplate.selectList(namespace+".list",rb);
		return lists;
	}
	
	public void replyWrite(ReplyBean rb) {
		sqlSessionTemplate.selectOne(namespace+".replyWrite",rb);
	}
}
