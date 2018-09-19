package com.fm.librarymangementsystem.serviceDAO;

import java.util.List;

import com.fm.librarymangementsystem.model.Book;

public interface serviceDAO {
	public Book create(Book book);
	public List<Book> getAll();
	public Book getByBookName(String bookName);
	public Book update(Book book);
	public void deleteAll();
	public void delete(String ISBN);
}
