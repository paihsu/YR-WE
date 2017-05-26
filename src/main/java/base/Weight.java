package base;

import java.util.Date;
import java.io.Serializable;

public class Weight implements Serializable{
	
	private Long id;
	private float currentWeight;
	private Date date;
	// PAi: update
	private String weddingName;
	private String userName;
	
	
	public Weight (){};
	
	public Weight(String weddingNmae ,float currentWeight, Date date, String weddingName, String userNmae) {
		this.currentWeight = currentWeight;
		this.date = date;
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
