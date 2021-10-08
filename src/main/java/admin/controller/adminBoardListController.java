package admin.controller;

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
import utility.Paging;

@Controller
public class adminBoardListController {

	@Autowired
	private BoardDao boardDao;
	
	@Autowired
	private ReplyDao replyDao;
	
	private final String command = "/boardList.admin";
	private final String getPage = "adminMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam(value="whatColumn",required = false) String whatColumn, 
			@RequestParam(value="keyword",required = false) String keyword,
			@RequestParam(value="pageNumber", required = false) String pageNumber,
			@RequestParam(value="pageSize", required = false) String pageSize,
			HttpServletRequest request) {
		
		ModelAndView mav = new ModelAndView();
		Map<String,String> map = new HashMap<String,String>();
		map.put("whatColumn", whatColumn); // whatColumn=title
		map.put("keyword", "%"+keyword+"%"); // keyword=%a%
		
		int totalCount = boardDao.getTotalCount(map);
		String url = request.getContextPath()+command; 
		Paging pageInfo = new Paging(pageNumber,pageSize,totalCount,url,whatColumn,keyword, null);
		
		mav.setViewName(getPage);
		List<BoardBean> lists = boardDao.getAllData(pageInfo,map);
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("totalCount", totalCount);
		
		for(int i=0;i<lists.size();i++) {
			lists.get(i).setReplycount(replyDao.listCount(lists.get(i).getNum()));
		}
		mav.addObject("lists", lists);
		
		String pageType = "boardList";
		mav.addObject("pageType", pageType);
		return mav;
	}
}
