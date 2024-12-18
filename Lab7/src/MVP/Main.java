package MVP;
import java.util.Date;
/*
Учёт расходов:
Модель Expense с полями amount, category, date. View отображает общий расход и категории, а Presenter управляет добавлением расходов.
*/
public class Main
{
    public static void main(String[] args)
    {
        ExpenseView view = new ConsoleExpenseView();

        ExpensePresenter presenter = new ExpensePresenter(view);

        presenter.addExpense(500.0, "Продукты", new Date());
        presenter.addExpense(1000.0, "Развлечения", new Date());
        presenter.addExpense(300.0, "Транспорт", new Date());
        presenter.addExpense(200.0, "Продукты", new Date());

        presenter.displayTotalExpense();

        presenter.displayExpensesByCategory();
    }
}

