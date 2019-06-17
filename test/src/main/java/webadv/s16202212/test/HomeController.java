package webadv.s16202212.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import webadv.s16202212.repository.MathRepository;


@Controller
public class HomeController {
	
	@Autowired
	private MathRepository repository;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("Math_list",repository.findAll());
		return "home";
	}
	
}
