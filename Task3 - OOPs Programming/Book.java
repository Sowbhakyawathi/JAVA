package Task3;

public class Book {
	 private int bookID;
	    private String title;
	    private String author;
	    private boolean isAvailable;

	    // Constructor
	    public Book(int bookID, String title, String author) {
	        this.bookID = bookID;
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true; // By default, new books are available
	    }

	    // Getters
	    public int getBookID() {
	        return bookID;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    // Method to mark the book as borrowed or returned
	    public void setAvailable(boolean available) {
	        isAvailable = available;
	    }

	    // Method to display book details
	    public void displayBook() {
	        System.out.println("Book ID: " + bookID);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
	        System.out.println("---------------------------");
	    }
	}
