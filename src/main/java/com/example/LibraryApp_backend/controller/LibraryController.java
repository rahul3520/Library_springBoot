package com.example.LibraryApp_backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {


    @PostMapping("/booksEntry")
    public String booksEntry()
    {
        return "books entry page";
    }

    @PostMapping("/booksIssue")
    public String booksIssue()
    {
        return "books issue page";
    }

    @PostMapping("/bookDelete")
    public String bookDelete()
    {
        return "book delete page";
    }

    @PostMapping("/bookSearch")
    public String bookSearch()
    {
        return "book search page";
    }

    @PostMapping("/editBook")
    public String editBook()
    {
        return "edit book page";
    }

    @GetMapping("/viewBooks")
    public String viewBooks()
    {
        return "view books page";
    }


}
