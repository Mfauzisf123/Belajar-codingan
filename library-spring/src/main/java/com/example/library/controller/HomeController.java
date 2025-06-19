package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import java.util.List;
import com.example.library.entity.Book;
import com.example.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import com.example.library.repository.BookRepository;

@Controller
public class HomeController {
    @Autowired
    private BookService bookService;

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/")
    public String index(Model model) {
        //Get all books
        List<Book> books = bookRepository.findAll();

        //Pass books to view
        model.addAttribute("books", books);
        return "index";
    }
}
