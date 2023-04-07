package com.graphql.spring.demo.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "project_books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book {


   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private double price;
    private int pages;
    private String author;
}
