package base;

import java.util.Date;
import java.io.Serializable;

public class Weight implements Serializable{
	
	private Long id;
	// PAi: update
	private float finalWeight;
	private Date finalDate;
	private String weddingName;
	private String userName;
	private float currentWeight;
	
	
	public Weight (){};
	
	public Weight(String weddingName, String userNmae ,float currentWeight, float finalWeight, Date finalDate) {
		this.currentWeight = currentWeight;
		this.finalWeight = finalWeight;
		this.finalDate = finalDate;
		this.weddingName = weddingName;
		this.userName = userNmae;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
	    this.userName = userName;
	  }
	
	public String getWeddingName() {
		return weddingName;
	}
	
	public void setWeddingName(String weddingName) {
	    this.weddingName = weddingName;
	  }
	
	public float getCurrentWeight() {
	    return currentWeight;
	  }
	  
	  public void setCurrentWeight(float currentWeight) {  
	    this.currentWeight = currentWeight;
	  }
	  
	  public float getFinalWeight() {
		    return finalWeight;
		  }
		  
		  public void setFinalWeight(float finalWeight) {  
		    this.finalWeight = finalWeight;
		  }
	  
	  public Date getfinalDate() {
	    return finalDate;
	  }
	  
	  public void setfinalDate(Date finalDate) {
		    this.finalDate = finalDate;
	  }
	  
	  public Long getId() {
		    return id;
	  }
		  
	  public void setId(Long id) {
		    this.id = id;
	  }
	  
}
