package base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
@RequestMapping("/views")
public class WeightMappingController {

	@GetMapping
	  public String index(@RequestParam(value = "id") Long id) {
	    return "WeightResult.html";
	  }

}
