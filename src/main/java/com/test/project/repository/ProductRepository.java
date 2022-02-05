package com.test.project.repository;

import com.test.project.model.Product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String>
{
    @Query("{name:'?0'}")
    public Product find(String name);
}