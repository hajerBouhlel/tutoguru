package com.hajer.tutorials.demo.repositories;

import com.hajer.tutorials.demo.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
