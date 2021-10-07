package board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import board.model.BoardBean;
import board.model.BoardDao;
import board.model.ReplyDao;
import member.model.MemberBean;
import utility.Paging;

@Controller
class BoardListController {

	@Autowired
	BoardDao boardDao;
	
	@Autowired
	ReplyDao replyDao;
	
	private final String command = "/list.board";
	private final String getPage = "BoardList";
	private final String getAdminPage = "adminBoardList";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam(value="whatColumn",required = false) String whatColumn, 
			@RequestParam(value="keyword",required = false) String keyword,
			@RequestParam(value="pageNumber", required = false) String pageNumber,
			@RequestParam(value="pageSize", required = false) String pageSize,
			HttpServletRequest request,HttpSession session) {
		
		ModelAndView mav = new ModelAndView();
		Map<String,String> map = new HashMap<String,String>();
		map.put("whatColumn", whatColumn); // whatColumn=title
		map.put("keyword", "%"+keyword+"%"); // keyword=%a%
		
		int totalCount = boardDao.getTotalCount(map);
		String url = request.getContextPath()+command; 
		Paging pageInfo = new Paging(pageNumber,pageSize,totalCount,url,whatColumn,keyword, null);
		
		List<BoardBean> lists = boardDao.getAllData(pageInfo,map);
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("totalCount", totalCount);
		
		for(int i=0;i<lists.size();i++) {
			lists.get(i).setReplycount(replyDao.listCount(lists.get(i).getNum()));
		}
		mav.addObject("lists", lists);
		
		MemberBean loginInfo = (MemberBean) session.getAttribute("loginInfo");
		if(loginInfo != null) {
			if(loginInfo.getId().equals("admin")) {
				mav.setViewName(getAdminPage);
			}else {
			mav.setViewName(getPage);
			}
		}else {
		mav.setViewName(getPage);
		}
		return mav;
	}
}
