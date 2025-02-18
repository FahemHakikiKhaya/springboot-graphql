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
public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
        new Author(1,"fahem"),
        new Author(2,"yanto")
    );

     public static Optional<Author> getAuthorById(Integer id) {
        return authors.stream().filter(b -> b.id.equals((id))).findFirst();
    };
}