package myPrograms;

import java.util.Scanner;

public class geniusInput {

	public static void main(String[] args) {
		System.out.println("Hello, my name is Isaac, what is your favorite color?");

		// type identifier = new type();
		Scanner scanner = new Scanner(System.in);
		String color = scanner.nextLine();

		System.out.println("Thank you, I'll remember that your favorite color is " + color + ".");
		;
		
		System.out.println("");
		System.out.println("Hi, my name is Ajani, what is your name?");
		
		//type identifier = new type();
		Scanner scanner2 = new Scanner(System.in);
		String name = scanner2.nextLine();
		
		System.out.println("Nice to meet you " + name + ".");
		;
		
		System.out.println("");
		System.out.println("Hi, my name is Jordan, what is your favorite food?");
		
		//type identifier = new type();
		Scanner scanner3 = new Scanner(System.in);
		String food = scanner3.nextLine();
				
		System.out.println("Interesting, I'll remember that your favorite food is " + food + ".");
	}

}
