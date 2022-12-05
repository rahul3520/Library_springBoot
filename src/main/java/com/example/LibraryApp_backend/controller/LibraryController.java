package com.example.LibraryApp_backend.controller;


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


}
