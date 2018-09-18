package com.fm.librarymangementsystem.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fm.librarymangementsystem.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{
	public Book findByName(String name);
	public Book findByISBN(String ISBN);

}