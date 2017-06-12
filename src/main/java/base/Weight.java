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
	private String height;
	private String age;
	//
	private float calori;
	
	public Weight (){};
	
	public Weight(String weddingName, String userNmae , String age,String currentWeight, String finalWeight, String height, String finalDate
			, float calori) {
		this.currentWeight = currentWeight;
		this.finalWeight = finalWeight;
		this.finalDate = finalDate;
		this.weddingName = weddingName;
		this.userName = userNmae;
		this.height = height;
		this.age = age;
		//
		this.calori = calori;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
	    this.age = age;
	  }
	
	public String getHeight() {
		return height;
	}
	
	public void setHeight(String height) {
	    this.height = height;
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
	  public float getCalori() {
			CaloriAllowance cAllow = new CaloriAllowance();
			calori = cAllow.calculate(currentWeight, height, age);
			return calori;
	  }
	  public void setCalori(float calori, String currentWeight, String height, String age) {	
			this.calori = calori;
	  }
		
	  
}
