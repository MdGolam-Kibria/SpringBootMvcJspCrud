package com.mvc.mvcJspCrud.controller;

import com.mvc.mvcJspCrud.model.Expense;
import com.mvc.mvcJspCrud.service.ExpenseService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @RequestMapping("/createExpense")
    public String createExpense(Model model) {//for move create expense page
        model.addAttribute("ok", null);
        return "createxpense";
    }

    @PostMapping("/sendForCreateExpense")
    public String sendExpense(@ModelAttribute("expense") Expense expense) {
        expenseService.createExpense(expense);
        return "redirect:/";
    }

    @GetMapping("/getAllExpense")
    public String getAllExpense(Model model) {
        model.addAttribute("expenseList", expenseService.getAllExpense());
        return "ExpenseList";
    }
    @RequestMapping("/delete/{id}")
    public String deleteExpense(@PathVariable("id")Long id){
        expenseService.deleteExpense(id);
        return "redirect:/getAllExpense";
    }
}
