package MVP;

import java.util.HashMap;

public class ConsoleExpenseView implements ExpenseView
{
    @Override
    public void displayTotalExpense(double total)
    {
        System.out.println("Общий расход: " + total + " рублей");
    }

    @Override
    public void displayExpensesByCategory(HashMap<String, Double> categoryTotals)
    {
        System.out.println("Расходы по категориям:");
        for (String category : categoryTotals.keySet())
        {
            System.out.println("- " + category + ": " + categoryTotals.get(category) + " рублей");
        }
    }
}
