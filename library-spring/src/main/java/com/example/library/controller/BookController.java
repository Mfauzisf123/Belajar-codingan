package com.example.library.controller;

import com.example.library.entity.Book;
import com.example.library.repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookRepository bookRepo;

    public BookController(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    // Menampilkan daftar buku
    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepo.findAll());
        return "book-list"; // Mengarah ke templates/book-list.html
    }

    // Menambahkan buku lewat form HTML
    @PostMapping("/add")
    public String addBook(@RequestParam String title,
                          @RequestParam String author,
                          @RequestParam int year) {
        Book book = new Book();
        book.setTitle(title);
        book.setAuthor(author);
        book.setYear(year);

        bookRepo.save(book);
        return "redirect:/books"; // Redirect kembali ke halaman daftar
    }
}
