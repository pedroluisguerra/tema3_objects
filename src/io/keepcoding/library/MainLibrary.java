package io.keepcoding.library;

import java.util.ArrayList;

import io.keepcoding.library.model.*;

public class MainLibrary {
	private ArrayList<Book> bookList;
	
	public MainLibrary() {
		this.bookList = getBookList();
	}
	
	 
	
	public static void main(String [] args) {
		Person p = new Person(
				"Pedro", 39, "C/Java desde 0, 9");
			p.showInfo();	
			
		MainLibrary librery = new MainLibrary();
		System.out.println("This is the books list" + librery);
	}
	
	public static ArrayList<Book> getBookList(){
		ArrayList<Book> booksListed = new ArrayList<>();
				
		booksListed.add(new Book("Cien años de soledad", "Gabriel García Márquez", "978-0060883287"));
		booksListed.add(new Book("1984", "George Orwell", "978-0451524935"));
		booksListed.add(new Book("El Alquimista", "Paulo Coelho", "978-0062315009"));
		
		return booksListed;
		
	}

}

