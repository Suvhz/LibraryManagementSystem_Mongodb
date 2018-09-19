package com.fm.librarymangementsystem.serviceDAOImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fm.librarymangementsystem.model.Book;
import com.fm.librarymangementsystem.repository.BookRepository;
import com.fm.librarymangementsystem.serviceDAO.serviceDAO;

@Service
public class BookService implements serviceDAO{
	@Autowired
	private BookRepository bookRepository;
	
	public Book create(Book book) {
		return bookRepository.save(new Book(book.getBookName(),book.getISBN(), book.getDescription(),book.getPublisher(),book.getAuthor(), book.getQuantity(),book.getLocation()));
	}
	public List<Book> getAll(){
		return bookRepository.findAll();
	}
	public Book getByBookName(String bookName) {
		return bookRepository.findByName(bookName);
	}
	public Book update(Book book ) {
		Book books = bookRepository.findByISBN(book.getISBN());
		books.setBookName(book.getBookName());
		books.setAuthor(book.getAuthor());
		books.setDescription(book.getDescription());
		books.setLocation(book.getLocation());
		books.setQuantity(book.getQuantity());
		books.setISBN(book.getISBN());
		books.setPublisher(book.getPublisher());
		return bookRepository.save(books);
		
	}
	public void deleteAll() {
		bookRepository.deleteAll();
	}
	public void delete(String ISBN) {
		Book book = bookRepository.findByISBN(ISBN);
		bookRepository.delete(book);
	}
}

