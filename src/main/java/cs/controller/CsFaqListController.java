package cs.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import cs.model.CsFaqBean;
import utility.Paging;

@Controller
public class CsFaqListController {

	@Autowired
	cs.model.CsFaqDao cfDao;
	
	private final String command = "/faqList.cs";
	private final String getPage = "CsMain";
	
	@RequestMapping(value=command)
	public ModelAndView doActionGet(@RequestParam(value="whatColumn",required = false) String whatColumn, 
			@RequestParam(value="keyword",required = false) String keyword,
			@RequestParam(value="pageNumber", required = false) String pageNumber,
			@RequestParam(value="pageSize", required = false) String pageSize,
			HttpServletRequest request) {
		System.out.println("asdasghhbhbzvzxvz");
		ModelAndView mav = new ModelAndView();
		Map<String,String> map = new HashMap<String,String>();
		map.put("whatColumn", whatColumn); // whatColumn=title
		map.put("keyword", "%"+keyword+"%"); // keyword=%a%
		
		int totalCount = cfDao.getTotalCount(map);
		String url = request.getContextPath()+command; 
		Paging pageInfo = new Paging(pageNumber,pageSize,totalCount,url,whatColumn,keyword, null);
		

		List<CsFaqBean> lists_faq = cfDao.getAllData(pageInfo,map);
		mav.addObject("lists_faq", lists_faq);
		mav.addObject("pageInfo", pageInfo);
		mav.addObject("totalCount", totalCount);
		
		int flag = 2;
		mav.addObject("flag", flag);
		String faqPage = "list";
		mav.addObject("faqPage", faqPage);

		mav.setViewName(getPage);
		return mav;
	}
}
