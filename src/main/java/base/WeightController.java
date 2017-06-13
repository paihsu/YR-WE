package base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import base.WeightRepository;

import base.Weight;

@RestController
@CrossOrigin
@RequestMapping("/weight")
public class WeightController implements ApiController<Weight> {
	
	private final WeightRepository weightRepository;
	
	public WeightController(WeightRepository weightRepository) {
		this.weightRepository = weightRepository;
	}
	
	@GetMapping
    public ArrayList<Weight> listAll() {
        ArrayList<Weight> weights = new ArrayList<>();
        return weights;
    }

	@GetMapping("{id}")
    public Weight find(@PathVariable Long id) {
        return weightRepository.findWeight(id);
    }

	@PostMapping
	public Weight create(@RequestBody Weight input) {
		//String weddingName, String userNmae ,float currentWeight, float finalWeight, Date finalDate
	    return weightRepository.save(new Weight( input.getWeddingName() , input.getUserName(), input.getAge(), input.getCurrentWeight(), 
	    								input.getFinalWeight(),  input.getHeight(),input.getfinalDate(), input.getCalori()));
	}

	@DeleteMapping("{id}")
	public Weight delete(@PathVariable Long id) {
	    return weightRepository.deleteWeight(id);
	}
	
	@PutMapping("{id}")
    public Weight update(@PathVariable Long id, @RequestBody Weight input) {
        Weight weight = weightRepository.findWeight(id);
        if (weight == null) {
            return null;
        } else {
        	if(input.getAge() != null) {
        		weight.setAge(input.getAge());
        	}
        	if(input.getCurrentWeight() != null) {
        		weight.setCurrentWeight(input.getCurrentWeight());
        	}
        	if(input.getfinalDate() != null) {
        		weight.setfinalDate(input.getfinalDate());
        	}
        	if(input.getFinalWeight() != null) {
        		weight.setFinalWeight(input.getFinalWeight());
        	}
        	if(input.getHeight() != null) {
        		weight.setHeight(input.getHeight());
        	}
        	if(input.getUserName() != null) {
        		weight.setUserName(input.getUserName());
        	}
        	if(input.getWeddingName()!= null) {
        		weight.setWeddingName(input.getWeddingName());
        	}
        		
            return weightRepository.save(weight);
        }
    }
	
}