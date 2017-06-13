package base;

import org.junit.Test;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import base.WeightRepositoryMemory;

public class WeightControllerTest {
	
	
	@Test
	public void baseTest() {
		WeightController controller = new WeightController(new WeightRepositoryMemory());
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		Weight testweight = controller.update(1L, testing);
		assert(testing.getUserName() != null);
		assert(testing.getAge()!= null);
		assert(testing.getFinalWeight()!= null);
		assert(testing.getHeight()!= null);
	}
	
	@Test
	public void testDelete() {
		WeightController controller = new WeightController(new WeightRepositoryMemory());
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		Weight saving = controller.create(testing);
		assert(controller.find(saving.getId()) != null);
		controller.delete(saving.getId());
		assert(controller.find(saving.getId()) == null);
	}
	
	@Test
	public void testUpdate() {
		WeightController controller = new WeightController(new WeightRepositoryMemory());
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		Weight saving = controller.create(testing);
		Weight testWeight = controller.find(saving.getId());
		Weight updateWeight = controller.update(1L, testing);
		assert(saving.getId() != null);
		assert(testing.getUserName().equals(testWeight.getUserName()));
		assert(testing.getAge().equals(testWeight.getAge()));
		assert(testing.getFinalWeight().equals(testWeight.getFinalWeight()));
		assert(testing.getHeight().equals(testWeight.getHeight()));
	}
	
	@Test
	public void testFind() {
		WeightController controller = new WeightController(new WeightRepositoryMemory());
		Weight testing = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		Weight saving = controller.create(testing);
		Weight testWeight = controller.find(saving.getId());
		assert(saving.getId() != null);
		assert(testing.getUserName().equals(testWeight.getUserName()));
	}
}
