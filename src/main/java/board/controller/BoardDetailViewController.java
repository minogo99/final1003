package board.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;
import board.model.ReplyBean;
import board.model.ReplyDao;


@Controller
public class BoardDetailViewController {

	@Inject
	ReplyDao replyDao;
	
	@Autowired
	BoardDao boardDao;
	
	private final String command = "/detailView.board";
	private final String getPage = "BoardDetailView";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam("num") int num,@RequestParam(value="rnum",defaultValue="0") int rnum,
			@RequestParam(value="replyPageNumber",defaultValue="1") int replyPageNumber,@RequestParam(value="replyType",required = false) String replyType) {
		
		ModelAndView mav = new ModelAndView();
		int count = replyDao.listCount(num);
		mav.addObject("count", count);	
		
		int startRow = (replyPageNumber - 1) * 3 + 1;
		int endRow = replyPageNumber * 3;

		boardDao.readCountUp(num);
		BoardBean bb = boardDao.getOneData(num);
		
		mav.addObject("bb", bb);
		
		List<ReplyBean> reply = null;
		reply = replyDao.list(num,startRow,endRow);
		mav.addObject("reply", reply);
		
		if(rnum != 0) {
		ReplyBean rb = replyDao.getOneData(rnum);
		mav.addObject("rb", rb);
		}
		if(replyType == null) {
		replyType = "write";
		}
		mav.addObject("replyType", replyType);
		System.out.println("replyTypesadasdadasdasdaDetail2"+replyType);
		mav.setViewName(getPage);
		
		return mav;
	}
}
