package com.example.books.controllers;

import com.example.books.services.Author;
import com.example.books.services.AuthorService;
import com.example.books.services.Book;
import com.example.books.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class GeneralController {

    private final BookService bookService;
    private final AuthorService authorService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }
}
