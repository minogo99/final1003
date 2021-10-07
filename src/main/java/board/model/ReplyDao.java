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
	
	public int listCount(int bnum) {
		int count = sqlSessionTemplate.selectOne(namespace+".listCount",bnum);
		return count;
	}
	
	public List<ReplyBean> list(int bnum,int startRow,int endRow){
		ReplyBean rb = new ReplyBean();
		rb.setBnum(bnum);
		rb.setStartRow(startRow);
		rb.setEndRow(endRow);
		List<ReplyBean> lists = sqlSessionTemplate.selectList(namespace+".list",rb);
		return lists;
	}
	
	public void replyWrite(ReplyBean rb) {
		sqlSessionTemplate.selectOne(namespace+".replyWrite",rb);
	}
	public ReplyBean getOneData(int rnum) {
		ReplyBean rb = sqlSessionTemplate.selectOne(namespace+".getOneData",rnum);
		return rb;
	}
	public void replyUpdate(ReplyBean rb) {
		sqlSessionTemplate.update(namespace+".replyUpdate",rb);
	}
	public void replyDelete(int rnum) {
		sqlSessionTemplate.delete(namespace+".replyDelete",rnum);
	}
}
