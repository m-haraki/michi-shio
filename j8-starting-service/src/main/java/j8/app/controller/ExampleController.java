package j8.app.controller;

import j8.app.dao.Exampler;
import j8.app.dao.FormDao;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

	@RequestMapping("/example")
	public String example() {
		return "ex/example";
	}
	
	@RequestMapping("/example/inputForm")
	public String inputForm(@ModelAttribute("formDao") FormDao formDao) {
		return "ex/inputForm";
	}
	
	@RequestMapping("/example/tranForm")
	public String tranForm(@ModelAttribute("formDao") FormDao formDao) {
		return "ex/tranForm";
	}
	
	@RequestMapping("/example/restForm")
	public @ResponseBody Exampler restForm() {
		return new Exampler(1234, "Sample exampler");
	}
}
