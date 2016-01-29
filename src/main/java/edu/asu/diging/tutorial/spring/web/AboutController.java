package edu.asu.diging.tutorial.spring.web;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//import edu.asu.diging.tutorial.spring.service.IMoodService;

@Controller
public class AboutController {
	
//	@Autowired
//	private IMoodService moodService;

	@RequestMapping(value="/about")
	public String showAbout() {
		//model.addAttribute("mood", mood);
		//model.addAttribute("explanation", moodService.getExplanation());		
		return "about";
	}
}