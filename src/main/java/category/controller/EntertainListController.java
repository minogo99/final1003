package category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EntertainListController {

	private final String command = "entertain.category";
	private final String getPage = "entertainpage";
	
	
	@RequestMapping(value = command)
	public String doAction() {
		
		return getPage;
	}
	
}
