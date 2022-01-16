package com.example.books.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DefaultController {

    @GetMapping("index")
    public String mainPage() {
        return "index";
    }

    @GetMapping("genres/index")
    public String genresPage() {
        return "genres/index";
    }

    @GetMapping("books/popular")
    public String popularPage() {
        return "books/popular";
    }

    @GetMapping("books/recent")
    public String recentPage() {
        return "books/recent";
    }

    @GetMapping("authors/index")
    public String authorsPage() {
        return "authors/index";
    }

    @GetMapping("authors/slug")
    public String slugPage() {
        return "authors/slug";
    }

    @GetMapping("signIn")
    public String signInPage() {
        return "signIn";
    }

    @GetMapping("signup")
    public String signupPage() {
        return "signup";
    }
}
