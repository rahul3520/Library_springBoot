package com.example.LibraryApp_backend.dao;

import com.example.LibraryApp_backend.model.Library;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Library,Integer> {


}
