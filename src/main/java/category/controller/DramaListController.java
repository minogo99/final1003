package category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DramaListController {

	private final String command = "/drama.category";
	private final String getPage = "dramapage"; 
	@RequestMapping(value=command)
	public String doActionGet() {
		
		return getPage;
	}
	
}
