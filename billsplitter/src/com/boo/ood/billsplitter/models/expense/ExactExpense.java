package com.boo.ood.billsplitter.models.expense;

import java.util.List;

import com.boo.ood.billsplitter.models.User;
import com.boo.ood.billsplitter.models.split.ExactAmountSplit;
import com.boo.ood.billsplitter.models.split.PercentageSplit;
import com.boo.ood.billsplitter.models.split.Split;

public class ExactExpense extends Expense {

	public ExactExpense(User user, List<Split> splitWith, double amount) {
		super(user, splitWith, amount);
	}

	@Override
	public boolean isValidExpense() {
		double totalAmount = this.getAmount();
		for (Split split : getSplits()) {
			if (!(split instanceof ExactAmountSplit)) {
				return false;
			}
			totalAmount -= split.getAmount();
		}
		if (totalAmount != 0) {
			return false;
		}
		return true;
	}

}
