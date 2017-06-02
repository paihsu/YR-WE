package base;

import java.util.Date;
import java.io.Serializable;

public class Weight implements Serializable{
	
	private Long id;
	private String finalWeight;
	private String finalDate;
	private String weddingName;
	private String userName;
	private String currentWeight;
	
	public Weight (){};
	
	public Weight(String weddingName, String userNmae ,String currentWeight, String finalWeight, String finalDate) {
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
	
	public String getCurrentWeight() {
	    return currentWeight;
	  }
	  
	  public void setCurrentWeight(String currentWeight) {  
	    this.currentWeight = currentWeight;
	  }
	  
	  public String getFinalWeight() {
		    return finalWeight;
		  }
		  
		  public void setFinalWeight(String finalWeight) {  
		    this.finalWeight = finalWeight;
		  }
	  
	  public String getfinalDate() {
	    return finalDate;
	  }
	  
	  public void setfinalDate(String finalDate) {
		    this.finalDate = finalDate;
	  }
	  
	  public Long getId() {
		    return id;
	  }
		  
	  public void setId(Long id) {
		    this.id = id;
	  }
	  
}
