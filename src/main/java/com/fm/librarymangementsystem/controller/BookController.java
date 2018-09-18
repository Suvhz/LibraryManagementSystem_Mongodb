package com.fm.librarymangementsystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.fm.librarymangementsystem.model.Book;
import com.fm.librarymangementsystem.service.BookService;


@RestController
@RequestMapping(BookController.BASE_URL)
public class BookController {
	public static final String BASE_URL="/api/V1/book";
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value="create", method=RequestMethod.POST)
	@ResponseBody
	@ResponseStatus(value=HttpStatus.CREATED)
	/*@RequestParam String name, @RequestParam String location, @RequestParam String description, @RequestParam String author, @RequestParam int quantity, @RequestParam String ISBN ,@RequestParam String publisher*/
	public String create(@RequestBody Book books) {
		Book book = bookService.create(books.getBookName(), books.getLocation(), books.getISBN(), books.getPublisher(), books.getAuthor(), books.getDescription(), books.getQuantity());
		return book.toString();
	}
	
}
