package base;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/weight")
public class WeightController {

	private final WeightRepository weightRepository;
	
	public WeightController(WeightRepository weightRepository) {
		this.weightRepository = weightRepository;
	}
	
	@GetMapping
    public ArrayList<Weight> listAll() {
        ArrayList<Weight> weights = new ArrayList<>();
        //weightRepository.findAll().forEach(weight -> (weights.add(weight)));
        return weights;
    }

	@GetMapping("{id}")
    public Weight find(@PathVariable Long id) {
        return weightRepository.findWeight(id);
    }

	@PostMapping
	public Weight create(@RequestBody Weight input) {
		//String weddingName, String userNmae ,float currentWeight, float finalWeight, Date finalDate
	    return weightRepository.save(new Weight( input.getWeddingName() , input.getUserName(),input.getCurrentWeight(), input.getFinalWeight(), input.getfinalDate()));
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
        	/* work for daily update...
            weight.setCurrentWeight(input.getCurrentWeight());
            weight.setDate(input.getDate());
            weight.setId(input.getId());
            */
            return weightRepository.save(weight);
        }
    }
	
}