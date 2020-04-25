package com.boo.ood.billsplitter.models.split;

import com.boo.ood.billsplitter.models.User;

public class PercentageSplit extends Split {
	private double percentage;

	public PercentageSplit(User user, double percentage) {
		super(user);
		this.setPercentage(percentage);
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}
