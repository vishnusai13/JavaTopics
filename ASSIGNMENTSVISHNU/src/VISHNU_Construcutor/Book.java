package VISHNU_Construcutor;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	double price;
	int edition;
	int year;

	Book(String title, String author, double price, int edition, int year) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.edition = edition;
		this.year = year;
	}

	Book(String title, String author) {
		this(title, author, 9.99, 1,2022);
	}
	Book(String title, String author, double price) {
		this(title, author, price, 1,1983);
	}
	Book() {
		this("Unknown", "Anonymous", 0.0, 1,1992);
	}
	void displayDetails() {
		System.out.println("Title : " + title);
		System.out.println("Author : " + author);
		System.out.println("Price : " + price);
		System.out.println("Edition : " + edition);
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book book1 = new Book("Death Note", "Tsugumi Ohba", 45.09, 3,2025);
		Book book2 = new Book("Aot", "Hajime Isayama", 95.0, 5,1832);
		Book book3 = new Book("Naruto", " Masashi Kishmioto", 55.75, 5,1993);
		Book book4 = new Book();
		System.out.println("Book 1:");
		book1.displayDetails();
		System.out.println("Book 2:");
		book2.displayDetails();
		System.out.println("Book 3:");
		book3.displayDetails();
		System.out.println("Book 4:");
		book4.displayDetails();
		sc.close();
	}
}
