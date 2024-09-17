package io.keepcoding.sampleterminalapp;

import java.util.ArrayList;
import java.util.Scanner;

import io.keepcoding.library.model.*;

public class LibraryTerminalApp {

	private ArrayList<Book> bookList;

	public static ArrayList<Book> getBookList() {
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
		for (Book book : bookList) {
			bookInfo += book.getTitle() + ";" + " " + book.getAuthor() + "." + " \n";
		}
		return bookInfo;
	}

	public Book foundBook(String bookcode) {

		Book result = null;

		for (Book book : bookList) {
			if (book.getIsbn().equals(bookcode)) {
				result = book;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		LibraryTerminalApp library = new LibraryTerminalApp();

		boolean exit = false;
		do {
			System.out.println("Library Menu");
			System.out.println("------------");
			System.out.println("Select your option");

			System.out.println("1. Press 1 to see books List");
			System.out.println("2. Press 2 to search a book by code");
			System.out.println("3. Press q to exit");

			Scanner scanner = new Scanner(System.in);
			String option = scanner.nextLine();

			switch (option) {

			case "1":

				System.out.println("Book List: \n" + library);

				break;

			case "2":

				System.out.println("Please, introduce an isbn: ");
				String isbn = scanner.nextLine();
				String bookresult = "";
				Book foundbook = library.foundBook(isbn);
				
				 if (foundbook != null) {
					bookresult = "Book found!" + "; " + foundbook.getTitle();
				}
				
				else {
					bookresult = "Book not found :(, can you try again?";
				}
				
				System.out.println(bookresult);

				break;

			case "q":
				
				exit = true;
				
				break;

			default:
				
				System.out.println("Invalid option");
				break;

			}

		} while (!exit);
		
		System.out.println("Bye");

	}

}
