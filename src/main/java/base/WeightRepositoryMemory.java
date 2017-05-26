package base;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import base.Weight;

public class WeightRepositoryMemory implements WeightRepository{

	private final ConcurrentMap<Long, Weight> weights = new ConcurrentHashMap<>();
	private static AtomicLong counter = new AtomicLong();
	
	@Override
	public Iterable<Weight> findAll() {
		return this.weights.values();
	}

	@Override
	public Weight save(Weight weight) {
		if (weight.getId() == null) {
		      Long id = counter.incrementAndGet();
		      weight.setId(id);
		      this.weights.put(id, weight);
		    } else {
		      this.weights.put(weight.getId(), weight);
		    }
		    return weight;
		
	}

	@Override
	public Weight findWeight(Long id) {
		return this.weights.get(id);
	}

	@Override
	public Weight deleteWeight(Long id) {
		return this.weights.remove(id);
	}

	@Override
	public List<Weight> save(List<Weight> weight) {
		// TODO Auto-generated method stub
		return null;
	}

}
