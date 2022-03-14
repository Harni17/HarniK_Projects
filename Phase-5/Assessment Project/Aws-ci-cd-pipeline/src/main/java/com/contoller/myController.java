package com.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {

	@RequestMapping("/index")
	public String index() {
		return "index.html";
	}
}
