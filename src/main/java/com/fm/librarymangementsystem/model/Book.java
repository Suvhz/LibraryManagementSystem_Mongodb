package com.fm.librarymangementsystem.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Book {
	@Id
	private int id;
	private String name,location, ISBN, description, publisher, author;
	private int quantity;

	
	public Book() {
		super();
	}
	public Book( String bookName, String iSBN, String description, String publisher, String author,
			int quantity, String location) {
		this.name = bookName;
		ISBN = iSBN;
		this.description = description;
		this.publisher = publisher;
		this.author = author;
		this.quantity = quantity;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getBookName() {
		return name;
	}
	public void setBookName(String bookName) {
		this.name = bookName;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + name + ", ISBN=" + ISBN + ", description=" + description
				+ ", publisher=" + publisher + ", author=" + author + ", quantity=" + quantity + ", location="
				+ location + "]";
	}

}
