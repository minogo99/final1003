package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LiveController {

	private final String command = "live.wa";
	private final String getPage = "Livepage";
	
	@RequestMapping(value=command)
	public String doAction() {
		
		return getPage;
	}
	
	
}
