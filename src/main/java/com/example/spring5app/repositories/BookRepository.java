package com.example.spring5app.repositories;

import com.example.spring5app.domain.Book;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface BookRepository extends CrudRepository<Book, Long> {
}
