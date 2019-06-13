package webadv.s16202212.lab2;

import java.util.Arrays;
import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
@GetMapping("/task/{id}")
    public Task task(@PathVariable (value="id") int id) {
        return new Task(id,tasks.get(id-1));
    }
	private String message;
	private List<String> tasks = Arrays.asList("Git", "Maven", "Gradle", "Spring", "Bootstrap", "jQuery", "MyBatis","Redis");
	
	@GetMapping("/")
	public String index(Model model) {
    	model.addAttribute("message", message);
        model.addAttribute("tasks", tasks);
		return "index";		
	}
	@PostMapping(value="/ajax",produces={"text/html;charset=UTF-8;"})
    @ResponseBody
    public String ajax() {
    	System.out.println("hello....");
    	 return "AjaxÊµÀý£ºThis is an Ajax example";
    }

}
