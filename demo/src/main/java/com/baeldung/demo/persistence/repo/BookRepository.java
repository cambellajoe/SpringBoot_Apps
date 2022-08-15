package com.baeldung.demo.persistence.repo;

import org.springframework.data.repository.CrudRepository;
import com.baeldung.demo.persistence.model.Book;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}