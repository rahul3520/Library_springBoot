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

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/bookSearch",produces = "application/json",consumes = "application/json")
    public List<Library> bookSearch(@RequestBody Library l)
    {
        String bname=String.valueOf(l.getBookName());
        System.out.println(bname);

        return(List<Library>) bdao.BookSearch(l.getBookName());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/bookDelete",produces = "application/json",consumes = "application/json")
    public HashMap<String,String> bookDelete(@RequestBody Library l)
    {
        String bname=String.valueOf(l.getBookName());
        System.out.println(bname);

        bdao.BookDelete(l.getBookName());

        HashMap<String,String> map=new HashMap<>();

        map.put("status","success");

        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/booksIssue",produces = "application/json",consumes = "application/json")
    public List<Library> booksIssue(@RequestBody Library l)
    {
        String bname=String.valueOf(l.getBookName());
        System.out.println(bname);

        return(List<Library>) bdao.BookIssue(l.getBookName());

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/editBook")
    public String editBook()
    {
        return "edit book page";
    }



}
