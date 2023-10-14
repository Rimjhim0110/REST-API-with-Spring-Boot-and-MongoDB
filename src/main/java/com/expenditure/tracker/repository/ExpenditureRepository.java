package com.expenditure.tracker.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.expenditure.tracker.model.Expenditure;

public interface ExpenditureRepository extends MongoRepository<Expenditure, String> {
    @Query("{'name': ?0}")
    Optional<Expenditure> findByName(String name);
}