package reactjs.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

}