package com.example.LibraryApp_backend.controller;


import com.example.LibraryApp_backend.dao.BookDao;
import com.example.LibraryApp_backend.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private BookDao bdao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/booksEntry",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> booksEntry(@RequestBody Library l)
    {
        System.out.println(l.getBookName().toString());
        System.out.println(l.getAuthor().toString());
        System.out.println(l.getPublisherName().toString());
        System.out.println(l.getGenre().toString());
        System.out.println(l.getTotalPages());
        System.out.println(l.getPrice());
        System.out.println(l.getYearOfPublish());

        bdao.save(l);

        HashMap<String,String> map=new HashMap<>();

        map.put("status","success");

        return map;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewBooks")
    public List<Library> viewBooks()
    {
        return(List<Library>) bdao.findAll();
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



}
