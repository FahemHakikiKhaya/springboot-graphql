/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.amigoscode;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author hakik
 */
@Controller
public class AuthorController {

    @QueryMapping
    public List<Author> authors() {
        return Author.authors;
    };

    @SchemaMapping
    public List<Book> books(Author author) {
        return Book.getBooksByAuthorId(author.id());
    };
}
