package base;

import org.junit.Test;
import base.WeightRepositoryMemory;
import base.WeightRepository;

public class WeightRepositoryMemoryTest {

	@Test
	public void saveTest() {
		WeightRepository weight = new WeightRepositoryMemory();
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		assert(weight.save(testing)!=null);
	}
	
	@Test
	public void Test() {
		WeightRepository weight = new WeightRepositoryMemory();
		WeightController controller = new WeightController(new WeightRepositoryMemory());
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		assert(weight.save(testing)!=null);
		Weight saving = controller.create(testing);
		assert(controller.find(saving.getId()) != null);
		assert(weight.deleteWeight(saving.getId()) == null);	
	}
	
}
