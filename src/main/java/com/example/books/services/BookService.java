package com.example.books.services;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private JdbcTemplate jdbcTemplate;

    public List<Book> getBooks() {
        return new ArrayList<>(jdbcTemplate.query("SELECT * FROM books", (ResultSet rs, int rowNum) -> {
            Book book = new Book(
                    rs.getInt("id"),
                    rs.getString("author"),
                    rs.getString("title"),
                    rs.getString("priceOld"),
                    rs.getString("price")
            );
            return book;
        }));
    }
}
