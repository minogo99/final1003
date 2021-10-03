package board.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReplyService {

	@Autowired
	ReplyDao replyDao;
	
	public int listCount(int bno) {
		return replyDao.listCount(bno);
	}
	
	public List<ReplyBean> list(int bno,int startRow,int endRow){
		return replyDao.list(bno,startRow,endRow);
	}
	public void write(ReplyBean rb) {
		replyDao.write(rb);
	}
}
