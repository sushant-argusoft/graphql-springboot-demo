package com.graphql.spring.demo.repositories;

import com.graphql.spring.demo.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRep extends JpaRepository<Book,Integer> {




}
