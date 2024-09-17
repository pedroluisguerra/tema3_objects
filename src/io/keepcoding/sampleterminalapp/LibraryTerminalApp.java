package io.keepcoding.sampleterminalapp;

import java.util.ArrayList;
import java.util.Scanner;

import io.keepcoding.library.model.*;

public class LibraryTerminalApp {
	
	private ArrayList<Book> bookList;
	
	public static ArrayList<Book> getBookList(){
		ArrayList<Book> booksListed = new ArrayList<>();
				
		booksListed.add(new Book("Cien años de soledad", "Gabriel García Márquez", "978-0060883287"));
		booksListed.add(new Book("1984", "George Orwell", "978-0451524935"));
		booksListed.add(new Book("El Alquimista", "Paulo Coelho", "978-0062315009"));
		booksListed.add(new Book("El coronel no tiene quien le escriba", "Gabriel García Márquez", "979-0060888695"));
		
		return booksListed;
		
	}
	
	public LibraryTerminalApp() {
		this.bookList = getBookList();
	}
	
	public String toString() {
		String bookInfo = "";
		for (Book book: bookList) {
			bookInfo += book.getTitle() + ";" + " " + book.getAuthor() + "." + " \n";		
		}
		return bookInfo;
	}	
	
	public static void main(String[] args){
		
		LibraryTerminalApp library = new LibraryTerminalApp();
		
		boolean exit = false;
		do {
			System.out.println("Library Menu");
			System.out.println("------------");
			System.out.println("Select your option");
			
			System.out.println("1. Press 1 to see books List");
			System.out.println("2. Press 2 to ");
			
			Scanner scanner = new Scanner(System.in);
			String option = scanner.nextLine();
			
			switch(option) {
			
			case "1":
				
				System.out.println("Book List: \n" + library);
				
				break;
				
			case "2":
				break;
				
			case "3":
				break;
				
			default:
				break;
			
			}
			
		}while(!exit);
		
	}

}
