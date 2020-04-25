package com.boo.ood.billsplitter.models.expense;

import java.util.List;

import com.boo.ood.billsplitter.models.User;
import com.boo.ood.billsplitter.models.split.EqualSplit;
import com.boo.ood.billsplitter.models.split.Split;

public class EqualExpense extends Expense {

	public EqualExpense(User user, List<Split> splitWith, double amount) {
		super(user, splitWith, amount);
	}

	@Override
	public boolean isValidExpense() {
		for (Split split : getSplits()) {
			if (!(split instanceof EqualSplit)) {
				return false;
			}
		}
		return true;
	}
}
