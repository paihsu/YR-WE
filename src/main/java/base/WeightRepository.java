package base;

import java.util.List;

public interface WeightRepository {

	
	Iterable<Weight> findAll();
	Weight save(Weight weight);
	List<Weight> save(List<Weight> weight);
	Weight findWeight(Long id);
	Weight deleteWeight(Long id);
	
	
}
