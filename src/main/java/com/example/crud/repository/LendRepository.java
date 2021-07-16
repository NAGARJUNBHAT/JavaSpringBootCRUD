package com.example.crud.repository;

import com.example.crud.model.Book;
import com.example.crud.model.Lend;
import com.example.crud.model.LendStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface LendRepository extends MongoRepository<Lend, String> {
    Optional<Lend> findByBookAndStatus(Book book, LendStatus status);
}
