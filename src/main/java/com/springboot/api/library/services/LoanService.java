package com.springboot.api.library.services;

import com.springboot.api.library.entity.Loan;

import java.util.List;
import java.util.Optional;

public interface LoanService {
    List<Loan> findByAll();
    Optional<Loan> findById(Long id);
    Loan save(Loan loan);
    void delete(Long id);
}
