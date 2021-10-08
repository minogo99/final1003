package category.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailDao;
import category.model.CategoryBean;
import category.model.CategoryDao;
import member.model.MemberBean;
import utility.Paging;

@Controller
public class VideoListController {
	
	private final String command="/videoList.category";
	private final String getPage="adminVideoList";
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doAction(
			@RequestParam(value="whatColumn",required = false) String whatColumn,
			@RequestParam(value="keyword",required = false) String keyword,
			@RequestParam(value="pageNumber",required = false) String pageNumber,
			HttpServletRequest request
			) {
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("whatColumn", whatColumn); 
		map.put("keyword", "%"+keyword+"%");
		int totalCount = cdao.getTotalCount(map);
		String url = request.getContextPath() + command ;

		ModelAndView mav = new ModelAndView();
		Paging pageInfo = new Paging(pageNumber,null,totalCount,url,whatColumn,keyword, null );
	
		List<CategoryBean> lists = cdao.getVideoList(pageInfo, map);
		
		mav.addObject("lists", lists);
		mav.addObject("totalCount", totalCount);
		mav.addObject("pageInfo", pageInfo);
		
		mav.setViewName(getPage);
		return mav;
	}
}
