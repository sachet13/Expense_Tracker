package com.expensetracker.expensetrack;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/expensetracker")
public class controllerex {
    serviceex serex;
    public controllerex(serviceex serex){
        this.serex=serex;
    }

    expensetracker exptra;

    @GetMapping("/{exname}")
    public Optional<expensetracker> getExpenseData(@PathVariable String exname){
        return serex.getExpenseData(exname);
    }
    
    @GetMapping()
    public List<expensetracker> getAllExpenseData(){
        return serex.getAllExpenseData();
    }

    @PostMapping
    public String postExpense(@RequestBody expensetracker expex){
        serex.createExpense(expex);
        return "New Expense Added Successfully";
    }

    @PutMapping
    public String putExpense(@RequestBody expensetracker expex){
        serex.updateExpense(expex);
        return "Expense Updated Successfully";
    }

    @DeleteMapping("/{exname}")
    public String deleteExpense(@PathVariable String exname){
        serex.deleteExpense(exname);
        return "Expense Deleted Successfully";
    }
}
