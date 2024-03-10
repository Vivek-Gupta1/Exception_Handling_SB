package com.vivek.Controlller;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@GetMapping("/")
	public String getWel(Model model) {
	    int a = 10/0;
	    model.addAttribute("msg", "hii");
		return "index";

	}
	@GetMapping("/greet")
	 public String getGret(Model model) {
		 String s = null;
		 s.length();
		return "index";
		 
	 }

	@ExceptionHandler(value = ArithmeticException.class )
	public String exceptionHanle(ArithmeticException ex) {
		String msg = ex.getMessage();
		 logger.error(msg);
		return "errormsg";
	}
	
	@ExceptionHandler(value=NullPointerException.class)
	public String eHanle(NullPointerException ex) {
		logger.error(ex.getMessage());
		return "errormsg";
	}

}
