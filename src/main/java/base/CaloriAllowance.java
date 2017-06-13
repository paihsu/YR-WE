package base;

import java.util.Date;
import java.util.GregorianCalendar;
import static java.lang.System.*;
import base.Weight;

public class CaloriAllowance {
	    /** The date at the end of the last century */
		Weight weight = new Weight();
	    String d1 = weight.getfinalDate();
	    String weightInput = weight.getCurrentWeight();
	    String heightInput = weight.getHeight();
	    
	    float calculate(String currentWeight, String height, String age){
	    		float dayCalori = (float) (655 + (4.35*Float.parseFloat(currentWeight)) 
			    		+ 4.7*Float.parseFloat(height) - 4.7 * Float.parseFloat(age) - 200 );
	    		
	    	return dayCalori;
	    }
	    
       
        
}
