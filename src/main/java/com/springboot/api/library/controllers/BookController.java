package com.springboot.api.library.controllers;

import com.springboot.api.library.entity.Book;

import com.springboot.api.library.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/book")
    List<Book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/book/{id}")
    public Optional<Book> findById(@PathVariable Long id){
        return  bookService.findById(id);
    }

    @PostMapping("/book")
    public ResponseEntity<?> save(@Valid @RequestBody Book book) {

        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));

    }

    @DeleteMapping("/book/{id}")
     void delete(@PathVariable Long id){
        bookService.delete(id);
    }




}
