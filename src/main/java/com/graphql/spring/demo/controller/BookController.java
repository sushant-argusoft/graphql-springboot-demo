package com.graphql.spring.demo.controller;

import com.graphql.spring.demo.entities.Book;
import com.graphql.spring.demo.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller

public class BookController {


    @Autowired
    private BookService bookService;

    //create
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(b.getAuthor());

        return this.bookService.create(b);
    }

    //get all
    @QueryMapping("allBooks")

    public List<Book> getAll(){

        return this.bookService.getAll();
    }


   @QueryMapping("getBook")
    public Book get(@Argument int bookId){

        return this.bookService.get(bookId);

    }




}
@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private double price;

    private String author;
}
