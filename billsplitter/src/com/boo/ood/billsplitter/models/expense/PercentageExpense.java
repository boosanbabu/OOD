package com.boo.ood.billsplitter.models.expense;

import java.util.List;

import com.boo.ood.billsplitter.models.User;
import com.boo.ood.billsplitter.models.split.PercentageSplit;
import com.boo.ood.billsplitter.models.split.Split;

public class PercentageExpense extends Expense {

	public PercentageExpense(User user, List<Split> splitWith, double amount) {
		super(user, splitWith, amount);
	}

	@Override
	public boolean isValidExpense() {
		double totalPercentage = 100;
		for (Split split : getSplits()) {
			if (!(split instanceof PercentageSplit)) {
				return false;
			}
			totalPercentage -= ((PercentageSplit) split).getPercentage();
		}
		if (totalPercentage != 0) {
			return false;
		}
		return true;
	}

}
