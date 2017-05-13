package base;

import java.util.Date;

public class Weight {
	
	private float currentWeight;
	private Date date;
	private Long id;
	
	
	public Weight(float currentWeight, Date date) {
		this.currentWeight = currentWeight;
		this.date = date;
	}
	
	public Weight() {}
	
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
	  
	  public Long getId() {
		    return id;
	  }
		  
	  public void setId(Long id) {
		    this.id = id;
	  }
	  
}
