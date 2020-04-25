package com.boo.ood.billsplitter;

import java.util.List;

import com.boo.ood.billsplitter.enums.ExpenseType;
import com.boo.ood.billsplitter.models.User;
import com.boo.ood.billsplitter.models.expense.EqualExpense;
import com.boo.ood.billsplitter.models.expense.ExactExpense;
import com.boo.ood.billsplitter.models.expense.Expense;
import com.boo.ood.billsplitter.models.expense.PercentageExpense;
import com.boo.ood.billsplitter.models.split.Split;

public class ExpenseFactory {

	public Expense createExpense(ExpenseType expenseType, double amount, User paidBy, List<Split> splits) {
		switch (expenseType) {
		case EQUAL:
			return new EqualExpense(paidBy, splits, amount);
		case EXACT:
			return new ExactExpense(paidBy, splits, amount);
		case PERCENTAGE:
			return new PercentageExpense(paidBy, splits, amount);
		}
		return null;
	}
}
