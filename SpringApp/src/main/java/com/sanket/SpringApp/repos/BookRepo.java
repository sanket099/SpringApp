package com.sanket.SpringApp.repos;


import com.sanket.SpringApp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book, Long> {
}
