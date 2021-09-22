package com.mvc.mvcJspCrud.service.impl;

import com.mvc.mvcJspCrud.model.Expense;
import com.mvc.mvcJspCrud.repository.ExpenseRepository;
import com.mvc.mvcJspCrud.service.ExpenseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Predicate;

@Transactional
@Service("expenseService")
public class ExpenseServiceImpl implements ExpenseService {
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
    private final ExpenseRepository expenseRepository;
    private Predicate<Expense> hasExpense = Objects::nonNull;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public Expense createExpense(Expense expense) {
        try {
            if (expense == null) return null;
            expense = expenseRepository.save(expense);
            if (!hasExpense.test(expense)) return expense;
            return null;
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            return null;
        }
    }

    @Override
    public Expense updateExpense(Long id, Expense expense) {
        return null;
    }

    @Override
    public Boolean deleteExpense(Long id) {
        try {
            Optional<Expense> expenseOptional = expenseRepository.findByIdAndIsActiveTrue(id);
            if (!expenseOptional.isPresent()) return false;
            expenseRepository.deleteByIdAndIsActiveTrue(id);
            return true;
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            return false;
        }
    }

    @Override
    public Expense getExpense(Long id) {
        return null;
    }

    @Override
    public List<Expense> getAllExpense() {
        try {
            return expenseRepository.findAllByIsActiveTrue();
        } catch (Exception e) {
            logger.error(e.getLocalizedMessage());
            return null;
        }
    }
}
