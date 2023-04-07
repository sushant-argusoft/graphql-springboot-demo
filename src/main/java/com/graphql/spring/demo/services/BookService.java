package com.graphql.spring.demo.services;

import com.graphql.spring.demo.entities.Book;

import java.util.List;

public interface BookService {
    //create
    Book create(Book book);
    //get all

    List<Book> getAll();

    //get single book
    Book get(int bookId);

}
