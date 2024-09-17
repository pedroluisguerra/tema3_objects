package io.keepcoding.sampleterminalapp;

import java.util.Scanner;

public class SampleTerminalApp {

	public static void main(String[] args) {
		boolean exit = false;
		do {
			System.out.println("Menu");
			System.out.println("****");
			System.out.println("1. Option a");
			System.out.println("2. Option b");
			System.out.println("3. q to Quit");
			
			System.out.println("Introduce your option");
			
			Scanner scanner = new Scanner(System.in);
			String option = scanner.nextLine();
			
			switch(option.trim().toLowerCase()) {
			case "a":
				// manage option 1
				
				System.out.println("Option 1 selected");
				break;
			case "b":
				// manage option 2
				System.out.println("Option 2 selected");
				break;
			case "q":
				// manage to exit
				exit = true;
				break;
				
				default:
					System.out.println("Opción no reconocida");
					break;
			}			
			
		}while(!exit);
		
		System.out.println("Bye");

	}

}
