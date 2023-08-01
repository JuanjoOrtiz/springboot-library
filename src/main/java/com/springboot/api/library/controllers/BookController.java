package com.springboot.api.library.controllers;

import com.springboot.api.library.entity.Book;
import com.springboot.api.library.services.BookService;
import com.springboot.api.library.services.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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



    @DeleteMapping("/book/{id}")
     void delete(@PathVariable Long id){
        bookService.delete(id);
    }




}
