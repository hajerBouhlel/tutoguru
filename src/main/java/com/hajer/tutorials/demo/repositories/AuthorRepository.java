package com.hajer.tutorials.demo.repositories;

import com.hajer.tutorials.demo.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
