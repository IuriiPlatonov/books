package com.example.books.services;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {

    private JdbcTemplate jdbcTemplate;

    public List<Author> getAuthors() {
        return new ArrayList<>(jdbcTemplate.query("SELECT * FROM authors", (ResultSet rs, int rowNum) -> {
            Author author = new Author(
                    rs.getInt("id"),
                    rs.getString("name")
            );
            return author;
        }));
    }
}
