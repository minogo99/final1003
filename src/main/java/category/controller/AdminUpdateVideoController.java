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
		DetailBean db =  ddao.selectNum(num);
		
		mav.addObject("db",db);
		mav.addObject("cb",cb);
		mav.addObject("pageNumber",pageNumber);
		mav.setViewName(getPage);
		return mav;
	}
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doAction(@RequestParam("file") MultipartFile file,CategoryBean cb,HttpServletRequest request,
			@Valid DetailBean db) {
		
		ModelAndView mav=new ModelAndView();
		
		String category=cb.getCategory();
		
		String root_path = request.getSession().getServletContext().getRealPath("/");  
	    String attach_path = "resources/images/poster/"+category+"/";
	    String filename = file.getOriginalFilename();
	    
		if(file.getOriginalFilename() != null && file.getOriginalFilename() != "") {
			new File(root_path + attach_path + filename).delete();	
			
			new File(root_path + attach_path + filename);
		}else {
			 
			cb.setImage(filename);		 			  
		 }	    
	    System.out.println(filename);
	    int cnt = cdao.UpdateVideo(cb);
	    DetailBean dcb= ddao.selectNum(cb.getNum()); 
	    
	    if(cnt>0) {
	    	System.out.println(dcb.getNum());
	    	mav.addObject("cb",cb);
	    	mav.addObject("db",dcb);
	    	mav.setViewName(gotoPage);
	    }else {
	    	mav.setViewName(getPage);
	    }
	    
		return mav;
	}
	
	  @RequestMapping(value="/adminLastUpdateVideo.category",method=RequestMethod.POST)
	  public ModelAndView goPage(DetailBean db ,BindingResult result) {
		 System.out.println("ss");
		  ModelAndView mav=new ModelAndView();
		  
		  if(result.hasErrors()) {
			  System.out.println("에러");
			  mav.setViewName(gotoPage); 
			  
		  }
		  else { 
			  int cnt = ddao.UpdateVideo(db);
	 
			  mav.setViewName("redirect:/videoList.category");
		  }
		  return mav;
	 }
	 
}
