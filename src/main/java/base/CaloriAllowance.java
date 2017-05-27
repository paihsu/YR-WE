package base;

import java.util.Date;
import java.util.GregorianCalendar;

import base.Weight;

public class CaloriAllowance {
	
	    /** The date at the end of the last century */
		Weight weight = new Weight();
	    Date d1 = weight.getfinalDate();

	    /** Today's date */
	    Date today = new Date();

	    // Get msec from each, and subtract.
	    long diff = today.getTime() - d1.getTime();
	    long daysLast = diff / (1000 * 60 * 60 * 24);
	    
	    // 
	  
}
