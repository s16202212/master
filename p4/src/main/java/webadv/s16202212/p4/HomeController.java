package webadv.s16202212.p4;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	// inject via application.properties
    @Value("${welcome.message}")
    private String message;
    
    private List<String> tasks = Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");
    
    @GetMapping("/")
	public String index(Model model) {
    	model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
		return "welcome";		
	}
    @PostMapping("add")
    public String doAdd(String a,String b, Model model) {
//    	System.out.println(a+b);
    	int m=0,n=0;
    	try {
    		m=Integer.parseInt(a);
    		n=Integer.parseInt(b);
    	}catch(NumberFormatException e) {
    		
    	}
    	model.addAttribute("a", m);
    	model.addAttribute("b", m);
    	model.addAttribute("result", m+n);
    	return index(model);
    }
    @PostMapping(value="/ajax",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String ajax() {
    	System.out.println("hello....");
    	 return "AjaxÊµÀý£ºThis is an Ajax example";
    }
}