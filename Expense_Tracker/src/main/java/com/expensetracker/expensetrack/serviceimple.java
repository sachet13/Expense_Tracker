package com.expensetracker.expensetrack;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class serviceimple implements serviceex{
    repositoryex repoex;
    public serviceimple(repositoryex repoex){
        this.repoex=repoex;
    }

    @Override
    public String createExpense(expensetracker exdata) {
        repoex.save(exdata);
        return "New Expense Added Successfully";
    }

    @Override
    public String updateExpense(expensetracker exdata) {
        repoex.save(exdata);
        return "Expense Updated Successfully";
    }

    @Override
    public String deleteExpense(String exname) {
        repoex.deleteById(exname);
        return "Expense Deleted Successfully";
    }

    @Override
    public Optional<expensetracker> getExpenseData(String exname) {
        return repoex.findById(exname);
    }

    @Override
    public List<expensetracker> getAllExpenseData() {
        return repoex.findAll();
    }
    
}
