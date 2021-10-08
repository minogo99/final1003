package category.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import category.model.CategoryBean;
import category.model.CategoryDao;

@Controller
public class AdminInsertVideoController {

	private final String command="/adminInsertVideo.category";
	private final String getPage="adminInsertVideoForm";
	private final String goPage="sample";
	
	@Autowired
	CategoryDao cdao;
	
	@RequestMapping(value=command,method = RequestMethod.GET)
	public ModelAndView doation() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName(getPage);
		return mav;
	}
	
	@RequestMapping(value=command,method = RequestMethod.POST)
	public ModelAndView doAction(@RequestParam("file") MultipartFile file,CategoryBean cb,HttpServletRequest request) {
		
		ModelAndView mav=new ModelAndView();
		String category=cb.getCategory();
		System.out.println(category);
		
		String root_path = request.getSession().getServletContext().getRealPath("/");  
	    String attach_path = "resources/images/poster/"+category+"/";
	    String filename = file.getOriginalFilename();
	    System.out.println(root_path + attach_path + filename);
	    File f = new File(root_path + attach_path + filename);
	    try {
	     file.transferTo(f);
	    } catch (Exception e) {
	     System.out.println(e.getMessage());
	    }  
	    
	    mav.setViewName(goPage);
		return mav;
	}
	
}
