package com.sanket.SpringApp.bootstrap;

import com.sanket.SpringApp.model.Author;
import com.sanket.SpringApp.model.Book;
import com.sanket.SpringApp.repos.AuthorRepo;
import com.sanket.SpringApp.repos.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component // detect this as a spring component
public class BootStrapData implements CommandLineRunner {

    //di
    private final AuthorRepo authorRepo;
    private final BookRepo bookRepo;

    public BootStrapData(AuthorRepo authorRepo, BookRepo bookRepo) {
        this.authorRepo = authorRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public void run(String... args) throws Exception {

        Author abc = new Author("ABC", "DEF");
        Book book = new Book("Book1", "123");

        abc.getBooks().add(book);
        book.getAuthorSet().add(abc);
        authorRepo.save(abc);
        bookRepo.save(book);

        System.out.println("bookRepo.count() = " + bookRepo.count());

    }
}
