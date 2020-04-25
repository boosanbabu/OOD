package com.boo.ood.billsplitter.models.split;

import com.boo.ood.billsplitter.models.User;

public class Split {

	private User user;
	protected double amount;

	public Split(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
