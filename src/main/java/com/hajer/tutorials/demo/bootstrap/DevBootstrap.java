package com.hajer.tutorials.demo.bootstrap;

import com.hajer.tutorials.demo.model.Author;
import com.hajer.tutorials.demo.model.Book;
import com.hajer.tutorials.demo.repositories.AuthorRepository;
import com.hajer.tutorials.demo.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
   private AuthorRepository authorRepository;
   private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        InitData();

    }
    private void InitData(){
        //Eric
        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234","Harper Collins");
        eric.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        //Rod
        Author rod=new Author("rod","johnson");
        Book noEJB=new Book("JEE Development without EJB","23444","Worx");
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
