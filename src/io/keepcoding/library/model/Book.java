package io.keepcoding.library.model;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private int stock;
	
	public Book(String title, String author, String isbn, int stock){
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.stock = stock;		
	}
	
	public Book(String title, String author, String isbn) {
		this(title, author, isbn, 0);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
