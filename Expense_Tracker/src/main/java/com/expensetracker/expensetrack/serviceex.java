package com.expensetracker.expensetrack;
import java.util.List;
import java.util.Optional;


public interface serviceex {
    public String createExpense(expensetracker exdata);
    public String updateExpense(expensetracker exdata);
    public String deleteExpense(String exname);
    public Optional<expensetracker> getExpenseData(String exname);
    public List<expensetracker> getAllExpenseData();
}
