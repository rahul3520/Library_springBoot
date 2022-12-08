package com.example.LibraryApp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "books")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String bookName;

    private String author;

    private String publisherName;

    private String genre;

    private int totalPages;

    private int price;

    private int yearOfPublish;

    public Library() {
    }

    public Library(int id, String bookName, String author, String publisherName, String genre, int totalPages, int price, int yearOfPublish) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.publisherName = publisherName;
        this.genre = genre;
        this.totalPages = totalPages;
        this.price = price;
        this.yearOfPublish = yearOfPublish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYearOfPublish() {
        return yearOfPublish;
    }

    public void setYearOfPublish(int yearOfPublish) {
        this.yearOfPublish = yearOfPublish;
    }
}
