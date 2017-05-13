package base;

import java.util.Date;
import java.io.Serializable;

public class Weight implements Serializable{
	
	private float currentWeight;
	private Date date;
	private Long id;
	
	public Weight (){};
	
	public Weight(float currentWeight, Date date) {
		this.currentWeight = currentWeight;
		this.date = date;
		
	}
	
	public float getCurrentWeight() {
	    return currentWeight;
	  }
	  
	  public void setCurrentWeight(float currentWeight) {  
	    this.currentWeight = currentWeight;
	    date = new Date();
	    
	  }
	  public Date getDate() {
	    return date;
	  }
	  
	  public void setDate(Date date) {
		    this.date = date;
	  }
	  
	  public Long getId() {
		    return id;
	  }
		  
	  public void setId(Long id) {
		    this.id = id;
	  }
	  
}
