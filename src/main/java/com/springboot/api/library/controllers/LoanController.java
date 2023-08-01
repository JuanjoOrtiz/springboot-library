package com.springboot.api.library.controllers;

import com.springboot.api.library.entity.Book;
import com.springboot.api.library.entity.Loan;
import com.springboot.api.library.services.LoanService;
import com.springboot.api.library.services.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class LoanController {

    @Autowired
    private LoanServiceImpl loanService;

    @GetMapping("/loan")
   public List<Loan> findAll(){
        return loanService.findAll();
    }

    @GetMapping("/loan/{id}")
   public  Optional<Loan> findById(@PathVariable Long id){
        return loanService.findById(id);
    }

    @DeleteMapping("/loan/{id}")
    public void delete(@PathVariable Long id){
        loanService.delete(id);
    }


}
