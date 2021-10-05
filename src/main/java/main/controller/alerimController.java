package main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class alerimController {

	private final String command = "alert.wa";
	private final String getPage = "alrimchang";

	@RequestMapping(value = command)
	public String doAction() {
		
		return getPage;
	}
}
