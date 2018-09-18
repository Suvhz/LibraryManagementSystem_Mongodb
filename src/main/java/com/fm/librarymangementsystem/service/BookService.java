package com.fm.librarymangementsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.librarymangementsystem.model.Book;
import com.fm.librarymangementsystem.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public Book create(String name, String location, String ISBN, String publisher, String author, String description, int quantity) {
		return bookRepository.save(new Book(name, ISBN, description,publisher,author, quantity,location));
	}
	public List<Book> getAll(){
		return bookRepository.findAll();
	}
	public Book getByBookName(String bookName) {
		return bookRepository.findByName(bookName);
	}
	public Book update(String name, String location, String ISBN, String publisher, String author, String description, int quantity ) {
		Book book = bookRepository.findByISBN(ISBN);
		book.setBookName(name);
		book.setAuthor(author);
		book.setDescription(description);
		book.setLocation(location);
		book.setQuantity(quantity);
		book.setISBN(ISBN);
		book.setPublisher(publisher);
		return bookRepository.save(book);
		
	}
	public void deleteAll() {
		bookRepository.deleteAll();
	}
	public void delete(String ISBN) {
		Book book = bookRepository.findByISBN(ISBN);
		bookRepository.delete(book);
	}
}

