package main.java.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weight")
public class WeightController {

	@Autowired
	private WeightRepository weightRepository;

}