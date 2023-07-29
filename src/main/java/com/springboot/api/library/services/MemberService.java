package com.springboot.api.library.services;

import com.springboot.api.library.entity.Book;
import com.springboot.api.library.entity.Loan;

import java.util.List;
import java.util.Optional;

public interface MemberService {
    List<Member> findByAll();
    Optional<Loan> findById(Long id);
    Book save(Loan loan);
    void delete(Long id);
}
