package com.sanket.SpringApp.controller;


import com.sanket.SpringApp.repos.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookRepo bookRepo;

    public BookController(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books   ", bookRepo.findAll());
        return "books/list";
    }
}
