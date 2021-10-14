package category.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
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
	private final String command="/updateVideo.category";
	private final String getPage="adminUpdateVideoForm";
	private final String gotoPage="adminUpdateVideoDetailForm";
	
	@Autowired
	CategoryDao cdao;
	
	@Autowired
	DetailDao ddao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doation(@RequestParam("num")int num,
			 @RequestParam("pageNumber") int pageNumber) {
		
		ModelAndView mav = new ModelAndView();
		
		CategoryBean cb =cdao.selectNum(num); 
		
		mav.addObject("cb",cb);
		mav.addObject("pageNumber",pageNumber);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doAction(@RequestParam("file") MultipartFile file,CategoryBean cb,HttpServletRequest request) {
		System.out.println("오니오니");
		ModelAndView mav=new ModelAndView();
		
		
		String root_path = request.getSession().getServletContext().getRealPath("/");  
	    String attach_path = "resources/images/poster/";
	    String filename = file.getOriginalFilename();
	    
		if(filename != null && !filename.equals("")) {
			System.out.println("사진 바꿈");
			new File(root_path + attach_path + filename).delete();	
			
			new File(root_path + attach_path + filename);
		}else {
			cb.setImage(request.getParameter("image"));		 			  
			System.out.println("사진 안바꿈");
		 }	    
	    System.out.println(filename);
	    int cnt = cdao.UpdateVideo(cb);
	    System.out.println("업데이트");
	    CategoryBean ncb= cdao.selectNum(cb.getNum());  
	    if(cnt>0) {
	    	System.out.println("업데이트성공");
	    	System.out.println(ncb.getNum());
	    	DetailBean db = ddao.selectNum(ncb.getNum()); 	  
	    	System.out.println(cb.getGrade());
			System.out.println(cb.getCategory());
			System.out.println(cb.getTitle());
	    	mav.addObject("cb",ncb);
	    	mav.addObject("db",db);	    	
	    	mav.setViewName(gotoPage);
	    }else {
	    	System.out.println("실패");
	    	mav.setViewName(getPage);
	    }
	    
		return mav;
	}
	
	  @RequestMapping(value="/adminLastUpdateVideo.category",method=RequestMethod.POST)
	  public ModelAndView goPage(DetailBean db,CategoryBean cb, BindingResult result) {
		  
		  ddao.UpdateVideo(db);
		  System.out.println("성공");
		  ModelAndView mav=new ModelAndView();
			mav.setViewName("redirect:/videoList.category");
			return mav;
	 }
	 
}
