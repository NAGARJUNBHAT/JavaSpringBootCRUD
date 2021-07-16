package com.example.crud.repository;

import com.example.crud.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
