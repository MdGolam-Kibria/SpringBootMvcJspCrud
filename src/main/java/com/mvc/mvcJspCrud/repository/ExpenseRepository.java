package com.mvc.mvcJspCrud.repository;

import com.mvc.mvcJspCrud.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
    Optional<Expense> findByIdAndIsActiveTrue(Long id);

    List<Expense> findAllByIsActiveTrue();

    Integer deleteByIdAndIsActiveTrue(Long id);
}
