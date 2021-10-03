package category.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AnimationListController {

	private final String command = "/animation.category";
	private final String getPage = "animationpage"; 
	@RequestMapping(value=command)
	public String doActionGet() {
		
		return getPage;
	}
}
