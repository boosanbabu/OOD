package com.boo.ood.billsplitter.models.expense;

import java.util.List;

import com.boo.ood.billsplitter.models.User;
import com.boo.ood.billsplitter.models.split.Split;

public abstract class Expense {

	private String id;
	private User paidBy;
	private List<Split> splits;
	private double amount;

	Expense(User user, List<Split> splitWith, double amount) {
		this.amount = amount;
		this.paidBy = user;
		this.splits = splitWith;
	}

	public User getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(User paidBy) {
		this.paidBy = paidBy;
	}

	public List<Split> getSplits() {
		return splits;
	}

	public void setSplits(List<Split> splits) {
		this.splits = splits;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract boolean isValidExpense();
}
