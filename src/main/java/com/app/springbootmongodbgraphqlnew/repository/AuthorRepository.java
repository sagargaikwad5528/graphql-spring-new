package com.app.springbootmongodbgraphqlnew.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.springbootmongodbgraphqlnew.model.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {
}
