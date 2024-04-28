import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {

    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>();
    }

    double saveExpense(double moneyBeforeSalary, double expense, String category) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            expensesByCategories.get(category).add(expense);
        } else {
            ArrayList<Double> newCategoryExpenses = new ArrayList<>();
            newCategoryExpenses.add(expense);
            expensesByCategories.put(category, newCategoryExpenses);
            if (moneyBeforeSalary < 1000) {
                System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
            }
        }
        return moneyBeforeSalary;
    }


    void printAllExpensesByCategories() {
        for (String category : expensesByCategories.keySet()) {
            System.out.println(category);
            ArrayList<Double> expenses = expensesByCategories.get(category);
            for (Double expense : expenses) {
                System.out.println(expense);
            }
        }
    }

    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        if (!expensesByCategories.containsKey(category)) {
            System.out.println("Такой категории пока нет.");
        } else {
            ArrayList<Double> expensesInCategory = expensesByCategories.get(category);
            for (Double expense : expensesInCategory) {
                if (expense > maxExpense) {
                    maxExpense = expense;
                }
            }
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // таблица называется иначе
        System.out.println("Траты удалены.");
    }
}