package main.java.base;


public class Weight {
	
	private float currentWeight;
	private String date;
	
	public Weight(float currentWeight, String date) {
		this.currentWeight = currentWeight;
		this.date = date;
	}
	
	public Weight() {}
	
	public float getCurrentWeight() {
	    return currentWeight;
	  }
	  
	  public void setCurrentWeight(float currentWeight) {
	    this.currentWeight = currentWeight;
	  }
	  
	  public String getDate() {
	    return date;
	  }
	  
	  public void setDate(String date) {
	    this.date = date;
	  }
	  
}
