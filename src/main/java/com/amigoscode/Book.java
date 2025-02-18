/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author hakik
 */
public record Book(Integer id, String name, Integer pageCount,Integer authorId) {

 
    public static List<Book> books = Arrays.asList(
        new Book(1,"quran",604,1),
        new Book(2,"yarob",605,2),        
        new Book(3,"testing",606,1)
    );

    public static Optional<Book> getBookById(Integer id) {
        return books.stream().filter(b -> b.id.equals((id))).findFirst();
    }

    public static List<Book> getBooksByAuthorId(Integer authorId) {
        return books.stream().filter(b -> b.authorId.equals(authorId)).toList();
    }

}
