package webadv.s16202212.p5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	@GetMapping("/")
	public String index(Model model,String account, String password) {
//		if ("abc".equals(account) && "123".equals(password))
//			return "home";
//		else
			return "index";
	}
	@GetMapping("/login")
	public String login(Model model) {
//		if ("abc".equals(account) && "123".equals(password))
			return "home";
//		else
//			return "index";
	}
}
