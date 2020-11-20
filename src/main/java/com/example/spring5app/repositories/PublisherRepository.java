package com.example.spring5app.repositories;

import com.example.spring5app.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jt on 12/23/19.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
