package com.springboot.api.library.services;

import com.springboot.api.library.entity.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> findByAll();
    Optional<Book> findById(Long id);
    Book save(Book book);
    void delete(Long id);




}
