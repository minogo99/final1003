package category.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import category.detail.DetailBean;
import category.detail.DetailDao;
import category.model.CategoryBean;
import category.model.CategoryDao;


@Controller
public class AdminUpdateVideoController {
	private final String command="/updatevideo.category";
	private final String getPage="adminUpdateVideoForm";
	private final String gotoPage="redirect:/videoList.category";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doation(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber) {
		
		ModelAndView mav = new ModelAndView();
		
		CategoryBean cb =cdao.detailVideoView(num); 
		DetailBean db = ddao.detailVideoView(num);
		mav.addObject("cb",cb);
		mav.addObject("db",db);
		mav.addObject("pageNumber",pageNumber);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doAction(@RequestParam("file") MultipartFile file,CategoryBean cb,HttpServletRequest request,
			@Valid DetailBean db) {
		
		ModelAndView mav=new ModelAndView();
		String category=cb.getCategory();
		System.out.println(cb.getGrade());
		System.out.println(cb.getCategory());
		System.out.println(cb.getTitle());
	
		String root_path = request.getSession().getServletContext().getRealPath("/");  
	    String attach_path = "resources/images/poster/"+category+"/";
	    String filename = file.getOriginalFilename();
	    System.out.println(filename);
	    System.out.println(root_path + attach_path + filename);
	    File f = new File(root_path + attach_path + filename);
	    try {
	     file.transferTo(f);
	    } catch (Exception e) {
	     System.out.println(e.getMessage());
	    }  
	    cb.setImage(filename);
	    System.out.println(filename);
	    int cnt = cdao.UpdateVideo(cb);
	
	    if(cnt>0) {
	    	ddao.UpdateVideo(db);
	    	mav.setViewName(gotoPage);
	    }else {
	    	mav.setViewName(getPage);
	    }
	    
		return mav;
	}
	
	
	/*
	 * @RequestMapping(value="/adminLastUpdateVideo.category",method=RequestMethod.
	 * POST) public ModelAndView goPage(DetailBean db) {
	 * 
	 * ddao.UpdateVideo(db);
	 * 
	 * ModelAndView mav=new ModelAndView();
	 * mav.setViewName("redirect:/videoList.category"); return mav; }
	 */
}
