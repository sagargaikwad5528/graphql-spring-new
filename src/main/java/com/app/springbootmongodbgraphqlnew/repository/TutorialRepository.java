package com.app.springbootmongodbgraphqlnew.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.springbootmongodbgraphqlnew.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
}