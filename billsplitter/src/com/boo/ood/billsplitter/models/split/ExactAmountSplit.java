package com.boo.ood.billsplitter.models.split;

import com.boo.ood.billsplitter.models.User;

public class ExactAmountSplit extends Split {
	public ExactAmountSplit(User user, double amount) {
		super(user);
		this.amount = amount;
	}
}
