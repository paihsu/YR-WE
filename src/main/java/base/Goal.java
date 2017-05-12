package base;

import java.util.*;

public class Goal {

	private String userName;
	private float goldWeight;

	public Goal(String userNmae, float goldWeight) {
		this.userName = userName;
		this.goldWeight = goldWeight;
	}

	public Goal() {
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getGoldWeight() {
		return goldWeight;
	}

	public void setGoldWeight(float goldWeight) {
		this.goldWeight = goldWeight;
	}
}
