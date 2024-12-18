package MVP;

import java.util.HashMap;

public interface ExpenseView
{
    void displayTotalExpense(double total);
    void displayExpensesByCategory(HashMap<String, Double> categoryTotals);
}
