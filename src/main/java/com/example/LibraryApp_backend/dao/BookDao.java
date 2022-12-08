package com.example.LibraryApp_backend.dao;

import com.example.LibraryApp_backend.model.Library;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BookDao extends CrudRepository<Library,Integer> {

    @Query(value = "SELECT `id`, `author`, `book_name`, `genre`, `price`, `publisher_name`, `total_pages`, `year_of_publish` FROM `books` WHERE `book_name` LIKE %:bookName%",nativeQuery = true)
    List<Library> BookSearch(@Param("bookName") String bookName );

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `books` WHERE `book_name`=:bookName",nativeQuery = true)
    void BookDelete(@Param("bookName") String bookName);

    @Query(value = "SELECT `id`, `author`, `book_name`, `genre`, `price`, `publisher_name`, `total_pages`, `year_of_publish` FROM `books` WHERE `book_name` =:bookName",nativeQuery = true)
    List<Library> BookIssue(@Param("bookName") String bookName );

}
