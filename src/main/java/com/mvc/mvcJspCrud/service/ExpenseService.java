package com.mvc.mvcJspCrud.service;

import com.mvc.mvcJspCrud.model.Expense;

import java.util.List;

public interface ExpenseService {
    Expense createExpense(Expense expense);
    Expense updateExpense(Long id,Expense expense);
    Boolean deleteExpense(Long id);
    Expense getExpense(Long id);
    List<Expense> getAllExpense();
}
