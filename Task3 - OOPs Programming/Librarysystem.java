package Task3;

import java.util.Scanner;

public class Librarysystem {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Library library = new Library(10);

		int choice;
		do {
			System.out.println("Library System Menu:");
			System.out.println("1. Add a new book");
			System.out.println("2. Remove a book");
			System.out.println("3. Search for a book by ID");
			System.out.println("4. Display all books");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				System.out.print("Enter book ID: ");
				int bookID = scanner.nextInt();
				scanner.nextLine();
				System.out.print("Enter title: ");
				String title = scanner.nextLine();
				System.out.print("Enter author: ");
				String author = scanner.nextLine();
				Book newBook = new Book(bookID, title, author);
				library.addBook(newBook);
				break;
			case 2:
				System.out.print("Enter the book ID to remove: ");
				int removeID = scanner.nextInt();
				library.removeBook(removeID);
				break;
			case 3:
				System.out.print("Enter the book ID to search: ");
				int searchID = scanner.nextInt();
				library.searchBook(searchID);
				break;
			case 4:
				library.displayBooks();
				break;
			case 5:
				System.out.println("Exiting library system. Goodbye!");
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		} while (choice != 5);

		scanner.close();
	}
}
