package base;

import org.junit.Test;

import base.WeightRepository;

public class ApplicationTest {

	@Test
	public void testWeightRepository() {
		 Application context = new Application();
		 assert(context.weightRepository() instanceof WeightRepositoryMemory);	
	}
	
}
