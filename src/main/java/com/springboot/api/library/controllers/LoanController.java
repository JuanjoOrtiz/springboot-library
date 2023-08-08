package com.springboot.api.library.controllers;


import com.springboot.api.library.entity.Loan;

import com.springboot.api.library.entity.Member;
import com.springboot.api.library.services.LoanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

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

    @PostMapping("/loan")
    public ResponseEntity<?> save(@Valid @RequestBody Loan loan) {

        return ResponseEntity.status(HttpStatus.CREATED).body(loanService.save(loan));

    }




    @DeleteMapping("/loan/{id}")
    public void delete(@PathVariable Long id){
        loanService.delete(id);
    }


}
