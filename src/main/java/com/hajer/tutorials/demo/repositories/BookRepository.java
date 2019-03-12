package com.hajer.tutorials.demo.repositories;

import com.hajer.tutorials.demo.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
