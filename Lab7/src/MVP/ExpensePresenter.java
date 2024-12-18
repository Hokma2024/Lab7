package MVP;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class ExpensePresenter
{
    private final List<Expense> expenses;
    private final ExpenseView view;

    public ExpensePresenter(ExpenseView view)
    {
        this.view = view;
        this.expenses = new ArrayList<>();
    }

    public void addExpense(double amount, String category, Date date)
    {
        if (amount <= 0) {
            throw new IllegalArgumentException("Сумма расхода должна быть положительной!");
        }
        Expense newExpense = new Expense(amount, category, date);
        expenses.add(newExpense);
    }

    public void displayTotalExpense()
    {
        double total = 0;
        for (Expense expense : expenses)
        {
            total += expense.getAmount();
        }
        view.displayTotalExpense(total);
    }

    public void displayExpensesByCategory()
    {
        HashMap<String, Double> categoryTotals = new HashMap<>();

        for (Expense expense : expenses)
        {
            categoryTotals.put(
                    expense.getCategory(),
                    categoryTotals.getOrDefault(expense.getCategory(), 0.0) + expense.getAmount()
            );
        }

        view.displayExpensesByCategory(categoryTotals);
    }
}
