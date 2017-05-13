package base;

import java.util.List;
public interface WeightRepository {

	Weight updateWeight(float weight);
	Weight updateDare(String date);
	
	Iterable<Weight> findAll();
	Weight save(Weight weight);
	List<Weight> save(List<Weight> weight);
	Weight findWeight(Long id);
	Weight deleteWeight(Long id);
	
	
}
