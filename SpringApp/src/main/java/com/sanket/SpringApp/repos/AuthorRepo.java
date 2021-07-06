package com.sanket.SpringApp.repos;

import com.sanket.SpringApp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepo extends CrudRepository<Author, Long> {
}
