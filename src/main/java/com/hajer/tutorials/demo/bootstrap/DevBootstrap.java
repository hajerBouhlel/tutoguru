package com.hajer.tutorials.demo.bootstrap;

import com.hajer.tutorials.demo.model.Author;
import com.hajer.tutorials.demo.model.Book;
import com.hajer.tutorials.demo.model.Publisher;
import com.hajer.tutorials.demo.repositories.AuthorRepository;
import com.hajer.tutorials.demo.repositories.BookRepository;
import com.hajer.tutorials.demo.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
   private AuthorRepository authorRepository;
   private BookRepository bookRepository;
   private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        InitData();

    }
    private void InitData(){
        Publisher publisher=new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);
        //Eric
        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234",publisher);
        eric.getBooks().add(ddd);
        authorRepository.save(eric);
        bookRepository.save(ddd);
        //Rod
        Author rod=new Author("rod","johnson");
        Book noEJB=new Book("JEE Development without EJB","23444",publisher);
        rod.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
