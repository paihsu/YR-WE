package main.java.base;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin
@RestController
@RequestMapping("/gold")
public class GoalController {

	private final GoldRepository goldRepository;
	
	public void GoldController(GoldRepository goldRepository) {
		this.goldRepository = goldRepository;
		
	}
}
