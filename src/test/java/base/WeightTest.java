package base;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class WeightTest {

	 @Test
	  public void weightInput() {
		 //String weddingName, String userNmae , String age, String currentWeight, 
		 //String finalWeight, String height, String finalDate, float calori
		 Weight weight = new Weight("Testing Wedding Name", "Zoey", "33", "100", "90", "50",
				 "10,10,2000", 2000);
		 assert(weight.getWeddingName().equals("Testing Wedding Name"));
		 assert(weight.getUserName().equals("Zoey"));
		 assert(weight.getCurrentWeight().equals("100"));
		 assert(weight.getAge().equals("33"));
		 assert(weight.getFinalWeight().equals("90"));
		 assert(weight.getHeight().equals("50"));
		 assert(weight.getfinalDate().equals("10,10,2000"));
	 }
}
